package homework1;
import java.util.Scanner;


public class CountVowelsDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString;
		int stringLength;
		int numberOfDigit = 0;
		int numberOfVowel = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		inputString = sc.nextLine();
		sc.close();
		
		stringLength = inputString.length();
		
		for(int indexOfChar = 0; indexOfChar <= stringLength - 1; indexOfChar++) {
			if(inputString.charAt(indexOfChar) >= '0' && inputString.charAt(indexOfChar) <= '9') {
				numberOfDigit += 1;
			}
			if (inputString.toLowerCase().charAt(indexOfChar) == 'a' || inputString.charAt(indexOfChar) == 'e' || inputString.charAt(indexOfChar) == 'i'|| inputString.charAt(indexOfChar) == 'o' || inputString.charAt(indexOfChar) == 'u') {
				numberOfVowel += 1;
			}
		}
		float resultVowel = ((float)numberOfVowel/stringLength)*100;
		float resultDigit = ((float)numberOfDigit/stringLength)*100;
				
		
		System.out.printf("Number of vowels %.3f %n", resultVowel);
		System.out.printf("Number of digits %.3f %n", resultDigit);
	}

}

//Enter the string: 
//testing12345
//Number of vowels: 2(16.667)
//Number of digits: 5(41.667)