package com.company;

public class ProfesorAdjunto extends Profesor {
    private Integer horasDeConsultas;

    public ProfesorAdjunto(String nombre, String apellido, Integer antiguedad, Integer codigoDeProfesor,Integer horasDeConsultas) {
        super(nombre, apellido, antiguedad, codigoDeProfesor);
        this.horasDeConsultas=horasDeConsultas;
    }

    public Integer getHorasDeConsultas() {
        return horasDeConsultas;
    }
}
