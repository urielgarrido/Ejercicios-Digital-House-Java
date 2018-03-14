package com.Ejercicio2;

public class Venta {

    private Integer montoDeLaComision;
    private Integer montoTotalDeLaVenta;

    public Venta (Integer ElMontoDeLaComision, Integer ElMontoTotalDeLaVenta){
        montoDeLaComision=ElMontoDeLaComision;
        montoTotalDeLaVenta=ElMontoTotalDeLaVenta;
    }

    public Integer getMontoDeLaComision() {
        return montoDeLaComision;
    }

    public Integer getMontoTotalDeLaVenta() {
        return montoTotalDeLaVenta;
    }

    @Override
    public String toString() {
        return ("Monto de la comision: " + getMontoDeLaComision()+ "    "+"Monto total de la venta: "+getMontoTotalDeLaVenta());
    }
}
