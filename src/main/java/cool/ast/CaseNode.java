package cool.ast;


import java.util.List;

public class CaseNode implements NodeBase {
    NodeBase expresie;
    List<NodeBase> bodycases;

    public CaseNode(NodeBase expresie, List<NodeBase> bodycases) {
        this.expresie = expresie;
        this.bodycases = bodycases;
    }

    @Override
    public void print(int level) {
        printSpace(level, "case");
        expresie.print(level + 2);
        bodycases.stream().forEach(x -> x.print(level + 2));
    }
}
