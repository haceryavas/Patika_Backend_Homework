package week3.bookShoppingSite.model;

import week3.bookShoppingSite.model.enums.OrderStatus;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private int number;
    private List<Product> productList;
    private OrderStatus orderStatus;
    private User user;
    private LocalDate createdDate;
    private LocalDate canceledDate;
    private double total;

    public Order(int number, User user, List<Product> productList) {
        this.number = number;
        this.user = user;
        this.productList = productList;
        this.orderStatus = OrderStatus.PREPARING;
        this.createdDate = LocalDate.now();
        this.canceledDate = null;
    }

    public int getNumber() {
        return number;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public User getUser() {
        return user;
    }

    public double getTotal() {
        double sum = 0;
        for (Product product : productList){
            total += product.getPrice();
        }
        return total;
    }

    public void cancelOrder(Order order){
        order.orderStatus = OrderStatus.CANCELED;
        this.canceledDate = LocalDate.now();
    }

    @Override
    public String toString() {
        return "\nOrder { " +
                "number = " + number +
                ", productList = " + productList +
                ", orderStatus = " + orderStatus +
                //", user = " + user +
                ", createdDate = " + createdDate +
                ", canceledDate = " + canceledDate +
                ", total = " + getTotal() +
                " } \n";
    }
}
