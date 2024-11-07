package onlineStore;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderNumber;
    private Customer customer;
    private List<Product> products = new ArrayList<>();
    private double totalAmount;
    private String orderDate; 

    // Конструктор через Builder
    public static class Builder {
        private String orderNumber;
        private Customer customer;
        private List<Product> products = new ArrayList<>();
        private double totalAmount;
        private String orderDate;

        public Builder orderNumber(String orderNumber) {
            this.orderNumber = orderNumber;
            return this;
        }

        public Builder customer(Customer customer) {
            this.customer = customer;
            return this;
        }

        public Builder addProduct(Product product) {
            this.products.add(product);
            return this;
        }

        public Builder totalAmount(double totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        // Метод для встановлення дати вручну
        public Builder orderDate(String orderDate) {
            this.orderDate = orderDate;
            return this;
        }

        public Order build() {
            Order order = new Order();
            order.orderNumber = this.orderNumber;
            order.customer = this.customer;
            order.products = this.products;
            order.totalAmount = this.totalAmount;
            order.orderDate = this.orderDate;
            return order;
        }
    }

    // Геттери та сеттери для полів
    public String getOrderNumber() {
        return orderNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getOrderDate() {
        return orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber='" + orderNumber + '\'' +
                ", customer=" + customer +
                ", products=" + products +
                ", totalAmount=" + totalAmount +
                ", orderDate='" + orderDate + '\'' +
                '}';
    }
}
