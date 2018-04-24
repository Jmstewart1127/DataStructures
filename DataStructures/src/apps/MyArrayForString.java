package apps;

public class MyArrayForString {

    private String[] elements;
    private int numElement = 0;

    public MyArrayForString() {
        elements = new String[5];
    }

    public MyArrayForString(int capSize) {
        this.elements = new String[capSize];
    }

    public MyArrayForString(String[] nums) {
        numElement = nums.length;
        elements = nums;
    }

    public void printArray() {
        for (int i = 0; i < numElement; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    public int search(String val) {
        return linearSearch(val);
    }

    private int linearSearch(String val) {
        for (int i = 0; i < numElement; i++) {
            if (elements[i].equals(val)) {
                return i;
            }
        }
        return -1;
    }

    public void remove(String val) {
        int index = linearSearch(val);
        if (index >= 0) {
            elements[index] = elements[numElement - 1];
            numElement--;
        }
    }

    public void add(String val) {
        String[] newNames = new String[elements.length * 2];
        for (int i = 0; i < elements.length; i++) {
            newNames[i] = elements[i];
        }
        newNames[numElement++] = val;
        elements = newNames;
    }

    public int size() {
        return numElement;
    }

    public int capSize() {
        return elements.length;
    }


}
