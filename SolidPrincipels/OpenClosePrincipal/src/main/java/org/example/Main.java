package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Shape shape = new Circle(10);
        Shape shape2 = new Rectangle(10, 20);

        AreaCalculator areaCalculator = new AreaCalculator();
        System.out.println(areaCalculator.calculateArea(shape));
        System.out.println(areaCalculator.calculateArea(shape2));
    }
}