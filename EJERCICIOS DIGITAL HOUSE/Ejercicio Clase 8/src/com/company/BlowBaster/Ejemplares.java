package com.company.BlowBaster;

public abstract class Ejemplares implements Alquiler {
    private Integer numeroIdentificatorio;
    private String peliculaALaQuePertenecen;
    private Boolean prestadoONo;

    public Ejemplares(Integer numeroIdentificatorio, String peliculaALaQuePertenecen, Boolean prestadoONo) {
        this.numeroIdentificatorio = numeroIdentificatorio;
        this.peliculaALaQuePertenecen = peliculaALaQuePertenecen;
        this.prestadoONo = prestadoONo;
    }

    public Integer getNumeroIdentificatorio() {
        return numeroIdentificatorio;
    }

    public void setNumeroIdentificatorio(Integer numeroIdentificatorio) {
        this.numeroIdentificatorio = numeroIdentificatorio;
    }

    public String getPeliculaALaQuePertenecen() {
        return peliculaALaQuePertenecen;
    }

    public void setPeliculaALaQuePertenecen(String peliculaALaQuePertenecen) {
        this.peliculaALaQuePertenecen = peliculaALaQuePertenecen;
    }

    public Boolean getPrestadoONo() {
        return prestadoONo;
    }

    public void setPrestadoONo(Boolean prestadoONo) {
        this.prestadoONo = prestadoONo;
    }
    @Override
    public void alquilar() {
        System.out.println(getPeliculaALaQuePertenecen());
    }

    @Override
    public void devolver() {
        System.out.println(getPeliculaALaQuePertenecen());
    }

    @Override
    public void alquilado() {
        if (getPrestadoONo()==true){
            System.out.println("Esta pelicula esta alquilada");
        }else System.out.println("Esta pelicula está disponible para alquilar");
    }
}
