package org.knit.solutions.sem2.lab2_4.Task2_12;

import java.util.Stack;

public class Caretaker {
    private final TextEditor editor;
    private final Stack<Memento> history = new Stack<>();

    public Caretaker(TextEditor editor){
        this.editor = editor;
        save();
    }

    public void save(){
        history.push(editor.saveState());
    }

    public void undo(){
        if (history.size() > 1){
            history.pop();
            editor.restoreState(history.peek());
        } else {
            System.out.println("Отменять больше нельзя!");
        }
    }
}
