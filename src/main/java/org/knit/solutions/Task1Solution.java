package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.sem2.lab2_1.Task2_1.*;

/*
Задача 2.1 Chain of Responsibility (Цепочка обязанностей)
Описание:
Этот паттерн используется для передачи запроса по цепочке обработчиков, пока один из них не обработает его.
Каждый обработчик в цепочке может либо обработать запрос, либо передать его дальше.

Задача:
Реализуйте систему обработки жалоб клиентов в банке.
Жалоба сначала поступает в колл-центр.
Если проблема сложная, запрос передается менеджеру.
Если даже менеджер не может решить проблему, запрос уходит в юридический отдел.
Каждый уровень обработки либо решает проблему, либо передает ее дальше.
 */

@TaskDescription(taskNumber = 1, taskDescription = "Chain of Responsibility (Цепочка обязанностей)", href = "org.knit.solutions.Task1")

public class Task1Solution implements Solution{
    @Override
    public void execute() {

            Handler callCenter = new CallCenter();
            Handler manager = new Manager();
            Handler legalDepartment = new LegalDepartment();
            Handler director = new Director();

            callCenter.setNextHandler(manager);
            manager.setNextHandler(legalDepartment);
            legalDepartment.setNextHandler(director);

            Problem problem1 = new Problem("Долгое ожидание на линии", 1, "общая");
            Problem problem2 = new Problem("Ошибка в выписке счета", 2, "финансовая");
            Problem problem3 = new Problem("Юридическая ошибка в договоре", 3, "юридическая");
            Problem problem4 = new Problem("Финансовая махинация", 4, "финансовая");

            callCenter.handleComplaint(problem1);
            callCenter.handleComplaint(problem2);
            callCenter.handleComplaint(problem3);
            callCenter.handleComplaint(problem4);



    }
}
