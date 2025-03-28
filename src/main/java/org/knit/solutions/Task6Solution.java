package org.knit.solutions;

import org.knit.solutions.sem2.lab2_2.Task2_6.*;
import org.knit.TaskDescription;
import java.util.Random;

/*
📌 Описание:
Есть автомобили и поезд.

Если поезд приближается, машины останавливаются и ждут.
После того, как поезд проедет, машины продолжают движение.
🔹 Что нужно реализовать?
✔ Поток "Поезд" останавливает автомобили (wait()).
✔ Поток "Поезд" сообщает о завершении (notifyAll()).
✔ Машины ждут, если поезд едет, и продолжают движение после notifyAll().
 */

@TaskDescription(taskNumber = 6, taskDescription = "Железнодорожный переезд")
public class Task6Solution implements Solution {
    @Override
    public void execute() {
        RailwayCrossing crossing = new RailwayCrossing();
        new Train(crossing).start();
        Random random = new Random();
        int carNumber = 1;
        while (true) {
            new Car("Машина " + carNumber++, crossing).start();
            try {
                Thread.sleep(2000 + random.nextInt(3000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }


    }
}