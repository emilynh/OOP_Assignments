
import java.util.Scanner;

public class NumberGuess {

    public static void main(String[] args) {
        // final int SECRET_NUMBER = (int) (Math.random() * 100);
        int SECRET_NUMBER = (int) (Math.random() * 100);
        guess(SECRET_NUMBER);
    }

    public static void guess(int secretNumber) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Key in your guess: ");
        int guessingKey;
        int count = 0;
        do {
            guessingKey = sc.nextInt();
            if (guessingKey < secretNumber) {
                System.out.println("Try higher");
                count++;
            }
            if (guessingKey > secretNumber) {
                System.out.println("Try lower");
                count++;
            }
        } while (guessingKey != secretNumber);
        System.out.println("You got it in " + count + " trials!");
    }
}
