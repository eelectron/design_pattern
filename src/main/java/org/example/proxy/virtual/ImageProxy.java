package org.example.proxy.virtual;

public class ImageProxy implements Image{
    private String fileName;
    private Image realImage;

    public ImageProxy(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new HighResImage(fileName);
        }
        realImage.display();
    }
}
