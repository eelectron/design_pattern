package org.example.observer;

import java.util.ArrayList;
import java.util.List;

public class Bitcoin implements Subject{
    private int price;
    private List<Observer> observerList = new ArrayList<>();

    // update new bitcoin price
    public void setPrice(int price){
        this.price = price;

        // notify all observer when price changes
        notifyObservers();
    }

    @Override
    public Observer addObserver(Observer observer) {
        observerList.add(observer);
        return observer;
    }

    @Override
    public Observer removeObserver(Observer observer) {
        observerList.remove(observer);
        return observer;
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList){
            observer.update(price);
        }
    }
}
