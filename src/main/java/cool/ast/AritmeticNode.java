package cool.ast;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class AritmeticNode implements NodeBase {
    TerminalNode semn;
    List<NodeBase> expresii;

    public AritmeticNode(TerminalNode semn, List<NodeBase> expresii) {
        this.semn = semn;
        this.expresii = expresii;
    }

    @Override
    public void print(int level) {
        printSpace(level, semn.getText());
        expresii.get(0).print(level + 2);
        expresii.get(1).print(level + 2);


    }
}
