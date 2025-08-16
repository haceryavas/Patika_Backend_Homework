package coderbyte;

import java.util.*;

/**
 * @author Hacer Nur YAVAŞ - 15 August 2025
 * Run Length
 * Have the function RunLength (str) take the str parameter being passed and
 * return a compressed version of the string using the Run-length encoding algorithm.
 * This algorithm works by taking the occurrence of each repeating character and outputting
 * that number along with a single character of the repeating sequence.
 * For example: "wwwggopp" would return 3w2g102p.
 * The string will not contain any numbers, punctuation, or symbols.
 * Examples
 * Input: "aabbcde"  Output: 2a2b1c1d1e
 * Input: "wwwbbbw"  Output: 3w3b1w
 */

class RunLength {

    public static String runLength(String str) {
        StringBuilder builder = new StringBuilder("");
        char letter;
        int counter = 1;

        for (int i = 1; i < str.length(); i++) {
            letter = str.charAt(i - 1);

            if (letter == str.charAt(i)) {
                counter++;
            } else {
                builder.append(counter);
                builder.append(letter);
                counter = 1;
            }
            if (i == str.length() - 1) {
                builder.append(counter);
                builder.append(str.charAt(i));
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(runLength(s.nextLine()));
    }

}