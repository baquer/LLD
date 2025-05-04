package org.example;

public class CirclePrototype implements Shape {

    private int radius;
    CirclePrototype(int radius) {
        this.radius = radius;
    }
    @Override
    public Shape clone() {
        return new CirclePrototype(this.radius);
    }

    @Override
    public void draw() {
        System.out.println("Circle has radius " + radius);
    }
}
