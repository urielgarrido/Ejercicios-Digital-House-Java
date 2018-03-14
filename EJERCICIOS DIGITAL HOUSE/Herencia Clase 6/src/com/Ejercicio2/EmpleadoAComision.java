package com.Ejercicio2;

public class EmpleadoAComision extends Empleado {

    private Integer comisionPorVentasRealizadas;

    public void setComisionPorVentasRealizadas(Integer comisionPorVentasRealizadas) {
        this.comisionPorVentasRealizadas = comisionPorVentasRealizadas;
    }

    public Integer getComisionPorVentasRealizadas() {
        return comisionPorVentasRealizadas;
    }

    @Override
    public Integer getSueldoBasico() {
        System.out.println(super.getSueldoBasico());
        return super.getSueldoBasico();
    }
}
