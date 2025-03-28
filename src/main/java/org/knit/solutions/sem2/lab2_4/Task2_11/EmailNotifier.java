package org.knit.solutions.sem2.lab2_4.Task2_11;

public class EmailNotifier implements StockObserver{
    private final String email;

    public EmailNotifier(String email) {
        this.email = email;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("[Email] Уведомление отправлено на " + email + ": новая цена акции " + stockName + " - " + price);
    }

    @Override
    public String getObserverInfo(){
        return email;
    }
}
