package com.company.GranjaNonSanto;

public class Cocodrilo {
    private Integer kilosQueSePuedenExtraer;
    private Integer fechaDeNacimiento;
    private Integer patente;

    public Cocodrilo(Integer kilosQueSePuedenExtraer, Integer fechaDeNacimiento, Integer patente) {
        this.kilosQueSePuedenExtraer = kilosQueSePuedenExtraer;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.patente = patente;
    }

    public Integer getKilosQueSePuedenExtraer() {
        return kilosQueSePuedenExtraer;
    }

    public Integer getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public Integer getPatente() {
        return patente;
    }
}
