package com.company.GranjaNonSanto;

public class Vaca implements Pastoreo{
    private Integer lecheProducidaPorDia;
    private Double locura;
    private Integer fechaDeNacimiento;
    private Integer patente;

    @Override
    public void pastar() {
        System.out.println("Pasto como vaca");
    }
}
