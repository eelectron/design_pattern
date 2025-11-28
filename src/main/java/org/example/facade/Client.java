package org.example.facade;

public class Client {
    static void main() {
        Order order = new Order();
        order.setId(101);
        order.setAmount(1024);
        order.setCard("MasterCard");

        OrderFacade orderFacade = new OrderFacade();
        orderFacade.placeOrder(order);
    }
}
