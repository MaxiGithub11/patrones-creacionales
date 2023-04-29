package org.example.factory.factoryMethod.entities;

public class Perro implements Animal{
    @Override
    public void emitirSonido() {
        System.out.println("Ladrando");
    }

    @Override
    public void alimentarse() {
        System.out.println("Comiendo alimento..");
    }
}
