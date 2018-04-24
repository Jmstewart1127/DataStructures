package apps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SoryArrayLeastToGreatestHR {

    static void countingSort(int[] arr) {
        ArrayList<Integer>listOfSortedNumbers = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            listOfSortedNumbers.add(arr[i]);
        }
        Collections.sort(listOfSortedNumbers);
            for (Integer num : listOfSortedNumbers) {
                System.out.print(num + " ");
            }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        countingSort(arr);
    }
}
