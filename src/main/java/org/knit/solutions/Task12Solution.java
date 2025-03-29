package org.knit.solutions;

import org.knit.solutions.sem2.lab2_4.Task2_12.*;
import org.knit.TaskDescription;

import java.util.Scanner;

/*
Разработайте систему, позволяющую сохранять состояния текста в редакторе и откатывать изменения назад.

Требуется:
Создать класс TextEditor, который содержит текущий текст документа.
Создать класс Memento, который будет хранить снимок состояния текста.
Реализовать Caretaker, который управляет историей изменений (например, стек сохранённых состояний).
Реализовать методы saveState() и undo() для сохранения и отката изменений.

Пример работы:
Пользователь вводит текст "Hello, world!".
Он сохраняет текущее состояние.
Затем добавляет " How are you?".
Нажимает "Отменить" и возвращается к "Hello, world!".
Дополнительно: Реализуйте возможность нескольких уровней отката.
 */

@TaskDescription(taskNumber = 12, taskDescription = "Паттерн Memento (Хранитель)")
public class Task12Solution implements Solution{
    @Override
    public void execute(){
        Scanner scanner = new Scanner(System.in);
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker(editor);

        while (true) {
            System.out.println("Текущий текст: " + editor.getText());
            System.out.println("Выберите действие: (1) Написать текст, (2) Сохранить, (3) Отменить, (4) Выход");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Введите текст:");
                    String newText = scanner.nextLine();
                    editor.write(newText);
                    break;
                case 2:
                    caretaker.save();
                    System.out.println("Сохранено!");
                    break;
                case 3:
                    caretaker.undo();
                    System.out.println("Отмена последнего изменения!");
                    break;
                case 4:
                    System.out.println("Выход...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Неверный ввод, попробуйте снова.");
            }
        }
    }
}
