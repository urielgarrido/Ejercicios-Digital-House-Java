package com.company;

public class ProductoIndividual implements Vendible {

    private Double precio;

    public ProductoIndividual(Double precio) {
        this.precio = precio;
    }

    public Double informarPrecio(){
        return precio;
    }

}
