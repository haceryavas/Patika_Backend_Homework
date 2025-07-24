package week2;

import java.util.Scanner;

/**
 * This program prints the multiplication table from 1 to a user-given number (max 10).
 * It uses aligned formatting for better readability.
 * Input is validated to ensure the number is between 1 and 10.
 *
 * Author: Hacer Nur YAVAŞ
 * Date: July 24, 2025
 */

public class MultiplicationTablePrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number between 1 and 10
        System.out.print("Enter a positive integer between 1 and 10: ");
        int number = scanner.nextInt();

        // Checks whether the given number is between 1 and 10 (inclusive).
        if (number >= 1 && number <= 10) {
            printMultiplicationTable(number);  // Print table if input is valid
        } else {
            System.out.println("Error! Please enter a number between 1 and 10.");
        }

        scanner.close(); // Close scanner to free resources
    }

    /**
     * Prints the multiplication table up to the specified limit.
     * Uses formatted output to align the columns properly.
     *
     * @param limit the size of the multiplication table (e.g., 5 means 5x5)
     */
    private static void printMultiplicationTable(int limit) {

        for (int row = 1; row <= limit; row++) {
            for (int col = 1; col <= limit; col++) {
                // Print each product with 4-character width, left-aligned
                System.out.printf("%-4d", row * col);
            }
            System.out.println(); // Move to the next line after each row
        }

    }
}
