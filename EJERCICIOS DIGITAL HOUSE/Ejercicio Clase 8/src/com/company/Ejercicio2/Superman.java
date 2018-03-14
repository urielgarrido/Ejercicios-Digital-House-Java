package com.company.Ejercicio2;

public class Superman implements Volable {
    private Integer experiencia;

    public Superman(Integer experiencia) {
        this.experiencia = experiencia;
    }

    public Integer getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Integer experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public void volar() {
        setExperiencia(getExperiencia()+3);
        System.out.println("Estoy volando como campeon");
    }
}
