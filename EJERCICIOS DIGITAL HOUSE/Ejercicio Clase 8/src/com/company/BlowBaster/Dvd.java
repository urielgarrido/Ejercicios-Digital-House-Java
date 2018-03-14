package com.company.BlowBaster;

public class Dvd extends Ejemplares{
    private Integer numeroDeZona;

    public Dvd(Integer numeroIdentificatorio, String peliculaALaQuePertenecen, Boolean prestadoONo, Integer numeroDeZona) {
        super(numeroIdentificatorio, peliculaALaQuePertenecen, prestadoONo);
        this.numeroDeZona=numeroDeZona;
    }
}
