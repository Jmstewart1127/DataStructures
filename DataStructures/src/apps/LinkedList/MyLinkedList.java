package apps.LinkedList;

public class MyLinkedList<T> {

    private SLLNode<T> ls;
    private int numElements;

    public MyLinkedList() {
        ls = null;
        numElements = 0;
    }

    public SLLNode<T> search(T val) {
        SLLNode<T> curNode = ls;
        while (curNode != null) {
            if (curNode.info.equals(val)) {
                return curNode;
            }
            curNode = curNode.next;
        }
        return null;
    }

    public void printLinkedList() {
        SLLNode<T> node = ls;
        while (node != null) {
            System.out.println(node.info);
            node = node.next;
        }
    }

    public void insertBeginning(SLLNode<T> node, T val) {
        SLLNode<T> newNode = new SLLNode<T>(val);
        newNode.next = node;
        ls = newNode;
    }

    public void insertEnd(SLLNode<T> node, T val) {
        SLLNode<T> newNode = new SLLNode<>(val);
        if (node == null) {
            node = new SLLNode<>(val);
            ls = node;
        } else {
            SLLNode<T> curNode = node;
            while (curNode.next != null) {
                curNode = curNode.next;
            }
            curNode.next = newNode;
        }
        ls = node;
    }

//    public void insertBeginning(T val) {
//        SLLNode<T> newNode = new SLLNode<T>(val);
//        newNode.next = ls;
//        ls = newNode;
//    }
//
//    public void insertEnd(T val) {
//        SLLNode<T> node = ls;
//        while (node != null) {
//            node = node.next;
//            if (node.next == null) {
//                SLLNode<T> node1 = new SLLNode<T>(val);
//                node.next = node1;
//                break;
//            }
//        }
//    }

}
