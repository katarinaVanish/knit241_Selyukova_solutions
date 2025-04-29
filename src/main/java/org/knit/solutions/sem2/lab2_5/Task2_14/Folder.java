package org.knit.solutions.sem2.lab2_5.Task2_14;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemElement{
    private String name;
    private List<FileSystemElement> children = new ArrayList<>();

    public Folder(String name){
        this.name = name;
    }

    public void addElement(FileSystemElement element){
        children.add(element);
    }

    public List<FileSystemElement> getChildren() {
        return children;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }
}
