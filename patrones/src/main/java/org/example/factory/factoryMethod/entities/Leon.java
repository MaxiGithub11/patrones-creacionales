package org.example.factory.factoryMethod.entities;

public class Leon implements Animal {

    @Override
    public void emitirSonido() {
        System.out.println("Rugiendo");
    }

    @Override
    public void alimentarse() {
        System.out.println("Cazando..");
    }
}
