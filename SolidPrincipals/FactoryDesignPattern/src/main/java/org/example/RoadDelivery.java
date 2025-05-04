package org.example;

public class RoadDelivery implements Logistic{
    @Override
    public void deliver(String packageId) {
        System.out.println("This Package" + packageId + "is delivered via Road");
    }
}
