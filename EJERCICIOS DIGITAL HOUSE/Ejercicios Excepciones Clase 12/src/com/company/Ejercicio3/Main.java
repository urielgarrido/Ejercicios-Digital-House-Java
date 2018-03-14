package com.company.Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        try {
        List<String> arrayDeString = null;

        arrayDeString.add("Pato");
        arrayDeString.add("Perro");
        arrayDeString.add("Gato");

        System.out.println(arrayDeString.get(2));
    }catch (Exception e){
            e.printStackTrace();
            System.out.println("El programa no está funcionando");
        }

        try {
            List<String>arrayDeString = new ArrayList<>();
            arrayDeString.add("Pato");
            arrayDeString.add("Perro");
            arrayDeString.add("Gato");

            System.out.println(arrayDeString.get(5));

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("No funciona el programa che");
        }



    }
}
