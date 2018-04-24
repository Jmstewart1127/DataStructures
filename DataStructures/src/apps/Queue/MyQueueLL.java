package apps.Queue;

public class MyQueueLL<T> {
    int numElements;
    SLLNode<T> front;
    SLLNode<T> rear;
    public MyQueueLL() {
        front = null;
        rear = null;
        numElements = 0;
    }

    public void printQueue() {
		SLLNode<T> curNode = front;
		while (curNode != null) {
			System.out.print(curNode.info+" ");
			curNode = curNode.next;
		}
		System.out.println();
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
        numElements++;
        return 1;
    }

    public T dequeue() {
        if (front != null) {
            SLLNode<T> frontToReturn = front;
            front = front.next;
            numElements--;
            return frontToReturn.info;
        }
        return null;
    }
}