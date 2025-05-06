package org.example;

public class LatteCoffeeDecorator extends CoffeeDecorator{
    LatteCoffeeDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.description() + " Latte";
    }

    public double getCost() {
        return coffee.getCost() + 18.0;
    }
}
