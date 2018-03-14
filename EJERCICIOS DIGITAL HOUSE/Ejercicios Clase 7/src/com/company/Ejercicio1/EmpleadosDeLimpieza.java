package com.company.Ejercicio1;

public abstract class EmpleadosDeLimpieza {

    private String nombre;
    private String apellido;
    private Integer dni;
    private Integer sueldo;

    public EmpleadosDeLimpieza(String unNombre, String unApellido, Integer unDni, Integer unSueldo){
        nombre=unNombre;
        apellido=unApellido;
        dni=unDni;
        sueldo=unSueldo;
    }

    public void setSueldo(Integer sueldo) {
        this.sueldo = sueldo;
    }

    public Integer getSueldo() {
        return sueldo;
    }

    public abstract void limpiar();
}
