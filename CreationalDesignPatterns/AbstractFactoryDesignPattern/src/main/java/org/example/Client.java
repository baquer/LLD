package org.example;

public class Client {

    // Client want to render Button and TextField
    private Button button;
    private TextField textField;

    Client(GUIFactory guiFactory) {
        button = guiFactory.createButton();
        textField = guiFactory.createTextField();
    }

    public void renderAll() {
        button.render();
        textField.render();
    }
}
