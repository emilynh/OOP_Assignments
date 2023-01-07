package lab4;

import java.util.Scanner;

public class PrimeFactors {
    public static boolean isPrime(int n){
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
    public static boolean isProductOfPrimeFactors(int n){
        int product = 1;
        for(int i = 1; i <= n; i++){
            if(isPrime(i)){
                product = product * i;
            }
        }
        return product == n;
    }
    public static void getPrimeFactors(int theUpperBound) {
        int count = 0;
        System.out.println("These numbers are equal to the product of prime factors: ");
        for (int i = 1; i <= theUpperBound; i++) {
            if (isProductOfPrimeFactors(i)) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        double percent = 1.0 * count / theUpperBound;
        System.out.printf("%d numbers found (%f%%)", count, percent);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pls enter the upper bound: ");
        int theUpperBound = sc.nextInt();
        getPrimeFactors(theUpperBound);
    }
}
