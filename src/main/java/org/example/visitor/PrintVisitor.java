package org.example.visitor;

public class PrintVisitor implements VehicleVisitor{
    @Override
    public void visit(Car car) {
        System.out.println("Car price :" + car.getPrice());
    }

    @Override
    public void visit(Bike bike) {
        System.out.println("Bike price :" + bike.getPrice());
    }
}
