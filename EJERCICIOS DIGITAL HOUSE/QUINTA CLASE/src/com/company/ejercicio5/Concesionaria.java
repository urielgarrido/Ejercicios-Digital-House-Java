package com.company.ejercicio5;

import java.util.ArrayList;

public class Concesionaria {

    private ArrayList<Venta> registroDeVentas;

    public Concesionaria(){
        this.registroDeVentas=new ArrayList<>();
    }

    public void registrarVenta(Venta ventaAgregar){
        this.registroDeVentas.add(ventaAgregar);
        System.out.println("Venta registrada" + registroDeVentas);
    }

}
