package com.Ejercicio2;

public class Main {
    public static void main(String[] args){

        EmpleadoAPlazoFijo empleado1 = new EmpleadoAPlazoFijo();

        empleado1.setSueldoBasico(15000);
        System.out.println(empleado1.getSueldoBasico());
        empleado1.registrarMesesPorContrato(9);
        System.out.println(empleado1.getRegistroDeMeses());

        Venta venta1 = new Venta(5000,20000);
        Venta venta2 = new Venta(3000,15000);
        RegistroDeVentas registro1 =new RegistroDeVentas();
        EmpleadoAComision empleado2 = new EmpleadoAComision();
        empleado2.setSueldoBasico(100000);
        empleado2.getSueldoBasico();
        registro1.registrarVenta(venta1);
        registro1.registrarVenta(venta2);
        System.out.println(registro1.getVentasRealizadas());

        EmpleadoATiempoIndeterminado empleado3 = new EmpleadoATiempoIndeterminado(2,3);
        empleado3.cobrarSueldo();
        System.out.println(empleado3.getSueldo());

    }
}
