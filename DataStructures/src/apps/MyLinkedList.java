package apps;

public class MyLinkedList {

    private SLLNode ls;
    private int numElements;

    public MyLinkedList() {
        ls = null;
        numElements = 0;
    }
/***********************************************************
 *
 *   I created these methods before Wednesday's class.
 *   I did not read the instructions, but wanted to leave these methods.
 *
* **********************************************************/
//    public void generate1() {
//        SLLNode ls1 = null;
//        for (int i = 30; i > 0; i-=10) {
//            SLLNode node = new SLLNode(i);
//            node.setNext(ls1);
//            ls1 = node;
//        }
//        ls = ls1;
//    }
//    public void generate2() {
//        SLLNode ls1 = null;
//        for (int i = 3; i > -4; i--) {
//            SLLNode node = new SLLNode(i);
//            node.setNext(ls1);
//            ls1 = node;
//        }
//        ls = ls1;
//    }
//    public void add1ToElements() {
//        SLLNode node = ls;
//        while (node != null) {
//            int plusOne = node.getInfo() + 1;
//            node.setInfo(plusOne);
//            node = node.getNext();
//        }
//    }
//    public void insertBeginning(int val) {
//        SLLNode newNode = new SLLNode(val);
//        newNode.setNext(ls);
//        ls = newNode;
//    }
//
//    public void insertEnd(int val) {
//        SLLNode node = ls;
//        while (node != null) {
//            node = node.getNext();
//            if (node.getNext() == null) {
//                SLLNode node1 = new SLLNode(val);
//                node.setNext(node1);
//                break;
//            }
//        }
//    }

    public SLLNode search(int val) {
        SLLNode curNode = ls;
        while (curNode != null) {
            if (curNode.getInfo() == val) {
                return curNode;
            }
            curNode = curNode.getNext();
        }
        return null;
    }

    public void generateOddNumbersLessThan(int maxN) {
        SLLNode ls1 = null;
        for (int i = 1; i < maxN; i+=2) {
            SLLNode node = new SLLNode(i);
            node.setNext(ls1);
            ls1 = node;
        }
        ls = ls1;
    }

    public void printLinkedList() {
        SLLNode node = ls;
        while (node != null) {
            System.out.println(node.getInfo());
            node = node.getNext();
        }
    }

}
