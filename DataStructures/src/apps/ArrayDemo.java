package apps;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayDemo {

    static void generateNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i * 2;
        }
    }

    static int linearSearch(int[] nums, int number) {
        int loop_count = 0;
        for (int i = 0; i < nums.length; i++) {
            loop_count++;
            if (nums[i] == number) {
                System.out.println("l: " + loop_count + " index: " + i);
                return i;
            }
        }
        System.out.println("l: " + loop_count);
        return -1;
    }

    static int binarySearch(int[] nums, int val) {
        int start = 0;
        int end = nums.length - 1;
        int loop_count = 0;
        while (start <= end) {
            loop_count++;
            int midpoint = (start + end) / 2;
            if (val == nums[midpoint]) {
                System.out.println("b: " + loop_count + " " + midpoint);
                return midpoint;
            }
            if (val < nums[midpoint]) {
                end = midpoint - 1;
            } else {
                start = midpoint + 1;
            }
        }
        System.out.println("b: " + loop_count + " index: -1");
        return -1;
    }

    public static void main(String[] args) {
        String[] names = new String[] {"Jacob", "Michael", "Stewart", "Jordan", "Tony", "Robbins"};
        MyArrayForString stringHandler = new MyArrayForString(names);
        stringHandler.add("MasterBrue");
        stringHandler.printArray();
    }

}