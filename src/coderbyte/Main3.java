package coderbyte;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan küçük harfe çevrilerek kelime alınır
        System.out.print("Kelimeleri giriniz: ");
        String word = scanner.nextLine().toLowerCase();

        // Harfler kontrol edilerek sayılır ve sırasıyla LinkedHashMap'e eklenir.
        Map<Character, Integer> letterCount = new LinkedHashMap<>();
        for (char letter : word.toCharArray()) {
            if (Character.isLetter(letter)) {
                letterCount.put(letter, letterCount.getOrDefault(letter,0) + 1);
            }
        }

        // LinkedHashMap'te saklanan harf frekansları satır satır yazdırılır
        for (Map.Entry<Character, Integer> entry : letterCount.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        scanner.close();
    }
}