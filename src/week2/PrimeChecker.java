package week2;

import java.util.Scanner;

/**
 * This program checks whether a given integer is a prime number.
 * It uses a recursive method and optimizes the check by testing divisors
 * only up to the square root of the number.
 *
 * @author Hacer Nur YAVAŞ
 * @date July 24, 2025
 */
public class PrimeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println(number + " is NOT a prime number.");
        } else if (isPrime(number, 2)) {
            System.out.println(number + " is a PRIME number.");
        } else {
            System.out.println(number + " is NOT a prime number.");
        }

        scanner.close(); // Close scanner to prevent resource leak
    }

    /**
     * Recursively checks if the given number is prime.
     *
     * @param number The number to check.
     * @param divisor The current divisor to test.
     * @return true if the number is prime, false otherwise.
     */
    private static boolean isPrime(int number, int divisor) {
        // If divisor squared exceeds the number, it has no more possible divisors.
        if (divisor * divisor > number) return true;

        // If number is divisible by this divisor, it is not prime.
        if (number % divisor == 0) return false;

        // Continue checking with the next divisor.
        return isPrime(number, divisor + 1);
    }
}
