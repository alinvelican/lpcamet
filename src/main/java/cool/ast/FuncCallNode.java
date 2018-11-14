package cool.ast;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class FuncCallNode implements NodeBase {
    TerminalNode id;
    List<NodeBase> expresii;

    public FuncCallNode(TerminalNode id, List<NodeBase> expresii) {
        this.id = id;
        this.expresii = expresii;
    }

    @Override
    public void print(int level) {
        printSpace(level, "implicit dispatch");
        printSpace(level + 2, id.getText());
        expresii.stream().forEach(x -> x.print(level + 2));
    }
}
