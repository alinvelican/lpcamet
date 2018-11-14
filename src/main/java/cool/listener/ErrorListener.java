package cool.listener;

import cool.parser.CoolLexer;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

import java.io.File;

public class ErrorListener extends BaseErrorListener {
    public boolean errors = false;
    private String fileName;

    public ErrorListener(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e) {
        String newMsg = "\"" + new File(fileName).getName() + "\", line " +
                line + ":" + charPositionInLine + ", ";

        Token token = (Token) offendingSymbol;
        if (token.getType() == CoolLexer.ERROR)
            newMsg += "Lexical error: " + token.getText();
        else
            newMsg += "Syntax error: " + msg;

        System.err.println(newMsg);
        errors = true;

    }
};