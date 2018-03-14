package com.company.Ejecicio3;

public class Cebador {
    private Integer mate;

    public Cebador(){
        mate=0;
    }

    public void setMate(Integer mate) {
        this.mate = mate;
    }

    public Integer getMate() {
        return mate;
    }

    public void cebarMate(){
        if (getMate()==0){
            setMate(1);
        }
    }
}
