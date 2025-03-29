package org.knit.solutions.sem2.lab2_4.Task2_13;

public class TVOffCommand implements Command{
    private TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.turnOff();
    }

    public void undo() {
        tv.turnOn();
    }
}
