package org.knit.solutions.sem2.lab2_5.Task2_14;

public class VirusScannerVisitor implements FileSystemVisitor {
    @Override
    public void visit(File file) {
        System.out.println("Сканирование файла на вирусы: " + file.getName());
    }

    @Override
    public void visit(Folder folder) {
        for(FileSystemElement element : folder.getChildren()){
            element.accept(this);
        }
    }

    @Override
    public void visit(Shortcut shortcut) {
        System.out.println("Пропуск ярлыка");
    }
}
