package apps.LinkedList;

import apps.SLLNode;

public class MyLinkedListForInteger {
    private SLLNode ls;
    private int numElements;

    public MyLinkedListForInteger() {
        ls = null;
        numElements = 0;
    }

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
