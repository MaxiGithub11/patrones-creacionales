package org.example.factory.abstactFactory.entities;

public class DesingFactory implements ServicioFactory{
    @Override
    public ServicioInformatico crearServicio() {
        return new ServicioDesing();
    }
}
