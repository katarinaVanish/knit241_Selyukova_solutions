package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.sem2.lab2_1.Task2_3.*;

public class Task3Solution implements Solution{
    @Override
    public void execute(){
        Transport businessCar = TransportFactory.getTransport("business");
        System.out.println(businessCar.getSpecifications());

        Transport familyVan = TransportFactory.getTransport("family");
        System.out.println(familyVan.getSpecifications());

        Transport motorbike = TransportFactory.getTransport("delivery");
        System.out.println(motorbike.getSpecifications());
    }

}
