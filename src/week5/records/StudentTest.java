package week5.records;

/**
 * This program demonstrates the use of Java Records to store immutable
 * student information.
 *
 * It creates several Student records and:
 * - Prints their details
 * - Demonstrates how equals() works
 * - Demonstrates how hashCode() works
 *
 * @author Hacer Nur YAVAŞ - 12 August 2025
 */

public class StudentTest {

    public static void main(String[] args) {
        Student student1 = new Student("Hacer","Yavaş",1112);
        Student student2 = new Student("Murat", "Şahin", 1117);
        Student student3 = new Student("Hacer", "Yavaş", 1112);

        System.out.println(student1);
        System.out.println("student2.name() = " + student2.name());
        System.out.println("student3.equals(student2) = " + student3.equals(student2));
        System.out.println("student3.equals(student1) = " + student3.equals(student1));
        System.out.println("student1.hashCode() = " + student1.hashCode());
        System.out.println("student2.hashCode() = " + student2.hashCode());
        System.out.println("student3.hashCode() = " + student3.hashCode());
    }
}
