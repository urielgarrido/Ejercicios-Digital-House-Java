package com.company.Ejercicio1;

public class ClienteIndividual extends Cliente {

    private String nombre;
    private String apellido;
    private Integer dni;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getDni() {
        return dni;
    }



}
