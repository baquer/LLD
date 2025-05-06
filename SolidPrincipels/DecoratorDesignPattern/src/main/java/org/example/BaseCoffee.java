package org.example;

public class BaseCoffee implements Coffee{
    @Override
    public String description() {
        return "Base Coffee";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}
