package javabasics1;
import java.util.Scanner;

public class AverageWithInputValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int NUM_STUDENTS = 3;
		int numberIn;
		boolean isValid;
		int sum = 0;
		double average;
		for (int studentNo = 1; studentNo <= NUM_STUDENTS; studentNo++) {
			System.out.println("Enter the mark (0-100) for student " + studentNo + " :");
			numberIn = Integer.parseInt(sc.nextLine());
			isValid = false;
//			sc.close();
			do {
				if(numberIn >= 0 && numberIn <= 100) {
//					sum += numberIn;
//					average = sum/NUM_STUDENTS;
//					System.out.println("The average is: " + average);
					isValid = true;
				}else {
					System.out.println("Invalid input, try again...");
				}
			}while(!isValid);
			
			sum += numberIn;
		}
		average = sum/NUM_STUDENTS;
		System.out.println("The average is: " + average);
	}
	
}

//Enter the mark (0-100) for student 1 :
//100
//Enter the mark (0-100) for student 2 :
//40
//Enter the mark (0-100) for student 3 :
//10
//The average is: 50.0
