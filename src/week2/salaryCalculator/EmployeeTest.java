package week2.salaryCalculator;

/**
 * This class is used to test the functionality of the Employee class.
 * It creates Employee objects and prints their detailed salary information.
 *
 * Author: Hacer Nur YAVAŞ
 * Date: July 27, 2025
 */

public class EmployeeTest {
    public static void main(String[] args) {

        // Create an employee named "Kemal" with:
        // - Salary: 2000
        // - Weekly work hours: 45
        // - Hire year: 1985
        Employee employee = new Employee("kemal",2000,45,1985);

        // Create another employee named "Hacer" with:
        // - Salary: 130000
        // - Weekly work hours: 40
        // - Hire year: 2021l
        Employee employee1 = new Employee("Hacer",130000,40,2021);

        // Print detailed salary breakdown for both employees
        System.out.println(employee.toString());
        System.out.println(employee1.toString());
    }
}
