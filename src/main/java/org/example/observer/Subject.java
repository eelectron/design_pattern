package org.example.observer;

public interface Subject {
    Observer addObserver(Observer observer);
    Observer removeObserver(Observer observer);
    void notifyObservers();
}
