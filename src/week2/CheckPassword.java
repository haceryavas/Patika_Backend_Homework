package week2;

import java.util.Scanner;

/**
 * @author Hacer Nur YAVAŞ - 23 July 2025
 * This program checks if a given password is valid based on the following rules:
 * - At least 8 characters long
 * - Does not contain spaces
 * - Starts with an uppercase letter
 * - Ends with a question mark (?)
 */

public class CheckPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter a password
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        // Validate password using the defined rules
        if (isValidPassword(password)) {
            System.out.println("Valid password.");
        } else {
            System.out.println("Invalid password.");
        }
    }

    /**
     * Checks whether the given password is valid.
     * Rules:
     * - Not null or empty
     * - At least 8 characters
     * - No spaces
     * - Starts with an uppercase letter
     * - Ends with '?'
     *
     * @param password the password to validate
     * @return true if password meets all rules, false otherwise
     */
    public static boolean isValidPassword(String password) {
        if (password == null || password.isEmpty()) {
            return false;
        }

        // Check all password rules in one compound return statement
        return password.length() >= 8 &&
                !password.contains(" ") &&
                Character.isUpperCase(password.charAt(0)) &&
                password.endsWith("?");
    }
}
