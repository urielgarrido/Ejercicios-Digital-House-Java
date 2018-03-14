package com.company;

public class Alumno {
    private String nombre;
    private String apellido;
    private Integer codigoDeAlumno;

    public Alumno(String nombre, String apellido, Integer codigoDeAlumno) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoDeAlumno = codigoDeAlumno;
    }
    public Alumno(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public Integer getCodigoDeAlumno() {
        return codigoDeAlumno;
    }

    @Override
    public boolean equals(Object obj) {
        Alumno unAlumno=(Alumno)obj;
        if (unAlumno.getCodigoDeAlumno().equals(codigoDeAlumno)){
            return true;
        }else return false;
    }

    @Override
    public String toString() {
        return getNombre();
    }
}
