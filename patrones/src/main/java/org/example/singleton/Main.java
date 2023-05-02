package org.example.singleton;


public class Main {
    public static void main(String[] args) {
        SoyUnica sofi= SoyUnica.getSingletonInstance("Sofia Souza");
        SoyUnica maria= SoyUnica.getSingletonInstance("Maria Valdez");

        System.out.println(sofi.getNombre());
        System.out.println(maria.getNombre());

        System.out.println(sofi);
        System.out.println(maria);

        Persona objpersona= new Persona("Juana");
        Persona objpersona2= new Persona("Pablo");

        System.out.println("--------------------------");
        System.out.println("Creacion sin Singleton");
        System.out.println(objpersona.getNombre());
        System.out.println(objpersona2.getNombre());
        System.out.println(objpersona);
        System.out.println(objpersona2);

    }
}
