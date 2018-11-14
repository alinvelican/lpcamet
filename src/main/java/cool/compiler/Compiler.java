package cool.compiler;

import cool.ast.NodeBase;
import cool.listener.ErrorListener;
import cool.parser.CoolLexer;
import cool.parser.CoolParser;
import cool.visitor.Visitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.io.IOException;


public class Compiler {
    public static ParseTreeProperty<String> fileNames = new ParseTreeProperty<>();
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.err.println("No file(s) given");
            return;
        }
        CoolLexer lexer = null;
        CommonTokenStream tokenStream = null;
        CoolParser parser = null;
        ParserRuleContext globalTree = null;
        boolean lexicalSyntaxErrors = false;

        for (var fileName : args) {
            var input = CharStreams.fromFileName(fileName);
            if (lexer == null)
                lexer = new CoolLexer(input);
            else
                lexer.setInputStream(input);
            if (tokenStream == null)
                tokenStream = new CommonTokenStream(lexer);
            else
                tokenStream.setTokenSource(lexer);
            if (parser == null)
                parser = new CoolParser(tokenStream);
            else
                parser.setTokenStream(tokenStream);
            var errorListener = new ErrorListener(fileName);
            parser.removeErrorListeners();
            parser.addErrorListener(errorListener);
            var tree = parser.program();
            if (globalTree == null)
                globalTree = tree;
            else
                for (int i = 0; i < tree.getChildCount(); i++)
                    globalTree.addAnyChild(tree.getChild(i));
            for (int i = 0; i < tree.getChildCount(); i++) {
                var child = tree.getChild(i);
                if (child instanceof ParserRuleContext)
                    fileNames.put(child, fileName);
            }
            lexicalSyntaxErrors |= errorListener.errors;
            // Stop before semantic analysis phase, in case errors occurred.
            if (lexicalSyntaxErrors) {
                System.err.println("Compilation halted");
                return;
            }
            var visitor = new Visitor();
            NodeBase nodeBase = visitor.visit(tree);
            nodeBase.print(1);


        }


    }
}
