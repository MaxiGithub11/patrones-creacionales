package org.example.factory.abstactFactory;

import org.example.factory.abstactFactory.entities.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        FactoryRestaurante factoryRestaurante;
        Empleado empleado;
        Plato plato;

        System.out.println("CREANDO RESTAURANTE ITALIANO");
        factoryRestaurante = new RestauranteItalianoFactory();
        empleado= factoryRestaurante.crearEmpleado();
        plato=factoryRestaurante.crearPlato();

        empleado.servir();
        plato.detallesPlato();

        System.out.println();
        System.out.println("CREANDO RESTAURANTE MEXICANO");
        factoryRestaurante= new RestauranteMexicanoFactory();
        empleado= factoryRestaurante.crearEmpleado();
        plato=factoryRestaurante.crearPlato();

        empleado.servir();
        plato.detallesPlato();
    }

}
