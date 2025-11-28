package org.example.composite;

import java.util.ArrayList;
import java.util.List;

public class GraphicGroup implements Graphic{
    private List<Graphic> graphicList = new ArrayList<Graphic>();

    public void addGraphic(Graphic graphic){
        graphicList.add(graphic);
    }

    @Override
    public void draw() {
        for(Graphic graphic : graphicList){
            graphic.draw();
        }
    }
}
