package apps.Queue;

import apps.Rectangle;

public class MyQueueDemo {
    public static void main(String[] args) {
        int[] numbers = new int[] {10, 1, -4, 5, 12, 7};
        String[] names = new String[] {"Jordan", "Jinnel", "Mylisa", "Marco"};
		int[] numbers2 = new int[] {10,20,30,40,50,60,70,80};
		int[] numbers3 = new int[1000000];

        MyQueueLL<Integer> numbers1 = new MyQueueLL<Integer>();
        numbers1.enqueue(10);
        numbers1.enqueue(5);
        numbers1.enqueue(-2);
        numbers1.enqueue(20);
        numbers1.enqueue(-4);
        System.out.println(numbers1.dequeue());
        numbers1.enqueue(-20);
        numbers1.printQueue();

		MyQueueLL<Rectangle> rectangles = new MyQueueLL<Rectangle>();
		rectangles.enqueue(new Rectangle(1.0, 2.0));
		rectangles.enqueue(new Rectangle(2.0, 3.0));
		rectangles.enqueue(new Rectangle(3.0, 2.0));
		rectangles.dequeue();
		rectangles.printQueue();
    }
}