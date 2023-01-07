package lab2;

import java.util.Arrays;

public class CopyOf {

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int newLength = 4;
        System.out.println(Arrays.toString(copyOf(array)));
        System.out.println(Arrays.toString(copyOfNewLength(array, newLength)));
    }

    public static int[] copyOf(int[] array) {
        int[] copiedArray = Arrays.copyOf(array, array.length);
        return copiedArray;
    }

    public static int[] copyOfNewLength(int[] array, int newLength) {
        int[] copiedArray = Arrays.copyOf(array, newLength);
        return copiedArray;
    }
}
