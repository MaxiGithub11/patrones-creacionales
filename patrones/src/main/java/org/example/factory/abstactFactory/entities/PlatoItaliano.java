package org.example.factory.abstactFactory.entities;

public class PlatoItaliano implements Plato {
    @Override
    public void detallesPlato() {
        System.out.println("Pasta italiana");
    }
}
