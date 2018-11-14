package cool.ast;

import org.antlr.v4.runtime.tree.TerminalNode;

public class AtribuireNode implements NodeBase {
    TerminalNode id;
    NodeBase expresie;

    public AtribuireNode(TerminalNode id, NodeBase expresie) {
        this.id = id;
        this.expresie = expresie;
    }

    @Override
    public void print(int level) {
        printSpace(level, "<-");
        printSpace(level + 2, id.getText());
        expresie.print(level + 2);
    }
}
