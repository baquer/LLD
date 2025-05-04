package org.example;

public class Engineer implements Eatable, Worker{
    @Override
    public void eat() {
        System.out.println("Eat");
    }

    @Override
    public void work() {
        System.out.println("Work");
    }
}
