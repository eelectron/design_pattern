package org.example.observer;

public class MobileApp implements Observer{
    @Override
    public void update(int price) {
        System.out.println("Mobile app : Bitcoin price updated : " + price);
    }
}
