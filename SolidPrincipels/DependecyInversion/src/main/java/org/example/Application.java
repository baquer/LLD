package org.example;

public class Application {

    private Database database;

    // Dependency Injection
    Application(Database database) {
        this.database = database;
    }

    public void start() {
        database.connect();
    }

}
