package exam;

import java.util.*;

public class PairSumDemo {
    static boolean pairSum(int[] nums, int targetSum) {
        // returns true if any selection of two elements (without repetition)
        // is equals to targetSum. returns false otherwise.

        /******************************
         for each number n,
         if another element (targetSum - n) exists in the array, return true.
         no such case happened. return false
         ******************************/
        HashMap<Integer, Integer> hm = new HashMap<>();
        int appearsTwice = 0;
        for (int i=0; i<nums.length; i++) {
            if(!hm.containsKey(nums[i]))
                hm.put(nums[i],0);
            hm.put(nums[i], hm.get(nums[i])+1);
        }
        for (int i=0; i<nums.length; i++) {
            if(hm.get(targetSum-nums[i]) != null)
                appearsTwice += hm.get(targetSum-nums[i]);
            if (targetSum-nums[i] == nums[i])
                appearsTwice--;
        }
        return appearsTwice/2 == 1 ? true : false;
    }
    public static void main(String[] args) {
        System.out.println(pairSum(new int[]{2,5,6,10}, 11));	// true. 5,6
        System.out.println(pairSum(new int[]{2,5,5,6}, 10));	// true. 5,5
        System.out.println(pairSum(new int[]{2,5,6}, 10));	// false. 5 can NOT be selected twice
        System.out.println(pairSum(new int[]{2,5,9,10}, 11));	// true. 2,9
        System.out.println(pairSum(new int[]{1,2,3,10}, 11));	// true. 1,10
        System.out.println(pairSum(new int[]{1,2,3,8}, 11));	// true. 3,8
    }
}