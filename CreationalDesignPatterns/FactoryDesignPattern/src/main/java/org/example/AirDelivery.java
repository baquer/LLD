package org.example;

public class AirDelivery implements Logistic {
    @Override
    public void deliver(String packageId) {
        System.out.println("This Package" + packageId + "is delivered via Air");
    }
}
