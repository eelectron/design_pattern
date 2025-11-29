package org.example.memento;

import java.util.Stack;

public class CareTaker {
    private Stack<Memento> history = new Stack<>();

    public void saveState(Memento memento) {
        history.push(memento);
    }

    public Memento undo(){
        if(history.isEmpty()){
            return null;
        }

        return history.pop();
    }
}
