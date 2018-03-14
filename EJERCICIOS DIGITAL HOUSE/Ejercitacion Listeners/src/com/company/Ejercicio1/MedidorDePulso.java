package com.company.Ejercicio1;

public class MedidorDePulso extends Medidor {
    private Integer pulso;

    public MedidorDePulso(Integer pulso) {
        this.pulso = pulso;
    }

    public Integer getPulso() {
        return pulso;
    }

    public void setPulso(Integer pulso) {
        this.pulso = pulso;
    }

    @Override
    public void notificar() {
        if (pulso<60||pulso>100){
            System.out.println("Su pulso no es el adecuado. hagase revisar");
        }else System.out.println("Su pulso es normal");
    }
}
