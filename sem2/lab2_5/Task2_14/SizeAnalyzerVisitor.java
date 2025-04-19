package org.knit.solutions.sem2.lab2_5.Task2_14;

public class SizeAnalyzerVisitor implements FileSystemVisitor {
    private int totalSize = 0;

    public int getTotalSize() {
        return totalSize;
    }

    @Override
    public void visit(File file) {
        totalSize += file.getSize();
    }

    @Override
    public void visit(Folder folder) {
        for (FileSystemElement element: folder.getChildren()){
            element.accept(this);
        }
    }

    @Override
    public void visit(Shortcut shortcut) {
        // Ссылки не учитываются
    }
}
