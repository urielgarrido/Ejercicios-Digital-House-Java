package com.company.ejercicio5;

public class Venta {
    private Double montoDeVenta;
    private Vehiculo vehiculo;
    private Cliente cliente;

    public Venta(Double unMontoDeVenta, Vehiculo unVehiculo, Cliente unCliente){
        montoDeVenta=unMontoDeVenta;
        vehiculo=unVehiculo;
        cliente=unCliente;
    }
}
