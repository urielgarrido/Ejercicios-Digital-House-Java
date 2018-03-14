package com.company.Ejercicio1;

public class ClienteEmpresarial extends Cliente {

    private String nombreDeFantasia;
    private Integer cuit;

    public void setNombreDeFantasia(String nombreDeFantasia) {
        this.nombreDeFantasia = nombreDeFantasia;
    }

    public String getNombreDeFantasia() {
        return nombreDeFantasia;
    }

    public void setCuit(Integer cuit) {
        this.cuit = cuit;
    }

    public Integer getCuit() {
        return cuit;
    }



}
