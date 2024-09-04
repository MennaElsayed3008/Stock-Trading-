package com.example;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TradingEngine {
    private List<Stock> stocks = new ArrayList<>();
    private List<Transaction> transactions = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public boolean processOrder(Order order) {
        Stock stock = order.getStock();
        User user = order.getUser();
        double orderAmount = stock.getPrice() * order.getQuantity();

        if (order.isBuyOrder()) {
            if (user.getBalance() < orderAmount) {
                System.out.println("Insufficient balance.");
                return false;
            }
            if (stock.getQuantity() < order.getQuantity()) {
                System.out.println("Insufficient stock quantity.");
                return false;
            }
            user.setBalance(user.getBalance() - orderAmount);
            stock.setQuantity(stock.getQuantity() - order.getQuantity());
        } else {
            if (stock.getQuantity() < order.getQuantity()) {
                System.out.println("Insufficient stock quantity.");
                return false;
            }
            user.setBalance(user.getBalance() + orderAmount);
            stock.setQuantity(stock.getQuantity() + order.getQuantity());
        }

        Transaction transaction = new Transaction(order, new Date(), orderAmount);
        transactions.add(transaction);
        System.out.println("Order processed: " + transaction);
        return true;
    }

    public List<Stock> getStocks() {
        return stocks;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
