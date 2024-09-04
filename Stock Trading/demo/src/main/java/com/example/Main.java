package com.example;

public class Main {
    public static void main(String[] args) {
        TradingEngine tradingEngine = new TradingEngine();

        // Adding stocks to the trading engine
        Stock stock1 = new Stock("AAPL", 150.0, 1000);
        Stock stock2 = new Stock("GOOGL", 2800.0, 500);
        tradingEngine.addStock(stock1);
        tradingEngine.addStock(stock2);

        // Creating users
        User user1 = new User("alice", "password123", 10000.0);
        User user2 = new User("bob", "password456", 5000.0);

        // Creating orders
        Order buyOrder = new Order(user1, stock1, 10, true); // Alice wants to buy 10 AAPL
        Order sellOrder = new Order(user2, stock2, 2, false); // Bob wants to sell 2 GOOGL

        // Processing orders
        tradingEngine.processOrder(buyOrder);
        tradingEngine.processOrder(sellOrder);

        // Print remaining stocks and transactions
        System.out.println("Stocks available:");
        for (Stock stock : tradingEngine.getStocks()) {
            System.out.println(stock);
        }

        System.out.println("Transactions:");
        for (Transaction transaction : tradingEngine.getTransactions()) {
            System.out.println(transaction);
        }
    }
    }
