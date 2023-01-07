package lab4;

import java.util.Scanner;

public class PrimeNumbers {
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static void getPrimeNumbers(int theUpperBound) {
        int count = 0;
        for (int i = 1; i <= theUpperBound; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println(i);
            }
        }
        double percent = 1.0 * count / theUpperBound;
        System.out.printf("%d primes found (%f%%)", count, percent);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pls enter the upper bound: ");
        int theUpperBound = sc.nextInt();
        getPrimeNumbers(theUpperBound);
    }
}
