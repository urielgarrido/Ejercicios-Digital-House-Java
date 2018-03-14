package com.company.Ejercicio1;

public class Main {

    public static void main(String[] args) {

        EmpleadosRestaurante empleado1 = new EmpleadosRestaurante("Uriel", "garrido", 40675474, 30000);
        EmpleadosLavavajillas empleado2 = new EmpleadosLavavajillas("Maxi", "Garrido", 22406785, 15000);

        empleado1.limpiar();
        empleado2.limpiar();
    }
}
