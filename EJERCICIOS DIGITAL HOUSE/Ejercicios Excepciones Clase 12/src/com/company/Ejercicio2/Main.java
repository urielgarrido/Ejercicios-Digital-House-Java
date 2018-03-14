package com.company.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {

            List<String> arrayDeStrings = new ArrayList<>();
            arrayDeStrings.add("Pato");
            arrayDeStrings.add("Perro");
            arrayDeStrings.add("Gato");

            System.out.println(arrayDeStrings.get(3));
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("No anda el programa");
        }


    }
}
