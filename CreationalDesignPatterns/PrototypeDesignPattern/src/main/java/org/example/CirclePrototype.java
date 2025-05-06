package org.example;
public class CirclePrototype implements Prototype<CirclePrototype> {

    private Integer radius;

    CirclePrototype(Integer radius) {
        this.radius = radius;
    }

    @Override
    public CirclePrototype clone() {
        return new CirclePrototype(radius);
    }
}
