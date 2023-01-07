package javabasics1;
import java.util.Scanner;


public class ExtractDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n:");
		int n =sc.nextInt();
		while(n>0) {
			int digit = n%10;
			System.out.print(digit +" ");
			n=n/10;
		}
		sc.close();
			
	}

}
