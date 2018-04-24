package apps;

public class SLLNode {

    int info;
    SLLNode next;

    public SLLNode(int val) {
        info = val;
        next = null;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public SLLNode getNext() {
        return next;
    }

    public void setNext(SLLNode next) {
        this.next = next;
    }
}
