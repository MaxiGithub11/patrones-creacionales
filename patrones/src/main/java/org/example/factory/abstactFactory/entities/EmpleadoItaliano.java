package org.example.factory.abstactFactory.entities;

public class EmpleadoItaliano implements Empleado {
    @Override
    public void servir() {
        System.out.println("Sirviendo el plato hablando italiano");
    }
}
