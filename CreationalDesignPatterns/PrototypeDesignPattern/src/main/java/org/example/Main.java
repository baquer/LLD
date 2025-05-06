package org.example;

public class Main {
    public static void main(String[] args) {
        CirclePrototype mainObject = new CirclePrototype(10);
        // Clone object
        CirclePrototype cloneObject = mainObject.clone();
    }
}