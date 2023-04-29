package org.example.singleton;

public class Main {
    public static void main(String[] args) {
        SoyUnica sofi= SoyUnica.getSingletonInstance("Sofia Souza");
        SoyUnica maria= SoyUnica.getSingletonInstance("Maria Valdez");

        System.out.println(sofi.getNombre());
        System.out.println(maria.getNombre());


    }
}
