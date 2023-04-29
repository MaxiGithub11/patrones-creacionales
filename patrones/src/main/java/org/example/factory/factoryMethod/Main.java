package org.example.factory.factoryMethod;

import org.example.factory.factoryMethod.entities.Animal;
import org.example.factory.factoryMethod.entities.AnimalFactory;
import org.example.factory.factoryMethod.entities.LeonFactory;
import org.example.factory.factoryMethod.entities.PerroFactory;

public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory;
        Animal animal;

        System.out.println("--- Creacion  Leon ---");
        animalFactory = new LeonFactory();
        animal = animalFactory.crearAnimal();
        animal.emitirSonido();
        animal.alimentarse();

        System.out.println("--- Creacion Perro ---");
        animalFactory = new PerroFactory();
        animal = animalFactory.crearAnimal();
        animal.emitirSonido();
        animal.alimentarse();
    }
}