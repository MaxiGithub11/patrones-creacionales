package org.example.factory.abstactFactory.entities;

public class RestauranteMexicanoFactory implements FactoryRestaurante{
    @Override
    public Plato crearPlato() {
        return new PlatoMexicano();
    }

    @Override
    public Empleado crearEmpleado() {
        return new EmpleadoMexicano();
    }
}
