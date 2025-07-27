package week2.salaryCalculator;

/**
 * This class represents an employee and includes methods
 * for calculating tax, bonuses, and salary raises.
 * It also includes validation in setter methods to ensure
 * data consistency and correctness.
 */

public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    // Constants for business rules
    // LocalDate localDate = LocalDate.now();
    // int CURRENT_YEAR = localDate.getYear();
    private static final int CURRENT_YEAR = 2021;
    private static final double TAX_RATE = 0.03;
    private static final int BONUS_PER_HOUR = 30;
    private static final int REGULAR_WORK_HOURS = 40;

    /**
     * Constructor initializes employee data and applies validation
     * via setter methods to ensure valid values are assigned.
     */
    public Employee(String name, double salary, int workHours, int hireYear) {
        setName(name);
        setSalary(salary);
        setWorkHours(workHours);
        setHireYear(hireYear);
    }

    /**
     * Calculates tax if salary is 1000 or more.
     * @return tax amount
     */
    double tax() {
        return (salary >= 1000) ? salary * TAX_RATE : 0;
    }

    /**
     * Calculates bonus based on overtime hours.
     * If workHours > 40, bonus is given for each extra hour.
     * @return bonus amount
     */
    int bonus() {
        int overtime = workHours - REGULAR_WORK_HOURS;
        return (overtime > 0) ? overtime * BONUS_PER_HOUR : 0;
    }

    /**
     * Calculates salary raise based on years worked.
     * < 10 years: 5% raise
     * < 20 years: 10% raise
     * ≥ 20 years: 15% raise
     * @return raise amount
     */
    double raiseSalary() {
        int yearsWorked = CURRENT_YEAR - hireYear;

        if (yearsWorked < 10) {
            return salary * 0.05;
        } else if (yearsWorked < 20) {
            return salary * 0.10;
        } else {
            return salary * 0.15;
        }
    }

    /**
     * Returns a detailed string representation of the employee,
     * including tax, bonus, raise, and total salary information.
     */
    @Override
    public String toString() {
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();
        double salaryAfterTaxAndBonus = this.salary + bonus - tax;
        double totalSalary = salaryAfterTaxAndBonus + raise;

        return "=====================================================\n" +
                "Name: " + name + "\n" +
                "Salary: " + salary + "\n" +
                "Work Hours: " + workHours + "\n" +
                "Hire Year: " + hireYear + "\n" +
                "Tax: " + tax + "\n" +
                "Bonus: " + bonus + "\n" +
                "Salary Raise: " + raise + "\n" +
                "Salary with Tax and Bonus: " + salaryAfterTaxAndBonus + "\n" +
                "Total Salary: " + totalSalary;
    }

    // ======================
    // Getters and Setters with Validation
    // ======================

    public String getName() {
        return name;
    }

    /**
     * Sets the employee's name.
     * Name cannot be null or blank.
     */
    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank.");
        }
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    /**
     * Sets the employee's salary.
     * Salary cannot be negative.
     */
    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative.");
        }
        this.salary = salary;
    }

    public double getWorkHours() {
        return workHours;
    }

    /**
     * Sets the employee's weekly working hours.
     * Work hours cannot be negative.
     */
    public void setWorkHours(int workHours) {
        if (workHours < 0) {
            throw new IllegalArgumentException("Work hours cannot be negative.");
        }
        this.workHours = workHours;
    }


    public int getHireYear() {
        return hireYear;
    }

    /**
     * Sets the employee's hire year.
     * Hire year cannot be in the future.
     */
    public void setHireYear(int hireYear) {
        if (hireYear > CURRENT_YEAR) {
            throw new IllegalArgumentException("Hire year cannot be in the future.");
        }
        this.hireYear = hireYear;
    }
}
