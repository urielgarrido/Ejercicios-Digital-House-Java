package com.company.Ejercicio1;

public class Main {

    public static void main(String[] args) {
        try {
            Integer unNumero = null;
            Integer numero = unNumero+5;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("No anduvo");
        }
    }
}
