package com.company.Ejercicio1;

import com.company.Ejercicio1.EmpleadosDeLimpieza;

public class EmpleadosRestaurante extends EmpleadosDeLimpieza {

    public EmpleadosRestaurante(String unNombre, String unApellido, Integer unDni, Integer unSueldo) {
        super(unNombre, unApellido, unDni, unSueldo);
    }

    @Override
    public void limpiar() {
        System.out.println(super.getSueldo());
    }
}
