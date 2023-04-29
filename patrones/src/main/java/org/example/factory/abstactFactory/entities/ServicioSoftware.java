package org.example.factory.abstactFactory.entities;

public class ServicioSoftware implements ServicioInformatico{
    @Override
    public void mostrarTrabajo() {
        System.out.println("Este trabajo se encarga del desarrollo de Software");
    }
    @Override
    public void cotizartrabajo() {
        System.out.println("Cotizando el trabajo del area de Software");
    }
    @Override
    public void asignarTrabajo() {
        System.out.println("Aisgno un trabajo a el area de Software!");
    }
}
