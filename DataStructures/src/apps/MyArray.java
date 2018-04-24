package apps;

public class MyArray<T> {

    private T[] elements;
    private int numElement = 0;

    public MyArray() {
        elements = (T[])new Object[5];
    }

    public MyArray(int capSize) {
        this.elements = (T[])new Object[capSize];
    }

    public MyArray(T[] nums) {
        numElement = nums.length;
        elements = nums;
    }

    public void printArray() {
        for (int i = 0; i < numElement; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    public int search(T val) {
        return linearSearch(val);
    }

    private int linearSearch(T val) {
        for (int i = 0; i < numElement; i++) {
            if (elements[i] == val) {
                return i;
            }
        }
        return -1;
    }

    public void remove(T val) {
        int index = linearSearch(val);
        if (index >= 0) {
            elements[index] = elements[numElement - 1];
            numElement--;
        }
    }

    public void add(T val) {
        T[] newNumbers =  (T[])new Object[elements.length * 2];
        for (int i = 0; i < elements.length; i++) {
            newNumbers[i] = elements[i];
        }
        newNumbers[numElement++] = val;
        elements = newNumbers;
    }

    public int size() {
        return numElement;
    }

    public int capSize() {
        return elements.length;
    }


}
