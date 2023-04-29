package org.example.factory.abstactFactory.entities;

public class RestauranteItalianoFactory implements FactoryRestaurante {
    @Override
    public Plato crearPlato() {
        return new PlatoItaliano();
    }
    @Override
    public Empleado crearEmpleado() {
        return new EmpleadoItaliano();
    }
}
