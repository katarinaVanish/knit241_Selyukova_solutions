package org.knit.solutions.sem2.lab2_4.Task2_13;

public class Light {
    private boolean on;

    public void turnOn(){
        on = true;
        System.out.println("Свет включен");
    }

    public void turnOff(){
        on = false;
        System.out.println("Свет выключен");
    }
}
