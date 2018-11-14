package cool.ast;

import org.antlr.v4.runtime.tree.TerminalNode;

public class ExpresieNode implements NodeBase {
    TerminalNode ceva;

    public ExpresieNode(TerminalNode ceva) {
        this.ceva = ceva;
    }

    @Override
    public void print(int level) {
        printSpace(level, ceva.getText().replaceAll("\"", ""));
    }
}
