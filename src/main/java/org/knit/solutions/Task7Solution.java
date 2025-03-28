package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.sem2.lab2_2.Task2_7.*;
/*
📌 Описание:

Производитель создает товары (максимум 5).
Потребитель забирает товары.
Если товаров нет, потребитель ждет (wait()).
Если товаров максимум, производитель ждет (wait()).
🔹 Что нужно реализовать?
✔ wait() – если товаров нет или склад заполнен.
✔ notify() – пробуждение потока, когда изменяется состояние склада.
 */

@TaskDescription(taskNumber = 7, taskDescription = "Производитель: Потребитель с ограничением")
public class Task7Solution implements Solution{
    @Override
    public void execute() {
        Warehouse warehouse = new Warehouse();
        new Producer(warehouse).start();
        new Consumer(warehouse).start();
    }
}