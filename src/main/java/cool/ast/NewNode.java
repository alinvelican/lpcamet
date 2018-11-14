package cool.ast;

import org.antlr.v4.runtime.tree.TerminalNode;

public class NewNode implements NodeBase {
    TerminalNode id;

    public NewNode(TerminalNode id) {
        this.id = id;
    }

    @Override
    public void print(int level) {
        printSpace(level, "new");
        printSpace(level + 2, id.getText());
    }
}
