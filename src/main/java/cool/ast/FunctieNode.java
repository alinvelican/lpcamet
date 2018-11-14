package cool.ast;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class FunctieNode implements NodeBase {
    List<TerminalNode> ids;
    List<NodeBase> formals;
    NodeBase expresie;

    public FunctieNode(List<TerminalNode> ids, List<NodeBase> formals, NodeBase expresie) {
        this.ids = ids;
        this.formals = formals;
        this.expresie = expresie;
    }

    @Override
    public void print(int level) {
        printSpace(level, "method");
        printSpace(level + 2, ids.get(0).getText());
        formals.forEach(x -> x.print(level + 2));
        printSpace(level + 2, ids.get(1).getText());
        expresie.print(level + 2);


    }
}
