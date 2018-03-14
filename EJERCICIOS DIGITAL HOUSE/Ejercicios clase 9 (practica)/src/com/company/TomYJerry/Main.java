package com.company.TomYJerry;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Raton raton =new Raton(10);
        Raton raton1 = new Raton(4);
        Raton raton2 = new Raton(7);
        List<Raton> listaDeRatones = new ArrayList<>();
        Gato gato = new Gato("Tom");
        gato.comerRaton(raton);
        listaDeRatones.add(raton);
        listaDeRatones.add(raton2);
        gato.comerRaton(listaDeRatones);
        gato.comerRaton(raton1);
        gato.correr(2);
        gato.meConvieneComerA(raton1,5);
    }
}
