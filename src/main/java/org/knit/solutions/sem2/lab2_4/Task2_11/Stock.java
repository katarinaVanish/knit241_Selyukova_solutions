package org.knit.solutions.sem2.lab2_4.Task2_11;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private final String name;
    private double price;
    private final List<StockObserver> observers = new ArrayList<>();

    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void subscribe(StockObserver observer) {
        System.out.println("Пользователь " + observer.getObserverInfo() + " подписался на рассылку");
        observers.add(observer);
    }

    public void unsubscribe(StockObserver observer) {
        System.out.println("Пользователь " + observer.getObserverInfo() + " отписался от рассылки");
        observers.remove(observer);
    }

    public void setPrice(double newPrice) {
        if (this.price != newPrice) {
            this.price = newPrice;
            System.out.println("Цена акций " + name + " обновляется...");
            notifyObservers();
        }
    }

    private void notifyObservers() {
        for (StockObserver observer : observers) {
            observer.update(name, price);
        }
    }
}
