package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shape circlePrototype = new CirclePrototype(5);
        circlePrototype.draw();
        circlePrototype.clone();
    }
}