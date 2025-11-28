package org.example.mediator;

public class Client {
    static void main() {
        ChatRoom chatRoom = new ChatRoom();

        ChatUser u1 = new ChatUser(chatRoom, "Prashant");
        ChatUser u2 = new ChatUser(chatRoom, "Prisha");
        ChatUser u3 = new ChatUser(chatRoom, "Lichi");

        chatRoom.addUser(u1);
        chatRoom.addUser(u2);
        chatRoom.addUser(u3);

        u1.send("Good Morning ...");
    }
}
