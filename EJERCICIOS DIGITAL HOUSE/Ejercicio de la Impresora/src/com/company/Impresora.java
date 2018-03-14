package com.company;

import java.util.ArrayList;
import java.util.List;

public class Impresora {

    private List<Imprimible> cosasImprimir;

    public Impresora(){
        cosasImprimir = new ArrayList<>();
    }

    public void agregarACola(Imprimible unImprimible){
        cosasImprimir.add(unImprimible);
    }

    public void imprimirImprimibles(List<Imprimible> cosasImportantes){
        for (Imprimible unaCosasImportante : cosasImportantes) {
            unaCosasImportante.imprimir();
        }
    }

    public void imprimir(){
        for (int i=0;i<cosasImprimir.size();i++){
            Imprimible unImprimible=cosasImprimir.get(i);
            unImprimible.imprimir();
        }
        for (Imprimible unImprimible:cosasImprimir) {
            unImprimible.imprimir();
        }
    }


}
