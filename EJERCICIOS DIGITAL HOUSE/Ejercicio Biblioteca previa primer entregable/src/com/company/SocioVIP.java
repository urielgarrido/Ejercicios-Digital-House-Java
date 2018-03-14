package com.company;

public class SocioVIP extends Socio {
    private Integer cuotaMensual;
    public SocioVIP(String nombre, String apellido, Integer identificacion,Integer cuotaMensual) {
        super(nombre, apellido, identificacion);
        cantidadDeEjemplaresARetirar = 15;
        this.cuotaMensual=cuotaMensual;
    }

    public Integer getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(Integer cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }



    @Override
    public String toString() {
        return super.toString()+'\n'+"Su cuota mensual es: "+getCuotaMensual();
    }
}
