package week5.innerClasses;

import java.util.Scanner;

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
