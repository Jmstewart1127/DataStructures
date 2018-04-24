package apps.BinaryTree;

public class BSTNode<T extends Comparable> {
    public T info;
    public BSTNode<T> left;
    public BSTNode<T> right;

    public BSTNode(T val) {
        info = val;
        left = null;
        right = null;
    }


}
