package com.Ejercicio2;

import java.util.ArrayList;

public class RegistroDeVentas {

    private ArrayList<Venta> ventasRealizadas = new ArrayList<>();

    public ArrayList<Venta> getVentasRealizadas() {
        return ventasRealizadas;
    }

    public void registrarVenta(Venta unaVenta){
        ventasRealizadas.add(unaVenta);
    }

}
