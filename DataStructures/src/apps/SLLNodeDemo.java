package apps;

public class SLLNodeDemo {

    static void printLinkedList(SLLNode node) {
        while (node != null) {
            System.out.println(node.getInfo());
            node = node.getNext();
        }
    }

    static SLLNode generateOddNumbersLessThan(int maxN) {
        SLLNode ls = null;
        for (int i = 1; i < maxN; i+=2) {
            SLLNode node = new SLLNode(i);
            node.setNext(ls);
            ls = node;
        }
        return ls;
    }

    public static void main(String[] args) {
//        SLLNode ls = null;
//        SLLNode node1 = new SLLNode(2);
//        SLLNode node2 = new SLLNode(3);
//        SLLNode node3 = new SLLNode(4);
//        SLLNode node4 = new SLLNode(5);
//
//        node1.setNext(node2);
//        node2.setNext(node3);
//        node4.setNext(node1);
//        printLinkedList(node4);
        SLLNode ls1 = generateOddNumbersLessThan(10);
        printLinkedList(ls1);
    }

}
