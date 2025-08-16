package week5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hacer Nur YAVAŞ - 16 August 2025
 *
 * This program demonstrates the use of Java method references.
 * It creates a list of names (strings) and prints each name using a method reference.
 *
 * Program Rules:
 * - The list contains several names.
 * - Each name in the list is printed using a method reference.
 * - A traditional for-each loop example is also provided in comments.
 */

public class MethodReference {

    public static void main(String[] args) {

        // Create a list to store names
        List<String> names = new ArrayList<>();

        // Add names to the list
        names.add("Ahmet");
        names.add("Ayşe");
        names.add("Mehmet");
        names.add("Zeynep");

        // Traditional way to print list elements (commented out)
        // for (String name : names) {
        //     System.out.println(name);
        // }

        // Print each element using a method reference
        names.forEach(System.out::println);
    }
}
