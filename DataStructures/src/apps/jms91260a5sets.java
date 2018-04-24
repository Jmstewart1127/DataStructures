/*cs 2400 Discrete Structures
    * Created By: Jake Stewart
    *
    * Assignment a5
    * This program allows the user to create 2 sets with numbers between the 1-20.
    * The program will find Union, intersection, and Difference between the two sets.
    * use 0 to end input for a set.
    *
    *******************************************************************************/
import java.util.Scanner;

public class jms91260a5sets {

    public static void main(String[] args)  {
        System.out.println("Enter the integers between 1 and 20 as set A (use 0 to end input): ");
        Scanner input = new Scanner(System.in);
        int element = input.nextInt();
        int[] setA = new int[21];
        while (element != 0) {
            setA[element] = 1;
            element = input.nextInt();
        }

        System.out.println("Enter the integers between 1 and 20 as set B (use 0 to end input): ");
        element = input.nextInt();
        int[] setB = new int[21];
        while (element != 0) {
            setB[element] = 1;
            element = input.nextInt();
        }
        AunionB(setA, setB);
        AintersectionB(setA, setB);
        AdifferenceB(setA, setB);
    }

    public static void AunionB(int[] A, int[] B) {
        int [] temp = new int[21];
        for (int i = 1; i<=20; i++) {
            if (A[i] == 1 || B[i] == 1) {
                temp[i]=1;
            }
        }
        System.out.println("The union of A and B is: ");
        printSet(temp);
    }
    public static void AintersectionB(int[] A, int[] B) {
        int [] temp = new int[21];
        for (int i = 1; i<=20; i++) {
            if (A[i]==1 && B[i]==1) {
                temp[i]=1;
            }
        }
        System.out.println("The intersection of A and B is: ");
        printSet(temp);
    }
    public static void AdifferenceB(int[] A, int[] B) {
        int [] temp = new int[21];
        for (int i = 1; i<=20; i++) {
            if (A[i]==1 && B[i]==0) {
                temp[i]=1;
            }
        }
        System.out.println("The Difference of A and B is: ");
        printSet(temp);
    }

    public static void printSet(int[] A) {
        for (int i =1; i<21; i++)
            if (A[i] != 0) {
                System.out.print(i + " ");
            }
        System.out.println();
    }
}