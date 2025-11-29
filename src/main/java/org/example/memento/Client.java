package org.example.memento;

public class Client {
    static void main() {
        CareTaker careTaker = new CareTaker();
        TextEditor textEditor = new TextEditor();
        String text1 = textEditor.type("Version 1");
        Memento version1 = textEditor.save();
        careTaker.saveState(version1);

        String text2 = textEditor.type("Version 2");
        Memento version2 = textEditor.save();
        careTaker.saveState(version2);

        textEditor.restore(careTaker.undo());
        System.out.println(textEditor.getText());

        textEditor.restore(careTaker.undo());
        System.out.println(textEditor.getText());
    }
}
