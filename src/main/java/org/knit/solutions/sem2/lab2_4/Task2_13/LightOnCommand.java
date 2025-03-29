package org.knit.solutions.sem2.lab2_4.Task2_13;

public class LightOnCommand implements Command{
    private Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    public void execute(){
        light.turnOn();
    }

    public void undo(){
        light.turnOff();
    }
}
