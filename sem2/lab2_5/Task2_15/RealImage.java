package org.knit.solutions.sem2.lab2_5.Task2_15;

public class RealImage implements Image{
    private String filename;

    public RealImage(String filename){
        this.filename = filename;
        loadFromServer();
    }

    private void loadFromServer(){
        System.out.println("Изображение " + filename + " загружается с сервера...");
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public void display(){
        System.out.println("Картинка " + filename);
    }
}
