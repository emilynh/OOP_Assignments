package javabasics1;
import java.util.Scanner;

public class ReverseInt {
	public static void main(String[] args) {
		int inNumber;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive integer: ");
		inNumber = Integer.parseInt(sc.nextLine());
		sc.close();
		int inDigit = 0;
		int reverseNumber = 0;
		while (inNumber > 0) {
			inDigit = inNumber % 10;
			reverseNumber = reverseNumber * 10 + inDigit;
			inNumber /= 10;
			
		}
		System.out.println("The reverse is: " + reverseNumber);
	}

}
