package javabasics1;
import java.util.Scanner;

public class InputValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 0-10 of 90-100: ");
		int numberIn = Integer.parseInt(sc.nextLine());
		sc.close();
		boolean isValid;
		
		isValid = false;
		do {
			if((numberIn > 0 && numberIn < 10) || (numberIn > 90 && numberIn < 100) ) {
				isValid = true;
				System.out.println("You have entered: " + numberIn);
			}else {
				System.out.println("Invalid input, try agian...");
				break;
			}
		}while(!isValid);
	}

}
//Enter a number between 0-10 of 90-100: 
//2
//You have entered: 2