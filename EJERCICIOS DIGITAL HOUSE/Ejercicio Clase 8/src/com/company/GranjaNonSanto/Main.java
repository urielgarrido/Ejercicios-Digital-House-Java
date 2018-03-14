package com.company.GranjaNonSanto;

public class Main {
    public static void main(String[] args){

        Vaca vaca=new Vaca();
        Pollo pollo= new Pollo();
        Oveja oveja= new Oveja();
        Pastor pastor= new Pastor();

        pastor.agregarAnimal(vaca);
        pastor.agregarAnimal(pollo);
        pastor.agregarAnimal(oveja);
        pastor.pastar();
    }
}
