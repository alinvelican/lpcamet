package cool.ast;

import org.antlr.v4.runtime.tree.TerminalNode;

public class FirstEvalNode implements NodeBase {
    TerminalNode id;
    NodeBase expresie;

    public FirstEvalNode(TerminalNode id, NodeBase expresie) {
        this.id = id;
        this.expresie = expresie;
    }

    @Override
    public void print(int level) {
        printSpace(level, id.getText());
        expresie.print(level + 2);
    }
}
