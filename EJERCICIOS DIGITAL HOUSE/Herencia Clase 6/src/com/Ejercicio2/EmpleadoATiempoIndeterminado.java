package com.Ejercicio2;

public class EmpleadoATiempoIndeterminado extends Empleado {

    private Integer suplementoPorAntiguedad;
    private Integer suplementoPorHijos;
    private Integer sueldo;

    public EmpleadoATiempoIndeterminado (Integer antiguedad, Integer hijos){
        suplementoPorAntiguedad=100*antiguedad;
        suplementoPorHijos=200*hijos;
    }

    public Integer getSuplementoPorAntiguedad() {
        return suplementoPorAntiguedad;
    }

    public Integer getSuplementoPorHijos() {
        return suplementoPorHijos;
    }

    public void setSueldo(Integer sueldo) {
        this.sueldo = sueldo;
    }

    public Integer getSueldo() {
        return sueldo;
    }

    public void cobrarSueldo(){
        super.setSueldoBasico(2000);
        setSueldo(super.getSueldoBasico()+getSuplementoPorAntiguedad()+getSuplementoPorHijos());
    }

}
