package cool.ast;

import java.util.List;

public class IfWhileNode implements NodeBase {
    List<NodeBase> expresii;
    String what;

    public IfWhileNode(String what, List<NodeBase> expresii) {
        this.expresii = expresii;
        this.what = what;
    }

    @Override
    public void print(int level) {
        printSpace(level, what);
        expresii.stream().forEach(x -> x.print(level + 2));
    }
}
