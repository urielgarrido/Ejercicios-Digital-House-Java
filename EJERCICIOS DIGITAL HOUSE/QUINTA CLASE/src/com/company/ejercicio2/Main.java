package com.company.ejercicio2;

public class Main {

    public static void main(String[] args) {
/*
Definir una nueva clase llamada Main y crear un método main. Dentro del método main crear a dos
jugadores de fútbol, seteando los atributos que sean necesarios, y crear una sesión de entrenamiento con
los atributos necesarios y que ambos jugadores realicen un entrenamiento.

 */

JugadorDeFutbol mejorJugador = new JugadorDeFutbol("messi",50,100,40);
JugadorDeFutbol segundoMejorJugador = new JugadorDeFutbol("ronaldo",100,70,20);

mejorJugador.entrenarA(mejorJugador);
        System.out.println("-----------------------------");
segundoMejorJugador.entrenarA(segundoMejorJugador);
    }
}
