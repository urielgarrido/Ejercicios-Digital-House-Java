package com.company.BlowBaster;

public class Vhs extends Ejemplares {
    private Integer fechaDeFabricacion;

    public Vhs(Integer numeroIdentificatorio, String peliculaALaQuePertenecen, Boolean prestadoONo, Integer fechaDeFabricacion) {
        super(numeroIdentificatorio, peliculaALaQuePertenecen, prestadoONo);
        this.fechaDeFabricacion=fechaDeFabricacion;
    }
}
