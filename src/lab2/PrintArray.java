package lab2;

import java.util.Scanner;

public class PrintArray {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = Input(sc);
        System.out.println("Your array is : ");
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
        System.out.print("[");
        for (int index = 0; index < array.length - 1; index++) {
            System.out.print(array[index] + ",");
        }
        System.out.print(array[array.length - 1] + "]");
    }
}
