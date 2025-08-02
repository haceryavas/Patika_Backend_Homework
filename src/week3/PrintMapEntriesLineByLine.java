package week3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Hacer Nur YAVAŞ - 2 August 2025
 *
 * This program creates a map of student names and their scores,
 * and prints each entry (key-value pair) on a separate line.
 *
 * Note:
 * The map used is a HashMap, which does not guarantee insertion order.
 * Therefore, the printed order of entries may vary.
 */

public class PrintMapEntriesLineByLine {
    public static void main(String[] args) {
        // Creating a map of student names and their scores
        Map<String, Integer> notes = new HashMap<>();

        // Adding entries to the map
        notes.put("Hacer", 90);
        notes.put("Nur", 60);
        notes.put("Murat", 85);
        notes.put("Can", 48);
        notes.put("Kağan", 100);

        // Printing each entry on a separate line
        for (Map.Entry<String, Integer> entry : notes.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
