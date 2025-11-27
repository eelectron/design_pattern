package org.example.proxy.virtual;

public class HighResImage implements Image{

    private String fileName;
    public HighResImage(String fileName){
        this.fileName = fileName;
        loadImageFromDisk(fileName);
    }

    private void loadImageFromDisk(String fileName) {
        System.out.println("Loading 50 MB image from disk " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying image from : " + fileName);
    }
}
