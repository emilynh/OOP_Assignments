package homework1;
import java.util.Scanner;

public class Oct2Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Octal string: ");
		int octal = Integer.parseInt(sc.next());
		sc.close();
		
		int decimalNumber = 0, i = 0;

	        while(octal != 0)
	        {
	            decimalNumber += (octal % 10) * Math.pow(8, i);
	            ++i;
	            octal/=10;
	        }

	       System.out.println("The equivalent decimal is " + decimalNumber);
	}

}
