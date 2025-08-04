package week3.bookShoppingSite.model;

import week3.bookShoppingSite.model.enums.Gender;

import java.time.LocalDate;

public class Author {
    private String name;
    private String surname;
    private Gender gender;
    private LocalDate birthDay;
    private String bio;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public String getBio() {
        return bio;
    }

    @Override
    public String toString() {
        return "\nAuthor { " +
                "name = " + name +
                ", surname = " + surname +
                ", gender = " + gender +
                ", birthDay = " + birthDay +
                ", bio = " + bio +
                " } \n";
    }
}
