package week3;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * This program takes a word input from the user,
 * counts the frequency of each letter (ignoring case and non-letter characters),
 * and prints the frequencies in alphabetical order.
 *
 * Note:
 * A TreeMap is used to keep the letters sorted.
 * Non-letter characters are removed and upper/lowercase differences are ignored.
 *
 * Author: Hacer Nur YAVAŞ - 3 August 2025
 */

public class LetterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> letterFrequency = new TreeMap<>();

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        scanner.close();

        // Remove all non-letter characters and convert to lowercase
        String onlyLetters = word.replaceAll("[^a-zA-Z]", "");
        String normalized = onlyLetters.toLowerCase().trim();

        // Convert the cleaned string to a char letters
        char[] letters = normalized.toCharArray();

        // Count the frequency of each letter using getOrDefault
        for (char ch : letters) {
            if (!letterFrequency.containsKey(ch)) {
                letterFrequency.put(ch, 1);
            } else {
                letterFrequency.replace(ch, letterFrequency.get(ch) + 1);
            }
            //letterFrequency.ch, letterFrequency.getOrDefault(ch, 0) + 1);
            /*getOrDefault(key, defaultValue) metodu:
            Eğer key letterFrequency’te varsa → o değeri döndürür
            Yoksa → defaultValue’yu döndürür*/
        }

        for (Map.Entry<Character, Integer> entry : letterFrequency.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
