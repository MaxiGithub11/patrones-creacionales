package org.example.prototype;

public class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Dibujando un circulo con radio " + radius);
    }

    public Shape clone() {
        return new Circle(this.radius);
    }
}
