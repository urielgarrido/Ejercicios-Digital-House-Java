package com.company.ejercicio3;

public class Main {
    public static void main(String[] args){

/*
Definir una nueva clase llamada Main y crear un método main. Dentro del método main crear a dos atletas,
seteando los atributos que sean necesarios, y crear tres pruebas para cada una de ellas, también seteando
los atributos necesarios. Luego, controlar si los atletas pueden realizar dichas pruebas.

 */

    Atleta atleta1 = new Atleta("Uriel");
    Atleta atleta2 = new Atleta("Maxi");
    atleta1.setNivel(120);
    atleta1.setEnergia(60);

    atleta2.setEnergia(200);
    atleta2.setNivel(20);

    Prueba prueba1 = new Prueba();
    Prueba prueba2 = new Prueba();
    Prueba prueba3 = new Prueba();

    prueba1.setDificultadRequerida(3);
    prueba1.setEnergiaRequerida(30);

    prueba2.setEnergiaRequerida(50);
    prueba2.setDificultadRequerida(15);

    prueba3.setDificultadRequerida(50);
    prueba3.setEnergiaRequerida(100);

        System.out.println(prueba1.puedeRealizar(atleta1));
        System.out.println(prueba2.puedeRealizar(atleta1));
        System.out.println(prueba3.puedeRealizar(atleta1));

        System.out.println(prueba1.puedeRealizar(atleta2));
        System.out.println(prueba2.puedeRealizar(atleta2));
        System.out.println(prueba3.puedeRealizar(atleta2));


    }
}
