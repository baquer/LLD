package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Logistic road = LogisticFactory.assignLogistic("Road");
        Logistic air = LogisticFactory.assignLogistic("Air");

        assert road != null;
        road.deliver("123");
        assert air != null;
        air.deliver("345");
    }
}