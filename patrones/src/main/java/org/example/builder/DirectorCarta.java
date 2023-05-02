package org.example.builder;

public class DirectorCarta {

    public void crearCuartoDeLibra(Builder builder){
        builder.setMenuType(MenuType.CUARTO_DE_LIBRA);
        builder.setPan(2);
        builder.setCarne(1);
        builder.setCheddar(2);
        builder.setCebolla(Boolean.TRUE);
        builder.setSalsa(Boolean.TRUE);
    }
    public void crearDobleCuartoDeLibra(Builder builder){
        builder.setMenuType(MenuType.DOBLE_CUARTO_DE_LIBRA);
        builder.setPan(2);
        builder.setCarne(2);
        builder.setCheddar(2);
        builder.setCebolla(Boolean.TRUE);
        builder.setSalsa(Boolean.TRUE);
    }
    public void crearBicMac(Builder builder){
        builder.setMenuType(MenuType.BIGMAC);
        builder.setPan(3);
        builder.setCarne(2);
        builder.setCheddar(1);
        builder.setLechuga(Boolean.TRUE);
        builder.setSalsa(Boolean.TRUE);
    }
    public void crearMcNifica(Builder builder){
        builder.setMenuType(MenuType.MCNIFICA);
        builder.setPan(2);
        builder.setCarne(1);
        builder.setCheddar(1);
        builder.setLechuga(Boolean.TRUE);
        builder.setSalsa(Boolean.TRUE);
        builder.setTomate(Boolean.TRUE);
    }
    public void crearCajitaFeliz(Builder builder){
        builder.setMenuType(MenuType.CAJITA_FELIZ);
        builder.setNuggets(6);
        builder.setPapa(Boolean.TRUE);
        builder.setAgua(Boolean.TRUE);
    }
    public void crearGrandTastyDoble(Builder builder){
        builder.setMenuType(MenuType.GRAND_TASTY_DOBLE);
        builder.setPan(2);
        builder.setCarne(2);
        builder.setCheddar(2);
        builder.setLechuga(Boolean.TRUE);
        builder.setTomate(Boolean.TRUE);
        builder.setSalsa(Boolean.TRUE);
    }
    public void crearGrandTastyTriple(Builder builder){
        builder.setMenuType(MenuType.GRAND_TASTY_TRIPLE);
        builder.setPan(2);
        builder.setCarne(3);
        builder.setCheddar(3);
        builder.setLechuga(Boolean.TRUE);
        builder.setTomate(Boolean.TRUE);
        builder.setSalsa(Boolean.TRUE);
    }
    public void crearEnsalada(Builder builder){
        builder.setTomate(Boolean.TRUE);
        builder.setLechuga(Boolean.TRUE);
        builder.setCebolla(Boolean.TRUE);
        builder.setPollo(1);
    }
    public void crearMcFlurryOreo(Builder builder){
        builder.setCremaHelada(2);
        builder.setOreo(6);
    }
    public void crearDesayuno(Builder builder){
        builder.setCafe(1);
        builder.setLeche(Boolean.TRUE);
    }


}
