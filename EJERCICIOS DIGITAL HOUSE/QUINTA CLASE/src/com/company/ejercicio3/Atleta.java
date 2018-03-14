package com.company.ejercicio3;

public class Atleta {

    private String nombre;
    private Integer energia;
    private Integer nivel;

    public Atleta(String unNombre){
        nombre=unNombre;
    }

public void setNivel(Integer unNivel){
    nivel=unNivel;
}
public void setEnergia(Integer unaEnergia){
    energia=unaEnergia;
}

    public Integer getEnergia() {
        return energia;
    }

    public Integer getNivel() {
        return nivel;
    }
}
