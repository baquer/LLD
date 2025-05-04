package org.example;

public class LogisticFactory {
    public static Logistic assignLogistic(String type) {
        if("Road".equalsIgnoreCase(type)) {
            return new RoadDelivery();
        } else if("Air".equalsIgnoreCase(type)) {
            return new AirDelivery();
        }
        return null;
    }
}
