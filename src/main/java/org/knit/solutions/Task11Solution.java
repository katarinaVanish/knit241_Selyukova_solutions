package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.sem2.lab2_4.Task2_11.*;

/*
Вы разрабатываете приложение для биржевой торговли, где пользователи могут подписываться на обновления акций определённых компаний.

Требуется:
Создать класс Stock (акция), который хранит информацию о текущей цене и может уведомлять подписчиков об изменении цены.
Создать интерфейс StockObserver и реализовать его в классах MobileApp и EmailNotifier, которые получают уведомления при изменении цены.
Реализовать механизм подписки и отписки для StockObserver.

Пример работы:
Пользователь подписывается на акции компании "Tesla".
Когда цена акции изменяется, приложение отправляет уведомления подписчикам.
Если пользователь отписался, он больше не получает уведомления.
Дополнительно: Добавьте возможность подписки на акции нескольких компаний.
 */

@TaskDescription(taskNumber = 11, taskDescription = "Паттерн Observer (Наблюдатель)")
public class Task11Solution implements Solution{
    @Override
    public void execute(){
        Stock tesla = new Stock("Tesla", 800.0);

        StockObserver user1 = new MobileApp("Alice");
        StockObserver user2 = new EmailNotifier("bob@example.com");

        tesla.subscribe(user1);
        tesla.subscribe(user2);

        tesla.setPrice(820.0);
        tesla.setPrice(850.0);

        tesla.unsubscribe(user2);

        tesla.setPrice(870.61);
    }

}
