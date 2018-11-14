package cool.ast;

public interface NodeBase {

    default void printSpace(int level, String what) {
        for (int i = 0; i < level; i++) {
            System.out.print(" ");
        }
        System.out.println(what);
    }

    void print(int level);
}
