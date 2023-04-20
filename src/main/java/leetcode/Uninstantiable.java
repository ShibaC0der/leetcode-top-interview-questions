package leetcode;

public abstract class Uninstantiable {
    public Uninstantiable() {
        throw new IllegalStateException();
    }
}
