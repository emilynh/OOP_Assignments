package lab2;

import java.util.Scanner;

public class GradesStatistics {

    public static void main(String[] args) {
        int numStudents;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        numStudents = Integer.parseInt(sc.next());

        int[] array = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the grade for student " + i + 1 + " : ");
            array[i] = sc.nextInt();
        }

        System.out.println("The average is: " + String.format("%.2f", getAverage(array)));
        System.out.println("The minimum is: " + getMin(array));
        System.out.println("The maximum is: " + getMax(array));

        sc.close();
    }

    public static double getAverage(int[] array) {
        double average;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = (sum * 1.0) / array.length;
        return average;
    }

    public static int getMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }

        }
        return min;
    }

    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

}

// Enter the number of students: 5
// Enter the grade for student 01 : 98
// Enter the grade for student 11 : 78
// Enter the grade for student 21 : 78
// Enter the grade for student 31 : 87
// Enter the grade for student 41 : 76
// The average is: 83.4
// The minimum is: 76
// The maximum is: 98
