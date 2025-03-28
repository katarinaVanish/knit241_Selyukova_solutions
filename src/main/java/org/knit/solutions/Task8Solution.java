package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.sem2.lab2_2.Task2_8.*;

import java.util.Random;

/*
📌 Описание:
На перекрестке светофор управляет движением:

Красный свет – машины стоят (wait()).
Зеленый свет – машины едут (notifyAll()).
Светофор переключается каждые 5 секунд.
🔹 Что нужно реализовать?
✔ Поток "Светофор" изменяет цвет и отправляет notifyAll().
✔ Потоки "Машина" ждут wait(), если красный свет.
 */

@TaskDescription(taskNumber = 8, taskDescription = "Перекресток: светофор и машины")
public class Task8Solution implements Solution {
    @Override
    public void execute() {
        TrafficLight trafficLight = new TrafficLight();
        new Controller(trafficLight).start();
        Random random = new Random();

        int carNumber = 1;
        while (true) {
            new Car("Машина " + carNumber++, trafficLight).start();
            try {
                Thread.sleep(2000 + random.nextInt(3000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
