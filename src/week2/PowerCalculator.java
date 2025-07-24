package week2;

import java.util.Scanner;

/**
 * This program takes a base and an exponent from the user
 * and calculates the result using Math.pow(base, exponent).
 *
 * Input is assumed to be valid integers.
 *
 * Author: Hacer Nur YAVAŞ
 * Date: July 24, 2025
 */
public class PowerCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the base number from user
        System.out.print("Enter the base: ");
        int base = scanner.nextInt();

        // Get the exponent from user
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        // Calculate power using Math.pow (returns a double)
        double result = Math.pow(base, exponent);

        // Display the result
        System.out.println(base + " ^ " + exponent + " = " + result);
    }
}
