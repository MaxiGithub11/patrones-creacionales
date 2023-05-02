package org.example.prototype;

public class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void draw() {
        System.out.println("Dibujando un rectangulo con ancho " + width + " y altura " + height);
    }

    public Shape clone() {
        return new Rectangle(this.width, this.height);
    }
}

