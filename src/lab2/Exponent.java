package lab2;

import java.util.Scanner;

public class Exponent {

    public static void main(String[] args) {
        int base;
        int exp;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base: ");
        base = Integer.parseInt(input.next());

        System.out.print("Enter the exponent: ");
        do {
            exp = Integer.parseInt(input.next());
        } while (exp < 0);

        input.close();

        System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base, exp));

    }

    public static int exponent(int base, int exp) {
        int product = 1;
        for (int i = 0; i < exp; i++) {
            product *= base;
        }
        return product;
    }
}
