package apps;

public class MyArrayForInteger {

    private int[] elements;
    private int numElement = 0;

    public MyArrayForInteger() {
        elements = new int[5];
    }

    public MyArrayForInteger(int capSize) {
        this.elements = new int[capSize];
    }

    public MyArrayForInteger(int[] nums) {
        numElement = nums.length;
        elements = nums;
    }

    public void printArray() {
        for (int i = 0; i < numElement; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    public int search(int val) {
        return linearSearch(val);
    }

    private int linearSearch(int val) {
        for (int i = 0; i < numElement; i++) {
            if (elements[i] == val) {
                return i;
            }
        }
        return -1;
    }

    public void remove(int val) {
        int index = linearSearch(val);
        if (index >= 0) {
            elements[index] = elements[numElement - 1];
            numElement--;
        }
    }

    public void add(int val) {
        int[] newNumbers = new int[elements.length * 2];
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

    public int capsize() {
        return elements.length;
    }
}
