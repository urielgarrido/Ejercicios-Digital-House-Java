package com.company.ejercicio1;

public class Cuenta {
    private String numeroDeCuenta;
    private Double saldo;
    private Cliente titular;

    public Cuenta(Double unSaldo){
        saldo=unSaldo;
    }

    public void depositar(Double dinero) {
        saldo += dinero;
        System.out.println("Se hizo un deposito. Tu nuevo saldo es de: "+saldo);
    }

    public void extraccion(Double dinero){
        if (saldo>=dinero){
            saldo -= dinero;
            System.out.println("Se hizo extraccion. Tu nuevo saldo es de: "+saldo);
        }else {
            System.out.println("Fondos insuficientes");
        }

    }

    public void setSaldo(Double saldoInicial){
        saldo=saldoInicial;
    }

    public void setTitular(Cliente unCliente){
        titular=unCliente;
    }
}
