package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.sem2.lab2_2.Task2_5.*;

import java.util.Random;

/*
📌 Описание:
В ресторане работает один повар и один официант.

Повар готовит блюда и ставит их на поднос (максимум 3 блюда).
Официант берет готовые блюда и подает их клиентам.
🔹 Что нужно реализовать?
✔ Повар не может готовить больше 3 блюд (ждет wait()).
✔ Официант ждет, если поднос пуст (wait()).
✔ При каждой передаче блюда используется notify().
 */

@TaskDescription(taskNumber = 5, taskDescription = "Ресторан: Повар и Официант")
public class Task5Solution implements Solution {
    @Override
    public void execute() {
        Restaurant restaurant = new Restaurant();
        Chef chef = new Chef(restaurant);
        Waiter waiter = new Waiter(restaurant);
        Random random = new Random();

        chef.start();
        waiter.start();

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500 + random.nextInt(2000)); // Задержка между заказами
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Новый заказ поступил в ресторан!");
            restaurant.placeOrder();
        }

    }
}