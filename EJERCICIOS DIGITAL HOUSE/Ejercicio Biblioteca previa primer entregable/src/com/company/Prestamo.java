package com.company;

import java.util.Date;

public class Prestamo {
    private Socio socio;
    private Ejemplar ejemplar;
    private Date fecha;

    public Prestamo(Socio socio, Ejemplar ejemplar) {
        this.socio = socio;
        this.ejemplar = ejemplar;
        fecha = new Date();
    }

    public Socio getSocio() {
        return socio;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public Date getFecha() {
        return fecha;
    }
}
