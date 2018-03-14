package com.Ejercicio2;

public class EmpleadoAPlazoFijo extends Empleado{

    private Integer registroDeMeses;

    public void setRegistroDeMeses(Integer registroDeMeses) {
        this.registroDeMeses = registroDeMeses;
    }

    public Integer getRegistroDeMeses() {
        return registroDeMeses;
    }

    public void registrarMesesPorContrato(Integer mesesPorContrato){
        setRegistroDeMeses(mesesPorContrato);
    }
}
