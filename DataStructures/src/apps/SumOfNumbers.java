package apps;

import java.util.Scanner;

public class SumOfNumbers {

    static void sumFromTo(int start, int end) {
        System.out.println("Sum from " + start + " to " + end + "...");
        int total = 0;
        for (int i = start; i <= end; i++) {
            total += i;
        }
        System.out.println(total);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter starting integer");
        int start = in.nextInt();
        System.out.println("Enter ending integer");
        int end = in.nextInt();
        sumFromTo(start, end);
    }
}
