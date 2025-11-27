package org.example.singleton;

public class Singleton {
    private Singleton(){}

    private static class Holder {
        private final static Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance(){
        return Holder.INSTANCE;
    }
}
