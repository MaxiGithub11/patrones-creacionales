package org.example.factory.abstactFactory.entities;

public class EmpleadoMexicano implements Empleado {
    @Override
    public void servir() {
        System.out.println("Sirviendo plato, hablando en mexicano");
    }
}
