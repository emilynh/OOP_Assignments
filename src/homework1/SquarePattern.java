package homework1;
import java.util.Scanner;

public class SquarePattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size = Integer.parseInt(sc.nextLine());
		sc.close();
		for(int row = 1; row <= size; row++) {
			for(int col = 1; col <= size; col++) {
				System.out.print("#");
			}
			System.out.println("#");
		}
	}

}
//Enter the size: 
//5
//######
//######
//######
//######
//######