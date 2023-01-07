
import java.util.Scanner;

public class NumberSystemConversion {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter input radix : ");
        int input = sc.nextInt();
        System.out.print("Enter output radix : ");
        int output = sc.nextInt();
        if (input == 16 && output == 2) {
            System.out.println("Enter hexadecimal :");
            String hex = sc.next();
            System.out.print(hex + " in radix 16 is " + hexToBin(hex));
            System.out.print(" in radix 2");
        }
        if (input == 16 && output == 10) {
            System.out.println("Enter hexadecimal :");
            String hex = sc.next();
            String bin = hexToBin(hex);
            System.out.print(hex + " in radix 16 is " + binToDec(bin));
            System.out.print(" in radix 10");
        }
        if (input == 10 && output == 2) {
            System.out.println("Enter decimal :");
            int dec = sc.nextInt();
            String hex = decToHex(dec);
            System.out.print(dec + " in radix 10 is " + hexToBin(hex));
            System.out.print(" in radix 2");
        }
        if (input == 10 && output == 16) {
            System.out.println("Enter decimal :");
            int dec = sc.nextInt();
            System.out.print(dec + " in radix 10 is " + decToHex(dec));
            System.out.print(" in radix 16");
        }
        if (input == 2 && output == 16) {
            System.out.println("Enter binary :");
            String bin = sc.next();
            int dec = binToDec(bin);
            System.out.print(bin + " in radix 2 is " + decToHex(dec));
            System.out.print(" in radix 16");
        }
        if (input == 2 && output == 10) {
            System.out.println("Enter binary :");
            String bin = sc.next();
            System.out.print(bin + " in radix 2 is " + binToDec(bin));
            System.out.print(" in radix 10");
        }

    }

    public static String hexToBin(String hex) {
        String[] bin_bit = {"0000", "0001", "0010", "0011",
            "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011",
            "1100", "1101", "1110", "1111"};
        String bin = "";
        for (int i = 0; i < hex.length(); i++) {
            if (hex.charAt(i) >= 0 && hex.charAt(i) <= 9) {
                bin += bin_bit[hex.charAt(i)];
            }
            if (hex.charAt(i) >= 'A' && hex.charAt(i) <= 'F') {
                bin += bin_bit[hex.charAt(i) - 'A' + 10];
            }
        }
        return bin;
    }

    public static int binToDec(String bin) {
        int dec = 0;
        for (int idx = bin.length() - 1; idx >= 0; idx++) {
            dec += Math.pow(2, idx);
        }
        return dec;
    }

    public static String decToHex(int dec) {
        char[] hex_bit = {'1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        String hex = "";
        while (dec > 0) {
            int surplus = dec % 16;
            hex += hex_bit[surplus - 1];

        }
        return hex;
    }
}
