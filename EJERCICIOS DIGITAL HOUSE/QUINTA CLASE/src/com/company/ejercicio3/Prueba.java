package com.company.ejercicio3;

public class Prueba {

    private Integer dificultadRequerida;
    private Integer energiaRequerida;

    public void setDificultadRequerida(Integer dificultadRequerida){
        this.dificultadRequerida=dificultadRequerida;
    }
    public void setEnergiaRequerida(Integer energiaRequerida){
        this.energiaRequerida=energiaRequerida;
    }

    public Integer getDificultadRequerida() {
        return dificultadRequerida;
    }

    public Integer getEnergiaRequerida() {
        return energiaRequerida;
    }

    public Boolean puedeRealizar(Atleta unAtleta){
       if (unAtleta.getNivel() >= dificultadRequerida && unAtleta.getEnergia() >= energiaRequerida){
           return true;
       }
       return false;
    }



}
