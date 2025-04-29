package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.sem2.lab2_5.Task2_14.*;

/*
Задача:
Создайте систему управления файловыми объектами.
Есть три типа файловых объектов:

Файлы,
Папки,
Ссылки (ярлыки).
Требуется реализовать два посетителя:

Сканер вирусов, который проверяет каждый файл на наличие вирусов.
Анализатор размера, который подсчитывает общий размер файлов (ссылки не учитываются).
📌 Подсказка:
Каждый файл, папка и ссылка должны реализовывать интерфейс FileSystemElement. В accept() методе вызывается соответствующий метод визитера.
 */

@TaskDescription(taskNumber = 14, taskDescription = "Паттерн Визитер (Visitor)")
public class Task14Solution implements Solution{
    @Override
    public void execute() {
        File file1 = new File("file1.txt", 100);
        File file2 = new File("file2.txt", 200);
        Folder folder = new Folder("MyFolder");
        folder.addElement(file1);
        folder.addElement(file2);
        folder.addElement(new Shortcut(file1));

        VirusScannerVisitor scanner = new VirusScannerVisitor();
        folder.accept(scanner);

        SizeAnalyzerVisitor sizeAnalyzer = new SizeAnalyzerVisitor();
        folder.accept(sizeAnalyzer);
        System.out.println("Общий размер файлов: " + sizeAnalyzer.getTotalSize());
    }
}
