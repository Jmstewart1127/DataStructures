package apps.Queue;

public class SLLNode<T> {
    T info;
    SLLNode<T> next;

    public SLLNode(T val) {
        info = val;
        next = null;
    }

}
