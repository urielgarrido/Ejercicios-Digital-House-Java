package com.company.ejercicio4;

public class Main {
    public static void main(String[] args){

/*
Definir una nueva clase llamada Main y crear un método main. Dentro del método main crear un trípode y
hacer pruebas con los métodos definidos anteriormente.
 */

Tripode tripode1 = new Tripode(30,50,35);

        tripode1.usar();
        tripode1.desplegar();
        tripode1.guardar();
        tripode1.plegar();
        tripode1.listoParaGuardar();
        tripode1.listoParaUsar();
        tripode1.definirAltura(33);
    }
}

