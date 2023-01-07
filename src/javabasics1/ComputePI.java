package javabasics1;
import java.util.Scanner;

public class ComputePI {
	public static void main(String[] args) {
		
		double sum = 0.0;
		double pi = 0.0;
		
		Scanner scan = new Scanner(System.in);
		scan.close();
		
		System.out.println("Enter MAX_DENOMINATOR: ");
		int MAX_DENOMINATOR = Integer.parseInt(scan.nextLine());
		
		for( int denominator = 1; denominator <= MAX_DENOMINATOR; denominator+=2) {
			if(denominator % 4 == 1) {
				sum += 1/((double)(denominator));
			}else if(denominator % 4 == 3) {
				sum -= 1/((double)(denominator));
			}else {
				System.out.println("Impossible!!!");
			}
		}
		pi = 4*sum;
		System.out.println(pi);
	}

}

//Enter MAX_DENOMINATOR: 
//1000000
//3.141590653589692