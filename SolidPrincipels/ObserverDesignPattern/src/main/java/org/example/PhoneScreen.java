package org.example;

public class PhoneScreen implements Observer{
    @Override
    public void update(float temp) {
        System.out.println("Temp updated to " + temp);
    }
}
