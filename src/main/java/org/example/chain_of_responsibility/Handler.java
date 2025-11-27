package org.example.chain_of_responsibility;

public abstract class Handler {
    protected Handler nextHandler;

    public Handler setNextHandler(Handler handler){
        this.nextHandler = handler;
        return handler;
    }

    public abstract void handle(Request request);
}
