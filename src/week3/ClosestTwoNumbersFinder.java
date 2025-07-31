package week3;

/**
 * @author Hacer Nur YAVAŞ - 31 July 2025
 *
 * This program takes 10 unique positive integers from the user,
 * stores them in an ArrayList, and finds the two numbers that are closest to each other.
 *
 * Program Rules:
 * - Only positive integers are allowed.
 * - All numbers must be unique.
 * - After collecting the numbers, the list is sorted.
 * - The smallest difference between consecutive numbers is calculated.
 * - The closest two numbers are displayed as output.
 */

import java.util.*;

public class ClosestTwoNumbersFinder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        // Get 10 unique and positive integers from the user
        for (int i = 1; i <= 10; i++) {

            System.out.print("Enter positive number " + i + ": ");
            int number = scanner.nextInt();

            // Validate: positive and unique
            if (numbers.contains(number) || number <= 0) {
                System.out.println("Please enter a **positive number** that has not been entered before!");
                i--; // Don't count invalid input
            } else {
                numbers.add(number);
            }
        }

        findClosestTwoNumbers(numbers);
    }

    /**
     * This method sorts the list and finds the pair of numbers with the smallest difference.
     *
     * @param numbers ArrayList of 10 unique positive integers
     */
    private static void findClosestTwoNumbers(ArrayList<Integer> numbers) {
        Collections.sort(numbers); // Sort the list in ascending order

        int minDifference  = Integer.MAX_VALUE;
        int closestIndex  = -1;

        // Find the minimum difference between consecutive elements
        for (int i = 0; i < numbers.size() - 1; i++) {
            int difference  = numbers.get(i + 1) - numbers.get(i);
            if (difference  < minDifference) {
                minDifference = difference;
                closestIndex = i;
            }
        }

        // Print the closest pair
        System.out.println("The two closest numbers are: " + numbers.get(closestIndex)
                + " and " + numbers.get(closestIndex + 1));    }
}
