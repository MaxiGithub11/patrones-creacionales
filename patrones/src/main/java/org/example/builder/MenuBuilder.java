package org.example.builder;

public class MenuBuilder implements Builder{
    private MenuType type;
    private Integer carne;
    private Integer pollo;
    private Boolean tomate;
    private Boolean lechuga;
    private Boolean cebolla;
    private Boolean papa;
    private Integer cheddar;
    private Boolean gaseosa;
    private Boolean agua;
    private Integer pan;
    private Boolean salsa;
    private Integer cafe;
    private Boolean leche;
    private Integer nuggets;
    private Integer cremaHelada;
    private Integer oreo;
    @Override
    public void setMenuType(MenuType type) {
        this.type = type;
    }

    @Override
    public void setCarne(int carne) {
        this.carne = carne;
    }

    @Override
    public void setPollo(int pollo) {
        this.pollo = pollo;
    }

    @Override
    public void setTomate(Boolean tomate) {
        this.tomate = tomate;
    }

    @Override
    public void setLechuga(Boolean lechuga) {
        this.lechuga = lechuga;
    }

    @Override
    public void setCebolla(Boolean cebolla) {
        this.cebolla = cebolla;
    }

    @Override
    public void setPapa(Boolean papa) {
        this.papa = papa;
    }

    @Override
    public void setCheddar(int cheddar) {
        this.cheddar = cheddar;
    }

    @Override
    public void setGaseosa(Boolean gaseosa) {
        this.gaseosa = gaseosa;
    }

    @Override
    public void setAgua(Boolean agua) {
        this.agua = agua;
    }

    @Override
    public void setPan(int pan) {
        this.pan = pan;
    }

    @Override
    public void setSalsa(Boolean salsa) {
        this.salsa = salsa;
    }

    @Override
    public void setCafe(int cafe) {
        this.cafe = cafe;
    }

    @Override
    public void setLeche(Boolean leche) {
        this.leche = leche;
    }

    @Override
    public void setNuggets(int nuggets) {
        this.nuggets = nuggets;
    }

    @Override
    public void setCremaHelada(int cremaHelada) {
        this.cremaHelada = cremaHelada;
    }

    @Override
    public void setOreo(int oreo) {
        this.oreo = oreo;
    }

    public Menu getMenu(){
        return new Menu(type,carne,pollo,tomate, lechuga, cebolla, papa, cheddar, gaseosa,
                        agua, pan, salsa,cafe, leche, nuggets, cremaHelada, oreo);
    }
}
