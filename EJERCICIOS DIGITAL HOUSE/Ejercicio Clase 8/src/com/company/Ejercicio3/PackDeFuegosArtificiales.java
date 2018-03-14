package com.company.Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class PackDeFuegosArtificiales implements FuegosArtificiales {
    @Override
    public void explotar() {
        for (FuegosArtificiales unFuegoArtificial:listaDeFuegosArtificiales) {
            unFuegoArtificial.explotar();
        }
    }

    private List<FuegosArtificiales> listaDeFuegosArtificiales;

    public PackDeFuegosArtificiales(){
        listaDeFuegosArtificiales=new ArrayList<>();
    }

    public void agregarFuegoALaLista(FuegosArtificiales unFuegoArtiicial){
        listaDeFuegosArtificiales.add(unFuegoArtiicial);
    }
}
