package com.company.Ejercicio1;

public class MedidorDeOxigeno extends  Medidor {
    private Integer oxigeno;

    public MedidorDeOxigeno(Integer oxigeno) {
        this.oxigeno = oxigeno;
    }

    public Integer getOxigeno() {
        return oxigeno;
    }

    public void setOxigeno(Integer oxigeno) {
        this.oxigeno = oxigeno;
    }

    @Override
    public void notificar() {
        if (oxigeno<100){
            System.out.println("Su oxigeno está bajo");
        }else System.out.println("Su oxigeno está bien");
    }
}
