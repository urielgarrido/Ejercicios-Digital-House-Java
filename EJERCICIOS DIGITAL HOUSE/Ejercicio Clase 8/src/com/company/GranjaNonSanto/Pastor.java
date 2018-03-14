package com.company.GranjaNonSanto;

import java.util.ArrayList;
import java.util.List;

public class Pastor {
    private List<Pastoreo> listaDeAnimales;

    public Pastor (){
        listaDeAnimales=new ArrayList<>();
    }
    public void agregarAnimal(Pastoreo unAnimal){
        listaDeAnimales.add(unAnimal);
    }

    public void pastar(){
        for (Pastoreo unAnimal:listaDeAnimales) {
            unAnimal.pastar();
        }
    }

}
