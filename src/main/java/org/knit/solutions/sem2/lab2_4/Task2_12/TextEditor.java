package org.knit.solutions.sem2.lab2_4.Task2_12;

public class TextEditor {
    private String text = "";

    public void write(String newText){
        text += newText;
    }

    public String getText(){
        return text;
    }

    public Memento saveState(){
        return new Memento(text);
    }

    public void restoreState(Memento memento){
        text = memento.getState();
    }
}
