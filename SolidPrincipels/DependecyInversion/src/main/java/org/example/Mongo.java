package org.example;

public class Mongo implements Database{
    @Override
    public void connect() {
        System.out.println("Connect to Mongo!");
    }
}
