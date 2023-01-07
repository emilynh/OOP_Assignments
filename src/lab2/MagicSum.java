package lab2;

import java.util.Scanner;

public class MagicSum {

    public static void main(String[] args) {
        final int SENTINEL = -1;
        int number;
        int magicSum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer (or -1 to end): ");
        number = input.nextInt();

        while (number != SENTINEL) {
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = input.nextInt();
            if (hasEight(number)) {
                magicSum += number;
            }
        }
        System.out.println("The magic sum is: " + magicSum);
    }

    public static boolean hasEight(int number) {
        int remnant;
        while (number > 0) {
            remnant = number % 10;
            if (remnant == 8) {
                return true;
            }
            number = number / 10;

        }
        return false;
    }
}
