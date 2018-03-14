package com.company.Ejercicio2;

public class Main {

    public static void main(String[] args) {
        Pato pato1 = new Pato(10);
        Avion avion1 = new Avion(16);
        Superman superman = new Superman(100);
        TorreDeControl torreDeControl = new TorreDeControl();
        torreDeControl.agregarVolador(pato1);
        torreDeControl.agregarVolador(superman);
        torreDeControl.agregarVolador(avion1);
        torreDeControl.vuelenTodos();
    }
}
