package homework1;
import java.util.Scanner;

public class TriangularPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size = Integer.parseInt(sc.nextLine());
		sc.close();
		
		
		// pattern a
		System.out.println("pattern a");
		for(int row = 1; row <= size; row++)
		{
			for(int col = 1; col <= size; col++) {
				if(row >= col) {
					System.out.print("# ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("pattern b");
		//pattern b
		for(int row = 1; row <= size; row++) {
			for(int col = 1; col <= size; col++) {
				if(row + col <= size + 1) {
					System.out.print("# ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		//pattern c
		System.out.println("pattern c");
		//pattern b
		for(int row = 1; row <= size; row++) {
			for(int col = 1; col <= size; col++) {
				if(row >= col) {
					System.out.print("# ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		// pattern d
		System.out.println("pattern d");
		//pattern b
		for(int row = 1; row <= size; row++) {
			for(int col = 1; col <= size; col++) {
				if(row + col >= size + 1) {
					System.out.print("# ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
