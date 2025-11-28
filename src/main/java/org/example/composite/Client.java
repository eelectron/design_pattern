package org.example.composite;

public class Client {
    static void main() {
        Graphic dot1 = new Dot();
        Graphic dot2 = new Dot();

        GraphicGroup graphicGroup1 = new GraphicGroup();
        graphicGroup1.addGraphic(dot1);
        graphicGroup1.addGraphic(dot2);

        Graphic dot3 = new Dot();

        GraphicGroup graphicGroup2 = new GraphicGroup();
        graphicGroup2.addGraphic(dot3);
        graphicGroup2.addGraphic(graphicGroup1);

        graphicGroup2.draw();
    }
}
