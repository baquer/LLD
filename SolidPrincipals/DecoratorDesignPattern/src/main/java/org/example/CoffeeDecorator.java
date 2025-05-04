package org.example;

public class CoffeeDecorator implements Coffee {

    Coffee coffee;


    CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String description() {
        return coffee.description();
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }
}
