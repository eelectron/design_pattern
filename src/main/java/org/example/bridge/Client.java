package org.example.bridge;

public class Client {
    static void main() {
        Circle redCircle = new Circle(new RedColor());
        System.out.println(redCircle.draw());

        Circle blueCircle = new Circle(new BlueColor());
        System.out.println(blueCircle.draw());

        Square redSquare = new Square(new RedColor());
        System.out.println(redSquare.draw());

        Square blueSquare = new Square(new BlueColor());
        System.out.println(blueSquare.draw());
    }
}
