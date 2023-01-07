package lab2;

public class Contains {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int key = 0;
        System.out.println(contains(array, key));
    }

    public static boolean contains(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }
}
