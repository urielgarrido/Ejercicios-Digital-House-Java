package com.company.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class TorreDeControl {
    private List<Volable> listaDeVolables;

    public TorreDeControl(){
        listaDeVolables=new ArrayList<>();
    }

    public void vuelenTodos(){
        for (Volable unVolable :listaDeVolables) {
            unVolable.volar();
        }
    }

    public void agregarVolador(Volable unVolable){
        listaDeVolables.add(unVolable);
    }
}
