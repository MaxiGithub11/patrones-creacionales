package org.example.singleton;

public class SoyUnica {
    private String nombre;
    private static SoyUnica soyUnica;

    // El constructor es privado, no permite que se genere un constructor por defecto
    private SoyUnica(String nombre) {
        this.nombre = nombre;
        System.out.println("Mi nombre es " + this.nombre);
    }
     public static SoyUnica getSingletonInstance(String nombre){
        if (soyUnica==null){
            soyUnica= new SoyUnica(nombre);
         }
         else{
             System.out.println("No se puede crear el objeto " + nombre + " porque ya existe un objeto con la clase  SoyUnica");
         }

         return soyUnica;
     }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static SoyUnica getSoyUnica() {
        return soyUnica;
    }

    public static void setSoyUnica(SoyUnica soyUnica) {
        SoyUnica.soyUnica = soyUnica;
    }
}
