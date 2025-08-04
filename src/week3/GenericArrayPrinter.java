package week3;

/**
 * This program demonstrates a generic method that prints arrays of various types
 * (e.g., Integer, String, Double).
 *
 * The method `printArray` uses Java Generics to accept arrays of any reference type
 * and prints each element separated by a space.
 *
 * Example usage:
 * - Integer[] intArray = {1, 2, 3, 4, 5};
 * - String[] stringArray = {"Hacer", "Nur", "Yavaş"};
 * - Double[] doubleArray = {0.4, 5.8, 9.7, 6.98};
 *
 * Author: Hacer Nur YAVAŞ - 4 August 2025
 */

public class GenericArrayPrinter {
    public static void main(String[] args) {
        // Create arrays of different types
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Hacer", "Nur", "Yavaş"};
        Double[] doubleArray = {0.4, 5.8, 9.7, 6.98};

        // Call the generic method for each array
        printArray(intArray);
        printArray(stringArray);
        printArray(doubleArray);
    }

    /**
     * A generic method that prints the elements of the given array.
     *
     * @param array an array of any reference type (e.g., Integer[], String[], Double[])
     * @param <T> the type of elements in the array
     */
    public static <T> void printArray(T[] array) {
        // Iterate over each element in the array and print it
        for (T item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
