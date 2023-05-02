package org.example.prototype;

public class Main {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(10, 5);
        Shape circle = new Circle(7);

        Shape clonedRectangle = rectangle.clone();
        Shape clonedCircle = circle.clone();

        System.out.println("Rectangulo prototipo:");
        rectangle.draw();
        System.out.println("Rectangulo clonado:");
        clonedRectangle.draw();

        System.out.println();

        System.out.println("Circulo prototipo:");
        circle.draw();
        System.out.println("Circulo clonado:");
        clonedCircle.draw();
    }
}
