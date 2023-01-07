package lab2;

public class Search {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 7};
        int key = 1;
        System.out.println(search(array, key));
    }

    public static int search(int[] array, int key) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                index = i;
            }
        }
        return index;
    }
}
