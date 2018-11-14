package cool.ast;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FinalNode implements NodeBase {
    TerminalNode terminalNode;

    public FinalNode(TerminalNode terminalNode) {
        this.terminalNode = terminalNode;
    }

    @Override
    public void print(int level) {
        String ceva = terminalNode.getText();
        ceva = ceva.replace("\\t", "\t");
        ceva = ceva.replace("\\n", "\n");

        List<Character> list = new ArrayList<>();
        char[] aa = ceva.toCharArray();

        if (ceva.contains("\\\\")) {


            printSpace(level, ceva.replace("\"", "").replace("\\\\", "\\"));
            return;
        }


        for (Character c : aa) {
            if (c == '\\') {
                continue;
            }
            list.add(c);

        }


        printSpace(level, list.stream().map(e -> e.toString()).collect(Collectors.joining()).replace("\"", ""));

    }
}
