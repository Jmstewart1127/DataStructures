import java.util.Scanner;

public class jms91260a10recursion {

    static int factorial(int n) {
        return n<=1 ? 1 : n * factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a non negative integer: ");
        int number = in.nextInt();
        System.out.println(number + "! is " + factorial(number));
    }

}
