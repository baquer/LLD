package org.example;

public class Singleton {


    // Run time Singleton

    private static final Singleton obj = new Singleton();

    private Singleton() {}

    public Singleton getInstance() {
        return obj;
    }

    
}
