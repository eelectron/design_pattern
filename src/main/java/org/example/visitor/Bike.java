package org.example.visitor;

public class Bike implements Vehicle{
    private int price = 1000;

    @Override
    public void accept(VehicleVisitor visitor) {
        visitor.visit(this);
    }

    public int getPrice() {
        return price;
    }
}
