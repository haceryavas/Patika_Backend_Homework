package week2;

import java.util.Scanner;

/**
 * @author Hacer Nur YAVAŞ - July 23, 2025
 * This program takes a decimal number from the user
 * and prints its rounded values using floor, ceil, and round methods.
 */

public class RoundingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a decimal number
        System.out.print("Enter a decimal number: ");
        double number = scanner.nextDouble();

        // Round to the nearest whole number
        long rounded = Math.round(number);

        // Round up to the nearest whole number (ceiling)
        double roundedUp = Math.ceil(number);

        // Round down to the nearest whole number (floor)
        double roundedDown = Math.floor(number);

        System.out.println("Rounded down (floor): " + roundedDown);
        System.out.println("Rounded up (ceil): " + roundedUp);
        System.out.println("Rounded to the nearest whole number: " + rounded);

        scanner.close();
    }
}
