package week5.enumExampple;

import java.util.Locale;
import java.util.Scanner;

/**
 * Test class for the Day enum.
 * Allows the user to select a day and see its working hours.
 */
public class DayTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Print all days from the Day enum
        for (Day day : Day.values()){
            System.out.println(day);
        }

        System.out.print("Enter a day: ");
        // Convert user input to uppercase using ENGLISH locale to avoid Turkish character issues
        String day = scanner.nextLine().toUpperCase(Locale.ENGLISH);

        try {
            // Convert input string to Day enum constant
            Day selectedDay = Day.valueOf(day);

            // Display the working hours for the selected day
            System.out.println("Working hours: " + selectedDay.getStartTime() + " - " + selectedDay.getEndTime());
        } catch (IllegalArgumentException e) {
            // Handle case where user enters an invalid day

            System.out.println("Invalid day entered.");
        }

    }
}
