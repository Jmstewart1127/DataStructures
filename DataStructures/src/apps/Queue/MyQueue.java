package apps.Queue;

public class MyQueue<T> {
    private T[] elements;
    private int numElement = 0;
    private SLLNode<T> front = null;
    private SLLNode<T> rear = null;

    public MyQueue() {
        elements = (T[])new Object[5];
    }

    public MyQueue(int capSize) {
        this.elements = (T[])new Object[capSize];
    }

    public MyQueue(T[] nums) {
        numElement = nums.length;
        elements = nums;
    }

    public void add(T val) {
        enqueue(val);
    }

    public void remove(T val) {

    }

    public SLLNode<T> search(T val) {
        SLLNode<T> curNode = front;
        while (curNode != null) {
            if (curNode.info.equals(val)) {
                return curNode;
            }
            curNode = curNode.next;
        }
        return null;
    }

    public void printArray() {
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    public void printQueue() {
        SLLNode<T> curNode = front;
        while (curNode != null) {
            System.out.print(curNode.info+" ");
            curNode = curNode.next;
        }
        System.out.println();
    }

    public SLLNode<T> dequeue() {
        if (front != null) {
            SLLNode<T> frontToReturn = front;
            front = front.next;
            numElement--;
            return frontToReturn;
        }
        return null;
    }

    public int enqueue(T val) {
        SLLNode<T> newNode = new SLLNode<T>(val);
        if (rear == null) {
            rear = newNode;
            front = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        numElement++;
        return 1;
    }

    public int size() {
        return numElement;
    }

    public int capSize() {
        return elements.length;
    }

}
