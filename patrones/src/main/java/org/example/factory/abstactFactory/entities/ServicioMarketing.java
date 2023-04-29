package org.example.factory.abstactFactory.entities;

public class ServicioMarketing implements ServicioInformatico{
    @Override
    public void mostrarTrabajo() {
        System.out.println("En este trabajo te damos servio de marketing para tu empresa");
    }
    @Override
    public void cotizartrabajo() {
        System.out.println("Cotizando el trabajo del area de Marketing");
    }
    @Override
    public void asignarTrabajo() {
        System.out.println("Asigno un trabajo al area de Marketing");
    }
}
