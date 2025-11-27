package org.example.singleton;

public class Client {
    public static void main() {
        Singleton singleton = Singleton.getInstance();
        System.out.println("Got singleton instance :" + singleton);
    }
}
