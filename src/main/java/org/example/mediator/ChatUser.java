package org.example.mediator;

public class ChatUser extends User{

    public ChatUser(ChatMediator chatMediator, String name){
        super(chatMediator, name);
    }

    @Override
    void send(String msg) {
        this.chatMediator.sendMessage(msg, this);
    }

    @Override
    void receive(String msg) {
        System.out.println(name + " received " + msg);
    }
}
