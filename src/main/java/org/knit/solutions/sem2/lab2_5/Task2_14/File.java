package org.knit.solutions.sem2.lab2_5.Task2_14;

public class File implements FileSystemElement{
    private String name;
    private int size;

    public File(String name, int size){
        this.name = name;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }

}
