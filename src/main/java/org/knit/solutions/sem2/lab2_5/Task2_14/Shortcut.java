package org.knit.solutions.sem2.lab2_5.Task2_14;

public class Shortcut implements FileSystemElement{
    private FileSystemElement target;

    public Shortcut(FileSystemElement target){
        this.target = target;
    }

    public FileSystemElement getTarget() {
        return target;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }
}
