package javabasics1;

import java.util.Scanner;

public class SumProductMinMax3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1;
		int number2;
		int number3;
		
		int sum;
		int product;
		int min;
		int max;
		
		Scanner sc = new Scanner(System.in);
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		number3 = sc.nextInt();
		
		sc.close();
		
		sum= number1 + number2 + number3;
		product = number1*number2*number3;
		
		min = number1;
		if(number2<min) {
			min = number2;
		}
		if(number3<min) {
			min = number3;
		}
		
		max = number1;
		if(number2>max) {
			max = number2;
		}
		if(number3>max) {
			max = number3;
		}
		System.out.println("Enter 1st integer: "+ number1);
		System.out.println("Enter 2st integer: "+ number2);
		System.out.println("Enter 3st integer: "+ number3);
		System.out.println("The sum is: "+ sum);
		System.out.println("The product is: "+ product);
		System.out.println("The min is: "+ min);
		System.out.println("The max is: "+ max);
	}

}

//Enter the radius: 
//30
//Diameter is: 60,00
//Area is: 2827,43
//Circumference is: 188,50
