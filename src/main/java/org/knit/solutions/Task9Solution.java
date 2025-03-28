package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.sem2.lab2_2.Task2_9.Factory;

/*
Описание задачи
На заводе работают три типа рабочих, каждый из которых выполняет свою часть работы в конвейерном режиме:

Штамповщик – вырезает заготовку (создает объект детали).
Сборщик – собирает из заготовки готовую деталь.
Оператор контроля качества – проверяет деталь и отправляет на склад.
Каждый рабочий – отдельный поток, и они должны работать последовательно, используя общую очередь для передачи деталей.

Требования к решению
Использовать потоки (Thread или ExecutorService).
Использовать синхронизацию (wait(), notify(), BlockingQueue).
Реализовать конвейерную передачу данных между потоками.

Подсказки к решению
Использовать BlockingQueue для передачи деталей между рабочими.
Штамповщик передает заготовку сборщику, а тот – оператору контроля.
Потоки должны ждать, если предыдущий этап не завершен.

Дополнительные идеи
Добавить случайные задержки в работе потоков (Thread.sleep()) для имитации времени обработки.
Ограничить размер склада (например, если на складе уже 5 деталей, оператор контроля ждет, пока не освободится место).
Реализовать обработку брака – если деталь не соответствует стандарту, она отправляется на доработку.
 */

@TaskDescription(taskNumber = 9, taskDescription = "Конвейер сборки деталей")
public class Task9Solution implements Solution{
    @Override
    public void execute(){
        Factory factory = new Factory();

        new Thread(() -> {
            try {
                factory.stamp();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();

        new Thread(() -> {
            try {
                factory.assemble();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();

        new Thread(() -> {
            try {
                factory.qualityCheck();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();
    }
}
