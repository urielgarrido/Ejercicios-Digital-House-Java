package com.company.GranjaNonSanto;

public class Oveja implements Pastoreo{
    private Integer kilosDeLanaQuePosee;
    private Integer fechaDeNacimiento;
    private Integer patente;

    @Override
    public void pastar() {
        System.out.println("Pasteo como oveja");
    }
}
