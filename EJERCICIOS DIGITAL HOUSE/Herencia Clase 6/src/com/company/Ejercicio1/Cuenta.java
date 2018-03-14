package com.company.Ejercicio1;

public class Cuenta {

    private Integer numeroDeCuenta;
    private Cliente cliente;
    private Integer saldo;

    public Integer getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(Integer numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }


    public void depositarEfectivo(Integer unSaldo){
        saldo+=unSaldo;
    }

    public void extraerEfectivo(Integer unSaldo){
        if (getSaldo()>unSaldo){
            setSaldo(getSaldo()+unSaldo);
        }
    }


}
