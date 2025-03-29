package org.knit.solutions.sem2.lab2_4.Task2_13;

public class TVOnCommand implements Command {
    private TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.turnOn();
    }

    public void undo() {
        tv.turnOff();
    }
}
