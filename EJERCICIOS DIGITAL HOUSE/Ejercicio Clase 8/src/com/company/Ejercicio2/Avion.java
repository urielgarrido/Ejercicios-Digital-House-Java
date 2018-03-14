package com.company.Ejercicio2;

public class Avion implements Volable {
    private Integer horasDeVuelo;

    public Avion(Integer horasDeVuelo) {
        this.horasDeVuelo = horasDeVuelo;
    }

    public Integer getHorasDeVuelo() {
        return horasDeVuelo;
    }

    public void setHorasDeVuelo(Integer horasDeVuelo) {
        this.horasDeVuelo = horasDeVuelo;
    }

    @Override
    public void volar() {
        setHorasDeVuelo(getHorasDeVuelo()+13);
        System.out.println("Estoy volando como avion");
    }
}
