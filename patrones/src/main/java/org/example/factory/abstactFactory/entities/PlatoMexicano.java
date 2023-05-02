package org.example.factory.abstactFactory.entities;

public class PlatoMexicano implements Plato {
    @Override
    public void detallesPlato() {
        System.out.println("Tacos mexicanos");
    }
}
