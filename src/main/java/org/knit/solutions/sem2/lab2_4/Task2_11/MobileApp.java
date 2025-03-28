package org.knit.solutions.sem2.lab2_4.Task2_11;

public class MobileApp implements StockObserver{
    private final String user;

    public MobileApp(String user) {
        this.user = user;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("[MobileApp] " + user + ", новая цена акции " + stockName + ": " + price);
    }

    @Override
    public String getObserverInfo() {
        return user;
    }
}
