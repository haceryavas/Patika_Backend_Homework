package week3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Hacer Nur YAVAŞ - 31 July 2025
 *
 * This program is a simple letter guessing game.
 * It initializes a list with 4 predefined letters.
 * The user is prompted to enter 4 letters one by one.
 *
 * - If the entered letter is already in the list, it prints that the letter exists
 *   and replaces it with the word "found".
 * - If the letter is not in the list, it adds it to the list and notifies the user.
 * - At the end, it prints the updated list.
 */

public class LetterGuessGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> letters = new ArrayList<>();


        // Initial predefined letters in the list
        letters.add("a");
        letters.add("h");
        letters.add("m");
        letters.add("n");

        // Prompt the user to enter 4 letters
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter letter " + (i + 1) + ": ");

            // Read the first character and convert it to String
            String letter = scanner.next().charAt(0) + "";

            // Check if the letter is already in the list
            if (letters.contains(letter)) {
                System.out.println("The letter '" + letter + "' is already in the list!");
                // Replace the found letter with the word "found"
                letters.set(letters.indexOf(letter), "found");
            } else {
                System.out.println("The letter '" + letter + "' has been added to the list!");
                // Add new letter to the list
                letters.add(letter);
            }
        }
        scanner.close();

        // Print the final state of the list
        System.out.println("letters = " + letters);
    }
}
