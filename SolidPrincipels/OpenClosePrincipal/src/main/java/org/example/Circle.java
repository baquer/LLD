package org.example;

public class Circle implements Shape {

    private Integer radius;

    Circle(Integer radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14 * radius * radius;
    }
}
