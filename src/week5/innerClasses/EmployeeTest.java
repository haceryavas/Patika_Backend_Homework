package week5.innerClasses;

import java.util.Scanner;

/**
 * This program demonstrates the use of an Inner Class in Java to store
 * and manage employee contact information.
 *
 * The outer class `Employee` stores personal details such as the employee's
 * name and surname, while the inner class `ContactInfo` stores contact
 * details such as the mobile phone number and email address.
 *
 * In the `EmployeeTest` class, the program takes user input for both personal
 * and contact information, creates an `Employee` object, and then prints all
 * details using the `print` method.
 *
 * Key features:
 * - Demonstrates encapsulation by using an inner class to group related data.
 * - Shows how to initialize and use an inner class instance inside the outer class.
 * - Uses the `Scanner` class to collect data from the user.
 *
 * @author Hacer Nur YAVAŞ - 12 August 2025
 */



public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for employee details
        System.out.print("Enter personnel name: ");
        String name = scanner.nextLine();

        System.out.print("Enter personnel surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter personnel mobile phone number: ");
        String mobile = scanner.nextLine();

        System.out.print("Enter personnel e-mail: ");
        String email = scanner.nextLine();

        // Creating an Employee object with the given input
        Employee employee = new Employee(name, surname, mobile, email);

        // Displaying the employee's information
        employee.print();

        // Closing scanner to prevent resource leaks
        scanner.close();
    }
}
