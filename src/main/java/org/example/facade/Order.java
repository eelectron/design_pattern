package org.example.facade;

public class Order {
    private int id;
    private double amount;
    private String card;

    public int id() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public String card() {
        return card;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCard(String card) {
        this.card = card;
    }
}
