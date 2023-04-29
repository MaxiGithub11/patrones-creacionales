package org.example.factory.abstactFactory.entities;

public class MarketingFactory implements ServicioFactory{
    @Override
    public ServicioInformatico crearServicio() {
        return new ServicioMarketing();
    }
}
