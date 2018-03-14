package com.company;

public class Empresa implements Notificable{
    private String nombreFantasia;
    private Integer cuit;
    private Integer cantidadDeEmpleados;
    private Integer telefono;

    public Empresa(String nombreFantasia, Integer cuit, Integer cantidadDeEmpleados, Integer telefono) {
        this.nombreFantasia = nombreFantasia;
        this.cuit = cuit;
        this.cantidadDeEmpleados = cantidadDeEmpleados;
        this.telefono = telefono;
    }

    public String getNombreFantasia() {
        return nombreFantasia;
    }

    public Integer getCuit() {
        return cuit;
    }

    public Integer getCantidadDeEmpleados() {
        return cantidadDeEmpleados;
    }

    public void setCantidadDeEmpleados(Integer cantidadDeEmpleados) {
        this.cantidadDeEmpleados = cantidadDeEmpleados;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    @Override
    public void reaccionarANotificacion(Diario diario) {
        System.out.println("Recibí el diario: "+diario.getNombre());
    }
}
