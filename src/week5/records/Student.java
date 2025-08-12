package week5.records;

/**
 * This record represents a student with a name, surname, and student number.
 * It is immutable and automatically provides implementations for
 * equals(), hashCode(), and toString().
 *
 * @param name    the student's first name
 * @param surname the student's surname
 * @param no      the student's number
 */

public record Student(String name, String surname, int no) {
}
