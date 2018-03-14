package com.company.Ejercicio2;

public class Pato implements Volable {

    private Integer energia;

    public Pato(Integer unaEnergia){
        energia=unaEnergia;
    }

    public Integer getEnergia() {
        return energia;
    }

    public void setEnergia(Integer energia) {
        this.energia = energia;
    }

    @Override
    public void volar() {
        setEnergia(getEnergia()-5);
        System.out.println("Estoy volando como pato");
    }
}
