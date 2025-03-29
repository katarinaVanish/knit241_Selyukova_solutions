package org.knit.solutions.sem2.lab2_4.Task2_13;

public class TV {
    private boolean on;

    public void turnOn(){
        on = true;
        System.out.println("Телевизор включен");
    }

    public void turnOff(){
        on = false;
        System.out.println("Телевизор выключен");
    }
}
