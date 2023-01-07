
import java.util.*;

public class Matrix {

    // Method signatures
    public static void createRandomMatrix(int[][] matrix) {
        Random rand = new Random();
        int rows = rand.nextInt();
        int cols = rand.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt();
            }
        }
    }

    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt();
            }
        }
        return matrix;

    }

    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void print(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    // Used in add(), subtract()
    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        if (matrix1 == null) {
            if (matrix2 != null) {
                return false;
            }
        } else {
            if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
                return false;
            } else {
                for (int i = 0; i < matrix1.length; i++) {
                    for (int j = 0; j < matrix2.length; j++) {
                        if (matrix1[i][j] != matrix2[i][j]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        if (matrix1 == null) {
            if (matrix2 != null) {
                return false;
            }
        } else {
            if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
                return false;
            } else {
                for (int i = 0; i < matrix1.length; i++) {
                    for (int j = 0; j < matrix2.length; j++) {
                        if (matrix1[i][j] != matrix2[i][j]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {

        int[][] result = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }
}
