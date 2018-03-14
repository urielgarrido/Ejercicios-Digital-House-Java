package com.company.ejercicio5;

public class Main {
    public static void main(String[] args){

        /*
        Dentro del método main crear un auto, crear
un cliente y registrar una venta de la Concesionaria de dicho vehículo y dicho cliente.
         */

        Cliente cliente1 = new Cliente("Uriel", "Garrido", 1530385573);
        Vehiculo auto1 = new Vehiculo("Toyota", "Corola", 2010, "Blanco", 100);
        Venta venta1 = new Venta(350000.0,auto1,cliente1);
        Venta venta2 = new Venta(500000.0,auto1,cliente1);
        Concesionaria registro1 = new Concesionaria();
        Concesionaria registro2 = new Concesionaria();

        registro1.registrarVenta(venta1);
        registro2.registrarVenta(venta2);
    }
}
