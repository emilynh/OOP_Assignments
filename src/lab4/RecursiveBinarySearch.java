package lab4;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int key = 10;
        System.out.println(binarySearch(array, key));
    }

    public static boolean binarySearch(int[] array, int key) {
        int left = array[0], right = array[array.length - 1];
        while (1 <= right) {
            int middle = (left + right) / 2;

            if (array[middle] == key)
                return true;
            if (array[middle] < key)
                left = middle + 1;
            else
                right = middle - 1;
        }
        return false;
    }

}
// true