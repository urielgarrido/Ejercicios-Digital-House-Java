package com.company.Ejecicio3;

public class Mamiferos implements TomadoresDeMate{
    private Integer energia;

    public void setEnergia(Integer energia) {
        this.energia = energia;
    }

    public Integer getEnergia() {
        return energia;
    }

    @Override
    public void tomarMate() {
     setEnergia(getEnergia()*5);
    }

    @Override
    public void devolverMate() {

    }
}
