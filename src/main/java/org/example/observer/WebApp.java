package org.example.observer;

public class WebApp implements Observer{
    @Override
    public void update(int price) {
        System.out.println("WebApp : Bitcoin price updated : " + price);
    }
}
