package org.example.visitor;

public class Car implements Vehicle{
    private int price = 20000;

    @Override
    public void accept(VehicleVisitor visitor) {
        visitor.visit(this);
    }

    public int getPrice() {
        return price;
    }
}
