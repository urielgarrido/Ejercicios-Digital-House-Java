package com.company.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GuardaRopas guardaRopas = new GuardaRopas();
        Prenda prenda1 = new Prenda("Polo","31");
        Prenda prenda2 = new Prenda("Kevingston", "40");

        List<Prenda> listaDePrendas = new ArrayList<>();
        listaDePrendas.add(prenda1);
        listaDePrendas.add(prenda2);
        guardaRopas.guardarPrendas(listaDePrendas);
        guardaRopas.mostrarPrendas();
        guardaRopas.devolverPrendas(1);
    }
}
