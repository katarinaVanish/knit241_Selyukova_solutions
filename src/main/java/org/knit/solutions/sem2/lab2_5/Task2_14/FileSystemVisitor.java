package org.knit.solutions.sem2.lab2_5.Task2_14;

public interface FileSystemVisitor {
    void visit(File file);
    void visit(Folder folder);
    void visit(Shortcut shortcut);
}
