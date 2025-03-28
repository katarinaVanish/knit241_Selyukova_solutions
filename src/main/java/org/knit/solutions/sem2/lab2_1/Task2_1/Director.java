package org.knit.solutions.sem2.lab2_1.Task2_1;


public class Director extends Handler {
    @Override
    protected boolean canHandle(Problem problem) {
        return problem.getSeverity() >= 4;
    }

    @Override
    protected void processComplaint(Problem problem) {
        System.out.println("Директор лично рассмотрел и решил проблему: " + problem.getDescription());
    }
}
