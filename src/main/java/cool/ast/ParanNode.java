package cool.ast;

public class ParanNode implements NodeBase {
    NodeBase expresie;

    public ParanNode(NodeBase expresie) {
        this.expresie = expresie;
    }

    @Override
    public void print(int level) {
        expresie.print(level);
    }
}
