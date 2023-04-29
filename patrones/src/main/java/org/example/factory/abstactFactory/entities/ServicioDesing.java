package org.example.factory.abstactFactory.entities;

public class ServicioDesing implements ServicioInformatico {
    @Override
    public void mostrarTrabajo() {
        System.out.println("En este trabajo damos servicio de Diseño grafico");
    }

    @Override
    public void cotizartrabajo() {
        System.out.println("Cotizando el trabajo del area de Diseño grafico");
    }

    @Override
    public void asignarTrabajo() {
        System.out.println("Asigno un trabajo al area de diseño");
    }
}
