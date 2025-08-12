package week5.innerClasses;

public class Employee {
    private String name;
    private String surname;
    private ContactInfo contactInfo;

    // Constructor to initialize employee's personal and contact information
    public Employee(String name, String surname, String mobile, String email) {
        this.name = name;
        this.surname = surname;
        this.contactInfo = new ContactInfo(mobile,email);
    }

    // Inner class to store employee's contact details
    class ContactInfo {
        String mobile;
        String email;

        public ContactInfo(String mobile, String email) {
            this.mobile = mobile;
            this.email = email;
        }
    }

    // Getter methods for employee's personal details
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    // Method to print employee's personal and contact details
    void print() {
        System.out.println("Personnel Information" +
                "\nName: " + name +
                "\nSurname: " + surname +
                "\nMobile Phone Number: " + contactInfo.mobile +
                "\nE-mail: " + contactInfo.email);
    }
}
