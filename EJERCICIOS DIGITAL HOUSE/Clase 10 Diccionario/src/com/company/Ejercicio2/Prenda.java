package com.company.Ejercicio2;

public class Prenda {
    private String marca;
    private String modelo;

    public Prenda(String unaMarca, String unModelo){
        marca=unaMarca;
        modelo=unModelo;
    }

    @Override
    public String toString() {
        return marca +" "+ modelo;
    }
}
