package apps;

public class MyArrayForChar {

    private char[] elements;
    private int numElement = 0;

    public MyArrayForChar() {
        elements = new char[5];
    }

    public MyArrayForChar(int capSize) {
        this.elements = new char[capSize];
    }

    public MyArrayForChar(char[] nums) {
        numElement = nums.length;
        elements = nums;
    }

    public void printArray() {
        for (int i = 0; i < numElement; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    public int search(char val) {
        return linearSearch(val);
    }

    private int linearSearch(char val) {
        for (int i = 0; i < numElement; i++) {
            if (elements[i] == val) {
                return i;
            }
        }
        return -1;
    }

    public void remove(char val) {
        int index = linearSearch(val);
        if (index >= 0) {
            elements[index] = elements[numElement - 1];
            numElement--;
        }
    }

    public void add(char val) {
        char[] newNumbers = new char[elements.length * 2];
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
