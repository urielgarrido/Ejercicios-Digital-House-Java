package com.company.ejercicio2;

public class JugadorDeFutbol {

    private String nombre;
    private Integer energia;
    private Integer felicidad;
    private Integer goles;
    private Integer experiencia;

    public JugadorDeFutbol(String unNombre,Integer unaEnergia, Integer unaFelicidad, Integer unaExperiencia){
    nombre=unNombre;
    energia=unaEnergia;
    felicidad=unaFelicidad;
    goles=0;
    experiencia=unaExperiencia;
    }

    /* Crear un método llamado hacerGol en jugador, el cual le cuesta al Jugador 5 de energía y le da 10 de
         felicidad. Además le aumenta en 1 la cantidad de goles al jugador.. El método debe imprimir por pantalla
         “GOOOOL!”.
 */
    public void hacerGol() {
        energia -= 5;
        felicidad += 10;
        goles += 1;
        System.out.println("GOOOOL!");
    }

    /*
    Crear un método llamado correr en jugador, el cual le cuesta al Jugador 10 de energía. El método debe
imprimir por pantalla “No me dan mas las piernas”.
     */

    public void correr(){
        energia -= 10;
        System.out.println("No me dan mas las piernas");
    }

    /*
    Crear un método llamado entrenarA que tenga como parámetros de entrada un jugador de fútbol. Al ser
un entrenamiento, un jugador tiene que:
- Correr
- Hacer un Gol
- Correr
Y luego de hacer estas tres cosas, se debe incrementar la experiencia del jugador sumandole los puntos
de experiencia que otorga el entrenamiento.
El método debe imprimir la experiencia inicial del jugador y la final.

     */

    public void entrenarA(JugadorDeFutbol unJugador){
        correr();
        hacerGol();
        correr();
        System.out.println("Tu experiencia es de: "+experiencia);
        experiencia+=10;
        System.out.println("Tu experiencia aumento a: "+experiencia);
    }



}