package org.example.builder;

public class Main {
    public static void main(String[] args) {
        System.out.println("Preparando...");

        DirectorCarta directorCarta = new DirectorCarta();

        MenuBuilder menuBuilder = new MenuBuilder();
        directorCarta.crearCuartoDeLibra(menuBuilder);

        Menu menu = menuBuilder.getMenu();
        System.out.println(menu.getType());

    }
}
