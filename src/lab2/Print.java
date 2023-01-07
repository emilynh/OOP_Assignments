package lab2;

public class Print {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        print(array);
        int[] array1 = {};
        print(array1);
    }

    public static void print(int[] array) {
        if (array == null) {
            System.out.println("null");
        } else if (array.length >= 1) {
            System.out.print("[" + array[0]);
        }
        for (int i = 1; i < array.length; i++) {
            System.out.print(", " + array[i]);
        }
        System.out.println("]");
    }
}
// Output: [1, 2, 3, 4, 5, 6]
