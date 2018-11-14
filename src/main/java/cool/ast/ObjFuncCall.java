package cool.ast;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;
import java.util.Optional;

public class ObjFuncCall implements NodeBase {
    NodeBase firstExpr;
    Optional<TerminalNode> atId;
    TerminalNode punctId;
    List<NodeBase> expresii;

    public ObjFuncCall(NodeBase firstExpr, Optional<TerminalNode> atId, TerminalNode punctId, List<NodeBase> expresii) {
        this.firstExpr = firstExpr;
        this.atId = atId;
        this.punctId = punctId;
        this.expresii = expresii;
    }

    @Override
    public void print(int level) {
        printSpace(level, ".");
        firstExpr.print(level + 2);
        atId.ifPresent(x -> printSpace(level + 2, x.getText()));
        printSpace(level + 2, punctId.getText());
        expresii.remove(0);
        expresii.stream().forEach(x -> x.print(level + 2));
    }
}
