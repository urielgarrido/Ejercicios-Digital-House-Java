package com.company.ejercicio1;

public class Cliente {
    private String nombre;
    private String apellido;

    public Cliente(String unNombre, String unApellido){
        nombre=unNombre;
        apellido=unApellido;
    }

    public void setNombre(String unNombre){
        nombre=unNombre;
    }
    public void setApellido(String unApellido){
        apellido=unApellido;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }
}
