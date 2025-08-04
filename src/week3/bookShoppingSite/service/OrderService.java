package week3.bookShoppingSite.service;

import week3.bookShoppingSite.model.Order;
import week3.bookShoppingSite.model.Product;
import week3.bookShoppingSite.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderService {

    private static Map<User, List<Order>> orders = new HashMap<>();

    public void create(int number, User user, List<Product> productList){
        Order order = new Order(number, user, productList);
        List<Order> usersOrder = foundOrders(user);
        if(usersOrder == null){
            usersOrder = new ArrayList<>();
        }
        usersOrder.add(order);
        orders.put(user,usersOrder);
        user.getOrderList().add(order);
        System.out.println("Siparişiniz oluşturuldu! " + order);
    }

    public List<Order> foundOrders(User user) {
        return orders.get(user);
    }

    public void list(){
        for (List<Order> orders : orders.values()){
            System.out.println(orders);
        }
    }

}
