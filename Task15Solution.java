package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.sem2.lab2_5.Task2_15.*;

/*
Задача:
Создайте удаленную библиотеку изображений.

При запросе изображения оно загружается с сервера (имитация через задержку в коде).
Картинка хранится как объект класса RealImage.
Прокси-объект ImageProxy должен лениво загружать изображение и кэшировать его для повторного использования.
📌 Подсказка:
ImageProxy должен проверять, создан ли объект RealImage. Если нет — создавать его.
 */

@TaskDescription(taskNumber = 15, taskDescription = "Паттерн Прокси (Proxy)")
public class Task15Solution implements Solution{

    @Override
    public void execute() {
        Image img1 = new ImageProxy("cat.png");
        Image img2 = new ImageProxy("dog.png");

        img1.display();
        System.out.println();

        img1.display();
        System.out.println();

        img2.display();
    }
}
