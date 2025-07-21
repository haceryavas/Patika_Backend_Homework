package Week1;

import java.util.Scanner;

/**
 * @author Hacer Nur YAVAŞ - 21 July 2025
 * This program demonstrates basic type casting between int and double.
 */
public class CastingExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int intNum = scan.nextInt();

        System.out.print("Enter a decimal number: ");
        double doubleNum = scan.nextDouble();

        // Casting
        int toInt = (int) doubleNum;
        double toDouble = intNum;

        System.out.println("Double to int: " + toInt);
        System.out.println("Int to double: " + toDouble);
    }
}
