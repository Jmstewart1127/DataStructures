package apps;

import java.util.Arrays;

public class MyArraySortedForChar {
    private char[] numbers;
    private int numElements = 0;
    public MyArraySortedForChar() {
        numbers = new char[5];
    }
    public MyArraySortedForChar(int capsize){
        numbers = new char[capsize];
    }
    public MyArraySortedForChar(char[] nums){
        numbers = new char[nums.length];
        for(int i=0; i<nums.length; i++)
            this.add(nums[i]);
    }
    public void printArray(){
        System.out.print("printArray(): ");
        for(int i=0; i<numElements; i++)
            System.out.print(numbers[i]+" ");
        System.out.println();
    }
    public int search(int val) {
        return binarySearch(val);
    }
    int binarySearch(int val) {
        int start = 0;
        int end = numbers.length-1;
        while(start <= end){
            int midpoint = (start + end)/2;
            if(val == numbers[midpoint])
                return midpoint;
            if (val < numbers[midpoint])
                end = midpoint - 1;
            else
                start = midpoint + 1;
        }
        return -1;
    }

    public void remove(char val) {
        int index = binarySearch(val);
        if (index >= 0) {
//			numbers[index] = numbers[numElements-1];
            for(int i=index; i<numElements-1; i++)
                numbers[i] = numbers[i+1];
            numElements--;
        }
    }
    private void enlarge() {
        char[] new_numbers = new char[2*numbers.length];
        for(int i=0; i<numbers.length;i++)
            new_numbers[i] = numbers[i];
        numbers = new_numbers;
    }
    public void add(char val) {
        // if numbers is full, then you need to increase the size.
        if (numbers.length == numElements)
            enlarge();
        int i = numElements -1;
        while (i>=0 && numbers[i] > val) {
            numbers[i+1] = numbers[i];
            i--;
        }
        numbers[i+1] = val;
        numElements++;
    }

    public int size() { return numElements; }
    public int capsize() { return numbers.length; }
}

