package cool.ast;

import java.util.List;

public class LetNode implements NodeBase {
    List<NodeBase> letbodys;
    NodeBase expresie;

    public LetNode(List<NodeBase> letbodys, NodeBase expresie) {
        this.letbodys = letbodys;
        this.expresie = expresie;
    }

    @Override
    public void print(int level) {
        printSpace(level, "let");
        letbodys.stream().forEach(x -> x.print(level + 2));
        expresie.print(level + 2);


    }
}
