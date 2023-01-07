package lab2;

import java.util.Scanner;

public class PrintArrayInStars {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = Input(sc);
        System.out.println("Result : ");
        Print(array);
    }

    public static int[] Input(Scanner sc) {
        System.out.println("Enter array's length : ");
        int length = sc.nextInt();
        int[] array = new int[length];
        System.out.println("Enter array :");
        for (int index = 0; index < array.length; index++) {
            array[index] = sc.nextInt();
        }
        return array;
    }

    public static void Print(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.print(index + ": ");
            for (int star = 1; star <= array[index]; star++) {
                System.out.print("*");
            }
            System.out.print("(" + array[index] + ")");
            System.out.println();
        }
    }

}
