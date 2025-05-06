package org.example;

public class MySQL implements Database {
    @Override
    public void connect() {
        System.out.println("Connect to MYSQL!");
    }
}
