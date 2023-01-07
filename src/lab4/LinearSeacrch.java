package lab4;

public class LinearSeacrch {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 50, 70, 90};
        int key = 50;
        System.out.println(linearSearch(a, key));
        System.out.println(key + " is found at index: " + linearSearchIndex(a, key));
    }

    public static boolean linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key)
                return true;
        }
        return false;
    }

    public static int linearSearchIndex(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return 0;
    }
}
// true
// 50 is found at index: 3