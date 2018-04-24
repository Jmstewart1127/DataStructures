package apps.LinkedList;

public class MyLinkedListDemo {

    public static void main(String[] args) {
        SLLNode<Integer> intNode = new SLLNode<>(5);
        MyLinkedList<Integer> ls1 = new MyLinkedList<Integer>();
        ls1.insertBeginning(intNode, 4);
        ls1.insertEnd(intNode, 10);
        ls1.insertEnd(intNode, 12);
        ls1.printLinkedList();

        System.out.println();

        SLLNode<String> stringNode = new SLLNode<String>("Hi");
        MyLinkedList<String> ls2 = new MyLinkedList<String>();
        ls2.insertBeginning(stringNode, "New Beginning");
        ls2.insertEnd(stringNode, "Added To End");
        ls2.insertEnd(stringNode, "Added To End Second");
        ls2.printLinkedList();
    }

}
