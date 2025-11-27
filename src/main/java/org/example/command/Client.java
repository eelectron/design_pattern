package org.example.command;

public class Client {
    static void main() {
        Document document = new Document();

        Button saveButton = new Button(new SaveCommand(document));
        saveButton.click();

        Button printButton = new Button(new PrintCommand(document));
        printButton.click();
    }
}
