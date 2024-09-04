package com.example;
import java.util.Date;


public class Transaction {
    private Order order;
    private Date date;
    private double totalAmount;

    public Transaction(Order order, Date date, double totalAmount) {
        this.order = order;
        this.date = date;
        this.totalAmount = totalAmount;
    }

    // Getters and setters
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "order=" + order +
                ", date=" + date +
                ", totalAmount=" + totalAmount +
                '}';
    }
    
}
