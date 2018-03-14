package com.company.BlowBaster;

import java.util.List;

public class Pelicula {
    private Integer IMDB;
    private String título;
    private Integer añoDePublicación;
    private String idiomasDeLosSubtítulos;
    private List<Ejemplares>listaDeEjemplares;

    public Integer getIMDB() {
        return IMDB;
    }

    public void setIMDB(Integer IMDB) {
        this.IMDB = IMDB;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public Integer getAñoDePublicación() {
        return añoDePublicación;
    }

    public void setAñoDePublicación(Integer añoDePublicación) {
        this.añoDePublicación = añoDePublicación;
    }

    public String getIdiomasDeLosSubtítulos() {
        return idiomasDeLosSubtítulos;
    }

    public void setIdiomasDeLosSubtítulos(String idiomasDeLosSubtítulos) {
        this.idiomasDeLosSubtítulos = idiomasDeLosSubtítulos;
    }
}
