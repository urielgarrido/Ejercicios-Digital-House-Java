package com.company.Ejercicio1;

public class EmpleadosLavavajillas extends EmpleadosDeLimpieza implements RompedoresDeVajillas {

    private Integer vajillasRotas;

    public EmpleadosLavavajillas(String unNombre, String unApellido, Integer unDni, Integer unSueldo) {
        super(unNombre, unApellido, unDni, unSueldo);
        vajillasRotas = 0;
    }

    public void setVajillasRotas(Integer vajillasRotas) {
        this.vajillasRotas = vajillasRotas;
    }

    public Integer getVajillasRotas() {
        return vajillasRotas;
    }

    @Override
    public void descontarSueldo() {
        super.setSueldo(super.getSueldo() - getVajillasRotas()*5);
    }

    @Override
    public void romperVajillas() {
        setVajillasRotas(getVajillasRotas()+1);
    }

    @Override
    public void limpiar() {
        romperVajillas();
        descontarSueldo();
        System.out.println(super.getSueldo());

    }

}
