package Week1;

import java.util.Scanner;

public class MatrixTransposer {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scan.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = scan.nextInt();

        int[][] matrix = new int[rows][cols];

        // Read matrix elements from user
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + (i + 1) + "," + (j + 1) + "]: ");
                matrix[i][j] = scan.nextInt();
            }
        }

        scan.close(); // Close scanner to prevent resource leak

        // Transpose the matrix
        int[][] transposedMatrix = new int[cols][rows];

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }

        // Print the original and transposed matrices
        System.out.println("\nOriginal Matrix:");
        printMatrix(matrix);

        System.out.println("\nTransposed Matrix:");
        printMatrix(transposedMatrix);
    }

    // Utility method to print any 2D matrix
    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
