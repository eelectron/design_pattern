package org.example.visitor;

public class TaxVisitor implements VehicleVisitor{
    @Override
    public void visit(Car car) {
        System.out.println("Calculating tax for car :" + car.getPrice() * 0.15);
    }

    @Override
    public void visit(Bike bike) {
        System.out.println("Calculating tax for bike :" + bike.getPrice() * 0.10);
    }
}
