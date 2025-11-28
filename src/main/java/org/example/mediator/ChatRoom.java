package org.example.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator{
    private List<User> userList = new ArrayList<User>();

    @Override
    public void sendMessage(String msg, User user) {
        for(User u : userList){
            if(u != user){
                u.receive(msg);
            }
        }
    }

    @Override
    public void addUser(User user) {
        userList.add(user);
    }
}
