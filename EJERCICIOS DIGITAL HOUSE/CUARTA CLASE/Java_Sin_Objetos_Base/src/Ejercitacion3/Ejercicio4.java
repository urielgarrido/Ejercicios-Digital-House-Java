package Ejercitacion3;

import java.util.ArrayList;

/**
 * Created by digitalhouse on 22/08/16.
 */
public class Ejercicio4 {

    ArrayList<Integer> listaDePrimerosCienPositivos() {

        //Retornar un ArrayList con los primeros 100 números positivos.
        ArrayList<Integer> primeros100 = new ArrayList<>();
        for(int i=1;i<=100;i++){
            primeros100.add(i);
        }

        return primeros100;
    }

    //No cambiar nada de aca hacia abajo
    public static void main(String[] args){

        Ejercicio4 ejercicio4 = new Ejercicio4();

        ArrayList<Integer> resultado = ejercicio4.listaDePrimerosCienPositivos();

        for (Integer i = 0; i < resultado.size(); i++) {
            System.out.println(resultado.get(i));
        }
    }
}
