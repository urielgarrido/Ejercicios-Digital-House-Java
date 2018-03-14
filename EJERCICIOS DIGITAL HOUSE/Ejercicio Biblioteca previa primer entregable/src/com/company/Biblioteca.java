package com.company;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Prestamo>listaDePrestamosRealizados;
    private List<Libro>listaDeLibros;
    private List<Socio>listaDeSocios;

    public Biblioteca(){
        listaDeLibros=new ArrayList<>();
        listaDePrestamosRealizados=new ArrayList<>();
        listaDeSocios=new ArrayList<>();
    }
/*
Buscar al libro en la lista de libros de la biblioteca usando el ISBN que me pasan por
parámetro. Almacenar al libro en una variable.
 */

    private Libro buscarLibro(Integer unISBN){
        Libro libroEncontrado=null;
        for (Libro unLibro:listaDeLibros) {
            if (unLibro.getIsbn().equals(unISBN)){
                libroEncontrado=unLibro;
            }
        }
        return libroEncontrado;
    }
    /*
    Buscar al socio en la lista de socios usando el número de identificación que me pasan
por parámetro y almacenarlo en una variable
     */

    private Socio buscarSocio(Integer unNumeroDeIdentificacion){
        Socio socioEncontrado=null;
        for (Socio unSocio:listaDeSocios) {
            if (unSocio.getIdentificacion().equals(unNumeroDeIdentificacion)){
                socioEncontrado=unSocio;
            }
        }
        return socioEncontrado;
    }

    public void prestar(Integer ISBN, Integer numeroDeIdentificacion){
        Libro libroEncontrado=buscarLibro(ISBN);
        Socio socioEncontrado=buscarSocio(numeroDeIdentificacion);
        if(libroEncontrado == null || socioEncontrado == null){
            return;
        }
        if (libroEncontrado.tieneEjemplaresDisponibles()&&socioEncontrado.tieneCupoDisponible()){
            Ejemplar ejemplarAPrestar=libroEncontrado.prestarEjemplar();
            socioEncontrado.tomarPrestadoUnEjemplar(ejemplarAPrestar);
            Prestamo prestamo=new Prestamo(socioEncontrado,ejemplarAPrestar);
            listaDePrestamosRealizados.add(prestamo);
            System.out.println("El socio: "+socioEncontrado+" se llevó el ejemplar: "+ejemplarAPrestar+" el día: "+prestamo.getFecha());
        }
    }
    /*
    Recorrer la lista de socios, comparando si el número de identificación que me pasan por
parámetro coincide con el número de identificación de alguno de la lista y registrar que el
socio devolvió el ejemplar.

Recorrer la lista de libros, comparando si el libro del ejemplar que me pasan por
parámetro coincide con alguno de la lista y registrar que al libro le reingresa el ejemplar.
     */

    public void devolver (Ejemplar unEjemplar, Integer numeroDeIdentificacion){
        for (Socio unSocio:listaDeSocios) {
            if (unSocio.getIdentificacion().equals(numeroDeIdentificacion)){
                unSocio.devolverUnEjemplar(unEjemplar);
                break;
            }
        }
        for (Libro unLibro:listaDeLibros) {
            if (unEjemplar.getLibro().equals(unLibro)){
                unLibro.reingresarEjemplar(unEjemplar);
                break;
            }
        }
    }

}
