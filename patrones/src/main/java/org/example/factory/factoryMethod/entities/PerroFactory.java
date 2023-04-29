package org.example.factory.factoryMethod.entities;

public class PerroFactory implements AnimalFactory{
    @Override
    public Animal crearAnimal() {
        return new Perro();
    }
}
