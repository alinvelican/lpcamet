package cool.ast;

import java.util.List;

public class BodyNode implements NodeBase {
    List<NodeBase> expresii;

    public BodyNode(List<NodeBase> expresii) {
        this.expresii = expresii;
    }

    @Override
    public void print(int level) {
        printSpace(level, "block");
        expresii.stream().forEach(x -> x.print(level + 2));
    }
}
