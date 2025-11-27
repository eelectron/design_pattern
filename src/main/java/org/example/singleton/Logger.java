package org.example.singleton;

public class Logger {
    private Logger(){}

    private static class Holder {
        private static final Logger INSTANCE = new Logger();
    }

    public static Logger getInstance(){
        return Holder.INSTANCE;
    }
}
