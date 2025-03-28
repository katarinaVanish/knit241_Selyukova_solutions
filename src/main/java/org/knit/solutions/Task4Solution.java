package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.sem2.lab2_2.Task2_4.*;

/*
📌 Описание:
На автозаправочной станции только 2 колонки. Если все заняты, машины ждут в очереди.
Когда колонка освобождается, следующий автомобиль из очереди начинает заправку.

🔹 Что нужно реализовать?
✔ Использовать wait() и notify() для ожидания и освобождения заправки.
✔ Поток "Машина" ждет, если все колонки заняты.
✔ Поток "Машина" заправляется, затем освобождает колонку.
 */

@TaskDescription(taskNumber = 4, taskDescription = "Автозаправочная станция")
public class Task4Solution implements Solution {
    @Override
    public void execute() {
        GasStation station = new GasStation();
        for (int i = 1; i <= 5; i++) { // Создаем 5 машин
            new Car("Машина " + i, station).start();
        }
    }
}