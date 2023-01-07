package homework1;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inStr;
		int inStrLen;
		String result = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		inStr = sc.next();
		sc.close();
		inStrLen = inStr.length();
		
		for(int charIdx = inStrLen - 1; charIdx >=0; charIdx--) {
			result += inStr.charAt(charIdx);
		}
		
		System.out.println("The reverse of the entered string is: " + result);

	}

}

//Enter a string: 
//abc
//The reverse of the entered string is: cba