package lab2;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        reverse(array);
    }

    public static void reverse(int[] array) {
        int[] reversedArray = new int[array.length];
        int j = array.length;
        for (int i = 0; i < array.length; i++) {
            reversedArray[j - 1] = array[i];
            j = j - 1;
        }
        System.out.println(Arrays.toString(reversedArray));
    }
}
