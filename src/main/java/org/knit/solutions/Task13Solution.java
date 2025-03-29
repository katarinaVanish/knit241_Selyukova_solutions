package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.sem2.lab2_4.Task2_13.*;
import java.util.Scanner;

/*
Вы разрабатываете систему управления "умным домом", где пользователь может выполнять различные команды, такие как включение/выключение света, управление телевизором и кондиционером.

Требуется:
Создать интерфейс Command, который определяет метод execute().
Реализовать классы команд:
LightOnCommand – включает свет.
LightOffCommand – выключает свет.
TVOnCommand – включает телевизор.
TVOffCommand – выключает телевизор.
Создать класс RemoteControl, который хранит команду и позволяет её выполнить.
Реализовать механизм отмены последней команды (undo).

Пример работы:
Пользователь нажимает кнопку "Включить свет" – выполняется LightOnCommand.
Затем нажимает "Выключить телевизор" – выполняется TVOffCommand.
Пользователь нажимает "Отменить последнюю команду" – телевизор снова включается.
Дополнительно: Реализуйте поддержку макрокоманд (например, кнопка "Спокойной ночи" выключает все приборы разом).
 */

@TaskDescription(taskNumber = 13, taskDescription = "Паттерн Command (Команда)")
public class Task13Solution implements Solution{
    public void execute(){
        Scanner scanner = new Scanner(System.in);
        Light light = new Light();
        TV tv = new TV();
        RemoteControl remote = new RemoteControl();

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        Command tvOn = new TVOnCommand(tv);
        Command tvOff = new TVOffCommand(tv);

        while (true) {
            System.out.println("Выберите действие: (1) Включить свет, (2) Выключить свет, (3) Включить ТВ, (4) Выключить ТВ, (5) Отменить последнюю команду, (6) Выход");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    remote.setCommand(lightOn);
                    break;
                case 2:
                    remote.setCommand(lightOff);
                    break;
                case 3:
                    remote.setCommand(tvOn);
                    break;
                case 4:
                    remote.setCommand(tvOff);
                    break;
                case 5:
                    remote.undoLastCommand();
                    break;
                case 6:
                    System.out.println("Выход...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Неверный ввод, попробуйте снова.");
            }
        }
    }
}
