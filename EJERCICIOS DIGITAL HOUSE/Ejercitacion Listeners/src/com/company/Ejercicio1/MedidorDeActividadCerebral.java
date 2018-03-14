package com.company.Ejercicio1;

public class MedidorDeActividadCerebral extends Medidor {
    private Integer actividadCerebral;

    public MedidorDeActividadCerebral(Integer actividadCerebral) {
        this.actividadCerebral = actividadCerebral;
    }

    public Integer getActividadCerebral() {
        return actividadCerebral;
    }

    public void setActividadCerebral(Integer actividadCerebral) {
        this.actividadCerebral = actividadCerebral;
    }

    @Override
    public void notificar() {
        if (actividadCerebral<300){
            System.out.println("Su actividad cerebral está deteriorada");
        }else System.out.println("Su actividad cerebral está en buen estado");
    }
}
