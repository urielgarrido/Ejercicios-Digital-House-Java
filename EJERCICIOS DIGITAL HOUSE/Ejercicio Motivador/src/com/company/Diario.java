package com.company;

public class Diario extends Notificador {
    private String nombre;
    public Diario(String nombre){
        this.nombre=nombre;
    }
    @Override
    public void notificar() {
        for (Notificable unNotificable:listaDeNotificables) {
            unNotificable.reaccionarANotificacion(this);
        }
    }

    public String getNombre() {
        return nombre;
    }
}
