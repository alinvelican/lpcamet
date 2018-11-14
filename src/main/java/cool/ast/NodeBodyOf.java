package cool.ast;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Optional;

public class NodeBodyOf implements NodeBase {
    String ceva;
    TerminalNode id;
    TerminalNode type;
    Optional<NodeBase> expresie;

    public NodeBodyOf(String ceva, TerminalNode id, TerminalNode type, Optional<NodeBase> expresie) {
        this.ceva = ceva;
        this.id = id;
        this.type = type;
        this.expresie = expresie;
    }

    @Override
    public void print(int level) {
        printSpace(level, ceva);
        printSpace(level + 2, id.getText());
        printSpace(level + 2, type.getText());
        expresie.ifPresent(x -> x.print(level + 2));
    }
}
