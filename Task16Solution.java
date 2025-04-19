package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.sem2.lab2_5.Task2_16.*;
import org.knit.solutions.sem2.lab2_5.Task2_16.Character;

/*
Задача:
Реализуйте систему отображения символов текста на экране.

Каждый символ (Character) имеет внутреннее состояние (код символа) и внешнее состояние (координаты x, y и стиль).
Используйте Фабрику приспособленцев, чтобы повторно использовать объекты символов и уменьшить количество объектов, создаваемых в системе.
📌 Подсказка:
Внешнее состояние передается в метод render(), а внутреннее хранится внутри объектов, создаваемых фабрикой.
 */

@TaskDescription(taskNumber = 16, taskDescription = "Паттерн Приспособленец (Flyweight)")
public class Task16Solution implements Solution{
    @Override
    public void execute() {
        CharacterFactory factory = new CharacterFactory();

        String text = "ABAC";
        int x = 0;
        for (char ch : text.toCharArray()) {
            Character character = factory.getCharacter(ch);
            character.render(x, 10, "Bold");
            x += 10;
        }
        Character character = factory.getCharacter('A');
        character.render(x, 0, "Italic");

        System.out.println("Всего уникальных объектов символов: " + factory.getTotalCharacters());

    }
}
