package cool.ast;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;


public class ClassNode implements NodeBase {
    List<TerminalNode> ids;
    List<NodeBase> features;

    public ClassNode(List<TerminalNode> ids, List<NodeBase> features) {
        this.ids = ids;
        this.features = features;
    }

    @Override
    public void print(int level) {
        printSpace(level, "class");
        ids.stream().forEach(x -> printSpace(level + 2, x.getText()));
        features.stream().filter(x -> x != null).forEach(x -> x.print(level + 2));
    }
}
