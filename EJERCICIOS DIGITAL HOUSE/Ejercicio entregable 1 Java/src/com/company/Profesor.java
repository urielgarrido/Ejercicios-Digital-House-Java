package com.company;

public class Profesor {
    private String nombre;
    private String apellido;
    private Integer antiguedad;
    private Integer codigoDeProfesor;

    public Profesor(String nombre, String apellido, Integer antiguedad, Integer codigoDeProfesor) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.antiguedad = antiguedad;
        this.codigoDeProfesor = codigoDeProfesor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public Integer getCodigoDeProfesor() {
        return codigoDeProfesor;
    }

    @Override
    public boolean equals(Object obj) {
        Profesor unProfesor=(Profesor)obj;
        if (unProfesor.getCodigoDeProfesor().equals(codigoDeProfesor)){
            return true;
        }else return true;
    }
}
