package lab4;

import java.util.Scanner;

public class LengthOfRunningNumSequence {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter terms :");
        int terms = sc.nextInt();
        int length = 0;
        for (int number = 1; number <= terms; number++) {
            String str = print(number);
            System.out.print("S(" + number + ") = " + str);
            System.out.println(" with the length is : " + lengthString(str));
        }
    }

    public static int lengthCompute(int number) {
        int length = 0;
        int count = 1;
        if (number < 10) {
            length++;
        } else {
            while (number < 0) {
                number = number / 10;
                count++;
            }
            length = length + count;
        }
        return length;
    }

    public static int lengthString(String str) {
        int length = 0;
        for (int idx = 0; idx < str.length(); idx++) {
            length = length + lengthCompute(str.charAt(idx));
        }
        return length;
    }

    public static String print(int number) {
        String str = "";
        for (int idx = 1; idx <= number; idx++) {
            str = str + idx;
        }
        return str;
    }


}
