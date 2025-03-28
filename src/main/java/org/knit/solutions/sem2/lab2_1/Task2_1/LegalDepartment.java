package org.knit.solutions.sem2.lab2_1.Task2_1;


public class LegalDepartment extends Handler{
    @Override
    protected boolean canHandle(Problem problem) {
        return problem.getSeverity() == 3 && problem.getCategory().equals("юридическая");
    }

    @Override
    protected void processComplaint(Problem problem) {
        System.out.println("Юридический отдел решил проблему: " + problem.getDescription());
    }
}
