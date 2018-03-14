package com.company;

import java.util.ArrayList;

public class Combo implements Vendible {
    private ArrayList<Vendible> vendibles;
    private Double descuento;

    public Combo(Double descuento) {
        this.descuento = descuento;
        this.vendibles=new ArrayList<>();
    }

    @Override
    public Double informarPrecio() {

        Double sumaParcial=0.0;

        for (int i=0; i<vendibles.size();i++){

           sumaParcial+=vendibles.get(i).informarPrecio();
        }
        return sumaParcial*(1-descuento);
    }
    public void agregarVendible(Vendible unVendible){
        vendibles.add(unVendible);
    }

    public void eliminar(Vendible unVendible){
        vendibles.remove(unVendible);
    }

}
