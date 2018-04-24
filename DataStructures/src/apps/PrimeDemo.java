package apps;

import java.util.Scanner;

public class PrimeDemo {

    static boolean isPrime(int n) {
        if (n == 2) return true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void displayPrimesLessThan(int maxN) {
        for (int i = 0; i < maxN; i++) {
            if (i == 0 || i == 1) {
                System.out.print("");
            }
            else if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n to display prime numbers up to n");
        int primeNumberCeiling = in.nextInt();
        System.out.println("Prime numbers less than " + primeNumberCeiling + " are...");
        displayPrimesLessThan(primeNumberCeiling);
    }
}

