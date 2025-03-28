package org.knit.solutions.sem2.lab2_4.Task2_11;

public interface StockObserver {
    void update(String stockName, double price);
    String getObserverInfo();
}
