package lab4;

public class InsertionSort {
    public static void main(String[] args) {
        int array[] = {12, 11, 13, 5, 6};
        insertionSort(array);
    }

    public static void insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        for (int i = 0; i < array.length; ++i)
            System.out.print(array[i] + " ");

        System.out.println();
    }
}
// 5 6 11 12 13