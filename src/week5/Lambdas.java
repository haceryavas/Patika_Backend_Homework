package week5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hacer Nur YAVAŞ - 16 August 2025
 *
 * This program demonstrates the use of Java lambda expressions.
 * It creates a list of integers, doubles each number using a lambda expression,
 * and prints the results.
 *
 * Program Rules:
 * - The list contains positive integers.
 * - Each number in the list is doubled using a lambda expression.
 * - The results are printed using a lambda expression.
 */

public class Lambdas {

    public static void main(String[] args) {

        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();

        // Add numbers to the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Double each number in the list using a lambda expression
        numbers.replaceAll(n -> n * 2);

        // Print the results using a lambda expression
        numbers.forEach(n -> System.out.println(n));

    }

}
