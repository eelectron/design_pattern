package org.example.visitor;

public interface VehicleVisitor {
    void visit(Car car);
    void visit(Bike bike);
}
