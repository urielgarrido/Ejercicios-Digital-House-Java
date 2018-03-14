package com.company;

import java.util.ArrayList;
import java.util.List;

public class Socio {
    private String nombre;
    private String apellido;
    private Integer identificacion;
    protected List<Ejemplar>listaDeEjemplaresRetirados;
    protected Integer cantidadDeEjemplaresARetirar;

    public Socio(String nombre, String apellido, Integer identificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        cantidadDeEjemplaresARetirar=3;
        listaDeEjemplaresRetirados=new ArrayList<>();
    }

    public Integer getCantidadDeEjemplaresARetirar() {
        return cantidadDeEjemplaresARetirar;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getIdentificacion() {
        return identificacion;
    }

    public Boolean tieneCupoDisponible(){
        if (listaDeEjemplaresRetirados.size()<=cantidadDeEjemplaresARetirar){
            return true;
        }else return false;
    }

    public void tomarPrestadoUnEjemplar(Ejemplar unEjemplar){
        listaDeEjemplaresRetirados.add(unEjemplar);
    }

    public void devolverUnEjemplar( Ejemplar unEjemplar){
        listaDeEjemplaresRetirados.remove(unEjemplar);
    }

    @Override
    public boolean equals(Object obj) {
        Socio unSocio = (Socio)obj;
        if (unSocio.getIdentificacion().equals(identificacion)){
            return true;
        }else return false;
    }

}
