package com.company.BlowBaster;

public class Main {
    public static void main(String[] args){
        Ejemplares ejemplares=new Ejemplares(122,"El Señor de los Anillos",false){};
        BluRay bluRay = new BluRay(123,"Agente 007",true);
        Pelicula pelicula = new Pelicula();
        ejemplares.alquilar();
        ejemplares.alquilado();
        bluRay.devolver();
        bluRay.alquilado();
    }
}
