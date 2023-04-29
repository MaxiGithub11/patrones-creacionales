package org.example.builder;

public class Menu {
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
    private Integer leche;
    private Integer nuggets;
    private Integer cremaHelada;
    private Integer oreo;

    public Menu(MenuType type, Integer carne, Integer pollo, Boolean tomate, Boolean lechuga, Boolean cebolla,
                Boolean papa, Integer cheddar, Boolean gaseosa, Boolean agua, Integer pan, Boolean salsa,
                Integer cafe, Integer leche, Integer nuggets, Integer cremaHelada, Integer oreo) {
        this.type = type;
        this.carne = carne;
        this.pollo = pollo;
        this.tomate = tomate;
        this.lechuga = lechuga;
        this.cebolla = cebolla;
        this.papa = papa;
        this.cheddar = cheddar;
        this.gaseosa = gaseosa;
        this.agua = agua;
        this.pan = pan;
        this.salsa = salsa;
        this.cafe = cafe;
        this.leche = leche;
        this.nuggets = nuggets;
        this.cremaHelada = cremaHelada;
        this.oreo = oreo;
    }

    public MenuType getType() {
        return type;
    }

    public void setType(MenuType type) {
        this.type = type;
    }

    public Integer getCarne() {
        return carne;
    }

    public void setCarne(Integer carne) {
        this.carne = carne;
    }

    public Integer getPollo() {
        return pollo;
    }

    public void setPollo(Integer pollo) {
        this.pollo = pollo;
    }

    public Boolean getTomate() {
        return tomate;
    }

    public void setTomate(Boolean tomate) {
        this.tomate = tomate;
    }

    public Boolean getLechuga() {
        return lechuga;
    }

    public void setLechuga(Boolean lechuga) {
        this.lechuga = lechuga;
    }

    public Boolean getCebolla() {
        return cebolla;
    }

    public void setCebolla(Boolean cebolla) {
        this.cebolla = cebolla;
    }

    public Boolean getPapa() {
        return papa;
    }

    public void setPapa(Boolean papa) {
        this.papa = papa;
    }

    public Integer getCheddar() {
        return cheddar;
    }

    public void setCheddar(Integer cheddar) {
        this.cheddar = cheddar;
    }

    public Boolean getGaseosa() {
        return gaseosa;
    }

    public void setGaseosa(Boolean gaseosa) {
        this.gaseosa = gaseosa;
    }

    public Boolean getAgua() {
        return agua;
    }

    public void setAgua(Boolean agua) {
        this.agua = agua;
    }

    public Integer getPan() {
        return pan;
    }

    public void setPan(Integer pan) {
        this.pan = pan;
    }

    public Boolean getSalsa() {
        return salsa;
    }

    public void setSalsa(Boolean salsa) {
        this.salsa = salsa;
    }

    public Integer getCafe() {
        return cafe;
    }

    public void setCafe(Integer cafe) {
        this.cafe = cafe;
    }

    public Integer getLeche() {
        return leche;
    }

    public void setLeche(Integer leche) {
        this.leche = leche;
    }

    public Integer getNuggets() {
        return nuggets;
    }

    public void setNuggets(Integer nuggets) {
        this.nuggets = nuggets;
    }

    public Integer getCremaHelada() {
        return cremaHelada;
    }

    public void setCremaHelada(Integer cremaHelada) {
        this.cremaHelada = cremaHelada;
    }

    public Integer getOreo() {
        return oreo;
    }

    public void setOreo(Integer oreo) {
        this.oreo = oreo;
    }
}
