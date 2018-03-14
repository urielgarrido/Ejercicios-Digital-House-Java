package com.company.Ejercicio1;

import java.util.*;

public class Main {

    public static void main(String[] args) {

      /*  Map<Integer,String> primerDiccionario = new HashMap<>();

        primerDiccionario.put(4,"Uriel");
        primerDiccionario.put(10,"Garrido");
        primerDiccionario.put(10,"garr");

        primerDiccionario.remove(10);

        Set<Integer> conjuntoDeClaves = primerDiccionario.keySet();

        System.out.println(conjuntoDeClaves);

        primerDiccionario.get(4);

        System.out.println(primerDiccionario);
        */

        Map<Integer,String > quiniela = new HashMap<>();

        quiniela.put(0,"Huevos");
        quiniela.put(1,"Agua");
        quiniela.put(2,"Escopeta");
        quiniela.put(3,"Caballo");
        quiniela.put(4,"Dentista");
        quiniela.put(5,"Llamas");

        for (Integer unaClave: quiniela.keySet()) {
            System.out.println(quiniela.get(unaClave));
        }

        System.out.println("--------------------");

        Map<String,List<String>> alias = new HashMap<>();
        List<String> aliasDeJuan = new ArrayList<>();
        aliasDeJuan.add("Juancho");
        aliasDeJuan.add("Fisura");
        aliasDeJuan.add("Ricardo Ford");

        alias.put("Juan",aliasDeJuan);

        List<String> aliasDeMiguel = new ArrayList<>();

        aliasDeMiguel.add("Night Watch");
        aliasDeMiguel.add("Bruce Wayne");
        aliasDeMiguel.add("Pati Corti");

        alias.put("Miguel",aliasDeMiguel);

        List<String> aliasDeMaria = new ArrayList<>();

        aliasDeMaria.add("Wonder Woman");
        aliasDeMaria.add("Mary");
        aliasDeMaria.add("Roberto");

        alias.put("Maria",aliasDeMaria);

        List<String> aliasDeLucas = new ArrayList<>();

        aliasDeLucas.add("Luks");
        aliasDeLucas.add("Jorgue");
        aliasDeLucas.add("Chorch");

        alias.put("Lucas",aliasDeLucas);

        for (String unAmigo:alias.keySet()) {
            System.out.println(alias.get(unAmigo));
        }
    }
}
