package com.company.TomYJerry;

import java.util.List;

public class Gato {
    private String nombre;
    private Double energia;
    private Double velocidad;

    public Gato(String nombre) {
        this.nombre = nombre;
        energia=0.0;
        velocidad=5.0;
    }

    public Double getEnergia() {
        return energia;
    }

    public void setEnergia(Double energia) {
        this.energia = energia;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    public void comerRaton(Raton unRaton){
        setEnergia(getEnergia()+ unRaton.getPeso());
    }

    public void  comerRaton(List<Raton> ratones){
        for (Raton unRaton:ratones) {
            comerRaton(unRaton);
        }
    }
    public Double correr(Integer cantidadMetros){
        setEnergia(getEnergia()-enerigiaPorCorrer(cantidadMetros));
        return getVelocidad()/cantidadMetros;
    }
    public Boolean meConvieneComerA(Raton unRaton, Integer unaDistancia){
        if (unRaton.getPeso()>enerigiaPorCorrer(unaDistancia)){
            return true;
        }
        return false;
    }

    private Double enerigiaPorCorrer(Integer cantidadDeMetros){
        return cantidadDeMetros/2.0;
    }
}
