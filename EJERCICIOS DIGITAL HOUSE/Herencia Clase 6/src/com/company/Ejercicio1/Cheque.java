package com.company.Ejercicio1;

public class Cheque {

    private String bancoEmisor;
    private Integer fechaDePago;
    private Integer monto;

    public Cheque(String ElBancoEmisor, Integer LaFechaDePago, Integer ElMonto){
        bancoEmisor=ElBancoEmisor;
        fechaDePago=LaFechaDePago;
        monto=ElMonto;
    }

    public Integer getMonto() {
        return monto;
    }

}
