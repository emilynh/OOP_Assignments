package homework1;
import java.util.Scanner;

public class BoxPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size = Integer.parseInt(sc.nextLine());
		sc.close();
		
		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= size; col++) {
				if (row == 1|| row == size || col == 1|| col == size) {
					System.out.print("# ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= size; col++) {
				if (row == 1 || row == size || col == row) {
					System.out.print("# ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
