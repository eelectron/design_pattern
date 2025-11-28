package org.example.mediator;

public abstract class User {
    protected ChatMediator chatMediator;
    protected String name;

    public User(ChatMediator chatMediator, String name){
        this.chatMediator = chatMediator;
        this.name = name;
    }

    abstract void send(String msg);
    abstract void receive(String msg);
}
