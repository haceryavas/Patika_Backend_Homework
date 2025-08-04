package week3.bookShoppingSite.model;

import week3.bookShoppingSite.model.enums.Gender;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    private String name;
    private String email;
    private String password;
    private Gender gender;
    private LocalDate dateBirth;
    private LocalDate activatedDate;
    private boolean isActive;
    private List<Order> orderList = new ArrayList<>();


    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        activatedDate = LocalDate.now();
        isActive = true;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public LocalDate getActivatedDate() {
        return activatedDate;
    }

    public boolean isActive() {
        return isActive;
    }

    @Override
    public String toString() {
        return "\nUser { " +
                "name = " + name +
                ", email = " + email +
                ", password = " + password +
                ", gender = " + gender +
                ", dateBirth = " + dateBirth +
                ", activatedDate = " + activatedDate +
                ", isActive = " + isActive +
                ", orderList = " + orderList +
                " } \n";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(email);
    }
}
