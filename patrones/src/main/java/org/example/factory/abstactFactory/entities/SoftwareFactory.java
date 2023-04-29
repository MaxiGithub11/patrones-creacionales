package org.example.factory.abstactFactory.entities;

public class SoftwareFactory implements ServicioFactory{
    @Override
    public ServicioInformatico crearServicio() {
        return new ServicioSoftware();
    }
}
