package cool.ast;

import java.util.List;

public class ProgramNode implements NodeBase {
    public List<NodeBase> classes;

    public ProgramNode(List<NodeBase> classes) {
        this.classes = classes;
    }

    @Override
    public void print(int level) {
        System.out.println("program");
        classes.stream().forEach(x -> x.print(level + 1));
    }
}
