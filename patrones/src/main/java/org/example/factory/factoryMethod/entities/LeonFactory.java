package org.example.factory.factoryMethod.entities;

public class LeonFactory implements AnimalFactory{
    @Override
    public Animal crearAnimal() {
        return new Leon();
    }
}
