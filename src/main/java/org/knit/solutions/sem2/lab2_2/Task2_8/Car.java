package org.knit.solutions.sem2.lab2_2.Task2_8;

public class Car extends Thread {
    private final TrafficLight trafficLight;

    public Car(String name, TrafficLight trafficLight) {
        super(name);
        this.trafficLight = trafficLight;
    }

    @Override
    public void run() {
        trafficLight.waitForGreen();

    }
}

