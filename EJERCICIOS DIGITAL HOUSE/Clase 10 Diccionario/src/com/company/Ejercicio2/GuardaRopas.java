package com.company.Ejercicio2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopas {
    private Map<Integer,List<Prenda>> guardaRopas = new HashMap<>();
    private Integer contador;

    public GuardaRopas(){
        contador=0;
    }

    public Integer guardarPrendas(List<Prenda> listaDePrenda){
        contador++;
        guardaRopas.put(contador,listaDePrenda);
        return contador;
    }

    public void mostrarPrendas(){
        for (Integer contador:guardaRopas.keySet()) {
            System.out.println(contador + " = " +  guardaRopas.get(contador));
        }
    }

    public List<Prenda> devolverPrendas(Integer numero){
        System.out.println(guardaRopas.get(numero));
        return guardaRopas.get(numero);
    }

}
