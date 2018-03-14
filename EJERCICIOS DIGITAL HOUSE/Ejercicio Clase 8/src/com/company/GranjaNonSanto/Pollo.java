package com.company.GranjaNonSanto;

public class Pollo implements Pastoreo {
    private Integer huevosPorSemana;
    private Integer fechaDeNacimiento;
    private Integer patente;

    @Override
    public void pastar() {
        System.out.println("Pasteo como pollo");
    }
}
