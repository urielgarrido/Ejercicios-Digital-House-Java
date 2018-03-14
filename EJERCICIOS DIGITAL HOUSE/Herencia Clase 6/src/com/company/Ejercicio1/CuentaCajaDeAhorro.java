package com.company.Ejercicio1;

public class CuentaCajaDeAhorro extends Cuenta {

    private Integer tasaDeInteres;

    public void setTasaDeInteres(Integer tasaDeInteres) {
        this.tasaDeInteres = tasaDeInteres;
    }

    public Integer getTasaDeInteres() {
        return tasaDeInteres;
    }

    public void cobrarInteres(){
        super.setSaldo(getSaldo()*tasaDeInteres);
    }
}
