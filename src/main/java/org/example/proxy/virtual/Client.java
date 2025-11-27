package org.example.proxy.virtual;

public class Client {
    static void main() {
        Image image = new ImageProxy("photo.png");
        image.display();
        image.display();
    }
}
