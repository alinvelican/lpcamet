package cool.ast;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;
import java.util.Optional;

public class AtributeNode implements NodeBase {
    List<TerminalNode> ids;
    Optional<NodeBase> expresie;

    public AtributeNode(List<TerminalNode> ids, Optional<NodeBase> expresie) {
        this.ids = ids;
        this.expresie = expresie;
    }

    @Override
    public void print(int level) {
        printSpace(level, "attribute");
        printSpace(level + 2, ids.get(0).getText());
        printSpace(level + 2, ids.get(1).getText());
        expresie.ifPresent(x -> x.print(level + 2));
    }
}
