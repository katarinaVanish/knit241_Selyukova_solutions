package org.knit.solutions.sem2.lab2_5.Task2_15;

public class ImageProxy implements Image{
    private String filename;
    private RealImage realImage;

    public ImageProxy(String filename){
        this.filename = filename;
    }

    @Override
    public void display(){
        if (realImage == null){
            realImage = new RealImage(filename);
        } else {
            System.out.println("Картинка " + filename + " взята из кэша.");
        }
        realImage.display();

    }
}
