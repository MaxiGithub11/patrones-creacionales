package org.example.factory.abstactFactory;

import org.example.factory.abstactFactory.entities.MarketingFactory;
import org.example.factory.abstactFactory.entities.ServicioFactory;
import org.example.factory.abstactFactory.entities.ServicioInformatico;
import org.example.factory.abstactFactory.entities.SoftwareFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int op;
        boolean salir = false;
        do{
            mostrarServicios();
            System.out.println("Ingrese el servicio que desea utilizar!");
            op=read.nextInt();
            switch (op){
                case 1:
                    usarServicio(new MarketingFactory());
                    break;
                case 2:
                    usarServicio(new SoftwareFactory());
                    break;
                case 3:
                    usarServicio(new MarketingFactory());
                    break;
                case 4:
                    salir=true;
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida!");
            }

        }while (salir==false);
    }

    public static void usarServicio(ServicioFactory factory){
        ServicioInformatico servicio = factory.crearServicio();
        servicio.mostrarTrabajo();
        servicio.asignarTrabajo();
        servicio.cotizartrabajo();
    }

    public static void mostrarServicios(){
        System.out.println();
        System.out.println("---- MENU -----");
        System.out.println("1-Sevicio Diseño Grafico");
        System.out.println("2-Sevicio Software");
        System.out.println("3-Sevicio Marketing");
        System.out.println("4-Salir");
    }
}
