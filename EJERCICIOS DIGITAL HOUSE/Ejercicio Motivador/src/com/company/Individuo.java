package com.company;

public class Individuo implements Notificable {
    private String nombre;
    private Integer dni;
    private String direccion;
    private Integer telefono;

    public Individuo(String nombre, Integer dni, String direccion, Integer telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
