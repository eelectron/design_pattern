package org.example.observer;

public class Client {
    static void main() {
        Bitcoin bitcoin = new Bitcoin();

        MobileApp mobileApp = new MobileApp();
        WebApp webApp = new WebApp();

        bitcoin.addObserver(mobileApp);
        bitcoin.addObserver(webApp);

        bitcoin.setPrice(128);
    }
}
