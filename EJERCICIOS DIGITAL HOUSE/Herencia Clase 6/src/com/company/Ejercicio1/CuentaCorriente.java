package com.company.Ejercicio1;

public class CuentaCorriente extends Cuenta {

    private Integer montoAutorizado;

    public CuentaCorriente (Integer ElMontoAutorizado){
        montoAutorizado=ElMontoAutorizado;
    }

    public Integer getMontoAutorizado() {
        return montoAutorizado;
    }

    public void depositarCheque(Cheque unCheque){
        super.setSaldo(getSaldo()+ unCheque.getMonto());
    }

    @Override
    public void extraerEfectivo(Integer unMonto) {
       if (unMonto<getSaldo()+montoAutorizado){
           super.setSaldo(getSaldo()+ unMonto);
       }
    }
}
