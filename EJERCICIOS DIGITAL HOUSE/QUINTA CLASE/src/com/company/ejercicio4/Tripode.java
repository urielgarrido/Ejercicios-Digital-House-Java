package com.company.ejercicio4;

public class Tripode {
    private Boolean plegado;
    private Integer alturaMaxima;
    private Integer alturaMinima;
    private Integer alturaActual;


    public Tripode(Integer alturaMinima,Integer alturaMaxima, Integer alturaActual){
        this.alturaMinima=alturaMinima;
        this.alturaMaxima=alturaMaxima;
        this.alturaActual=alturaActual;
    }
    /*
    Definir el método definirAltura(Integer nuevaAltura), que reciba una altura y modifique el valor de la altura
actual.
     */

    public void definirAltura(Integer nuevaAltura){
        alturaActual=nuevaAltura;
    }
    /*
     Definir el método plegar(), que permita plegar el trípode
     */

    public Boolean plegar(){
        plegado=true;
        return true;
    }
    /*
    Definir el método desplegar(), que permita desplegar el trípode.
     */
    public Boolean desplegar(){
        plegado=false;
        return true;
    }

    /*
    Definir el método guardar(), que permita dejar el trípode listo para guardar. Es decir, debe estar plegado y
su altura actual debe ser la mínima posible.
     */

    public Boolean guardar(){
        plegar();
        alturaActual=alturaMinima;
        return true;
    }

    /*
    Definir el método listoParaGuardar?(), que permita controlar si el trípode está listo para guardarse. Es
decir, debe estar plegado y con altura actual mínima
     */
    public Boolean listoParaGuardar(){
        if (guardar()){
            return true;
        }
        return false;
    }

    /*
    Definir el método usar(), que permita usar el trípode. Un trípode está listo para usar si está desplegado y
con altura mayor a la mitad de la altura máxima.
     */
    public Boolean usar(){
        if (desplegar() && alturaActual > alturaMaxima/2){
            return true;
        }
        return false;
    }

    /*
    Definir el método listoParaUsar?(), que permita controlar si el trípode está listo para ser usado. Es decir,
debe estar desplegado y con altura mayor a la mitad de la altura máxima.
     */

    public Boolean listoParaUsar(){
        if (usar()){
            return true;
        }
        return false;
    }

}
