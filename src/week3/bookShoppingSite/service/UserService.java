package week3.bookShoppingSite.service;

import week3.bookShoppingSite.model.Product;
import week3.bookShoppingSite.model.User;

import java.util.HashSet;
import java.util.Set;

public class UserService {

    private static Set<User> users = new HashSet<>();

    public void create(String name, String email, String password) {
        User user = new User(name, email, password);
        boolean isCreated = users.add(user);
        if (isCreated){
            System.out.println("Kullanıcı oluşturuldu -> " + email);
        } else{
            System.out.println(email + " ile daha önce bir kullanıcı oluşturulmuş!");
        }
    }

    public void list(){
        for (User user : users){
            System.out.println(user.getName() + " - " + user.getEmail());
        }
    }

    public User findUserByName(String userName) {
        User foundUser = null;
        for (User user : users){
            if(user.getName().equals(userName)){
                foundUser =  user;
                break;
            }
        }
        return foundUser;
    }

    public User findUserByEmail(String email) {
        User foundUser = null;
        for (User user : users){
            if(user.getEmail().equals(email)){
                foundUser =  user;
                break;
            }
        }
        System.out.println("Girilen email ile kullanıcı bulundu -> " + foundUser);
        return foundUser;
    }
}
