package apps;

public class SLLNodeDemo2 {

    static void printLinkedList(SLLNode node) {
        while (node != null) {
            System.out.print(node.info+" ");
            node = node.next;
        }
        System.out.println();
    }
    static SLLNode generateOddNumbersLessThan(int maxN) {
        SLLNode ls = null;
        SLLNode node;
        for(int i=1;i<maxN;i+=2) {
            node = new SLLNode(i);
            node.next = ls;
            ls = node;
        }
        return ls;
    }
    static SLLNode generate1() {
        SLLNode ls1 = null;
        for (int i = 30; i > 0; i-=10) {
            SLLNode node = new SLLNode(i);
            node.next = ls1;
            ls1 = node;
        }
        return ls1;
    }
    static SLLNode generate2() {
        SLLNode ls1 = null;
        for (int i = 3; i > -4; i--) {
            SLLNode node = new SLLNode(i);
            node.next = ls1;
            ls1 = node;
        }
        return ls1;
    }
    static void add1ToElements(SLLNode node) {
        while (node != null) {
            int plusOne = node.info + 1;
            node.info = plusOne;
            node = node.next;
        }
    }
    static SLLNode insertBeginning(SLLNode node, int val) {
        SLLNode newNode = new SLLNode(val);
        newNode.next = node;
        return newNode;
    }
    static SLLNode insertEnd(SLLNode node, int val) {
        SLLNode newNode = new SLLNode(val);
        if (node == null) {
            node = new SLLNode(val);
            return node;
        } else {
            SLLNode curNode = node;
            while (curNode.next != null) {
                curNode = curNode.next;
            }
            curNode.next = newNode;
        }
        return node;
    }

    public static void main(String[] args) {
        SLLNode ls;
        ls = generateOddNumbersLessThan(12);
        printLinkedList(ls);
        ls = generate1();
        printLinkedList(ls);
        ls = generate2();
        printLinkedList(ls);
        add1ToElements(ls);
        printLinkedList(ls);
        ls = insertBeginning(ls,100);
        printLinkedList(ls);
        ls = insertEnd(ls,200);
        printLinkedList(ls);
        ls = insertEnd(null,300);
        printLinkedList(ls);
    }
}