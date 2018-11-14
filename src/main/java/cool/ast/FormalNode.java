package cool.ast;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class FormalNode implements NodeBase {
    List<TerminalNode> ids;

    public FormalNode(List<TerminalNode> ids) {
        this.ids = ids;
    }

    @Override
    public void print(int level) {
        printSpace(level, "formal");
        ids.stream().forEach(x -> printSpace(level + 2, x.getText()));
    }
}
