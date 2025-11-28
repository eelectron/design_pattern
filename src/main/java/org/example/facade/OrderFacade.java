package org.example.facade;

public class OrderFacade {
    private InventoryService inventoryService = new InventoryService();
    private PaymentService paymentService = new PaymentService();
    private InvoiceService invoiceService = new InvoiceService();

    public void placeOrder(Order order){
        inventoryService.reduceItem(order.id());
        paymentService.pay(order.getAmount(), order.card());
        invoiceService.generate();
    }
}
