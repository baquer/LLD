package org.example;

public class Rectangle implements Shape {

    private Integer length;
    private Integer breadth;

    Rectangle(Integer length, Integer breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length * breadth;
    }
}
