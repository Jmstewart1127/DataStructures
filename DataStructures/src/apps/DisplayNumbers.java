package apps;

import java.util.Scanner;

public class DisplayNumbers {

    static void displayFromTo(int start, int end) {
        System.out.println("Display from " + start + " to " + end + "...");
        int total = 0;
        for (int i = start; i <= end; i++) {
            total++;
            System.out.print(i + "\t");
            if (total % 5 == 0) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter starting integer");
        int start = in.nextInt();
        System.out.println("Enter ending integer");
        int end = in.nextInt();
        displayFromTo(start, end);
    }

}
