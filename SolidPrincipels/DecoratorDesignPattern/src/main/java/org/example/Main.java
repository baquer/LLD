package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Coffee coffee = new BaseCoffee();
        LatteCoffeeDecorator latteCoffeeDecorator = new LatteCoffeeDecorator(coffee);
        System.out.println(latteCoffeeDecorator.getCost());
        System.out.println(latteCoffeeDecorator.getDescription());
    }
}