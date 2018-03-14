package com.company;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String nombre;
    private Integer isbn;
    private String autor;
    private List<Ejemplar>listaDeEjemplares;

    public Libro(String nombre, Integer isbn, String autor) {
        this.nombre = nombre;
        this.isbn = isbn;
        this.autor = autor;
        this.listaDeEjemplares=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void agregarNuevoEjemplar(Ejemplar unEjemplar){
        listaDeEjemplares.add(unEjemplar);
    }

    public Boolean tieneEjemplaresDisponibles(){
       if (!listaDeEjemplares.isEmpty()){
           return true;
       }else return false;
    }

    public Ejemplar prestarEjemplar(){
        Ejemplar ejemplarPrestado=null;
        if (tieneEjemplaresDisponibles()){
           ejemplarPrestado=listaDeEjemplares.remove(0);
        }
        return ejemplarPrestado;
    }

    public void reingresarEjemplar(Ejemplar unEjemplar){
        listaDeEjemplares.add(unEjemplar);
    }


    @Override
    public String toString() {
        return "Nombre del libro: "+ getNombre() +'\n'+"ISBN: "+getIsbn()+'\n'+"Autor: "+getAutor();
    }

    @Override
    public boolean equals(Object obj) {
        Libro unLibro = (Libro)obj;
        if (unLibro.getIsbn().equals(isbn)){
            return true;
        }else return false;
    }
}
