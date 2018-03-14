package com.company;

import java.util.ArrayList;

public class Carrito {

    private ArrayList<Vendible> vendibles;

    public Carrito() {
        vendibles = new ArrayList<>();
    }

    public Double sumaTotal(){
        Double sumaParcial=0.0;
        for (int i=0; i<vendibles.size();i++){
            sumaParcial+=vendibles.get(i).informarPrecio();
        }
        return sumaParcial;
    }

    public void agregarVendible(Vendible unVendible){
        vendibles.add(unVendible);
    }

    public void eliminar(Vendible unVendible){
        vendibles.remove(unVendible);
    }
}
