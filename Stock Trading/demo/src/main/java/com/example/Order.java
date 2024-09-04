package com.example;

public class Order {
    private User user;
    private Stock stock;
    private int quantity;
    private boolean isBuyOrder; // True for buy, false for sell

    public Order(User user, Stock stock, int quantity, boolean isBuyOrder) {
        this.user = user;
        this.stock = stock;
        this.quantity = quantity;
        this.isBuyOrder = isBuyOrder;
    }

    // Getters and setters
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isBuyOrder() {
        return isBuyOrder;
    }

    public void setBuyOrder(boolean buyOrder) {
        isBuyOrder = buyOrder;
    }

    @Override
    public String toString() {
        return "Order{" +
                "user=" + user +
                ", stock=" + stock +
                ", quantity=" + quantity +
                ", isBuyOrder=" + isBuyOrder +
                '}';
    }
}
