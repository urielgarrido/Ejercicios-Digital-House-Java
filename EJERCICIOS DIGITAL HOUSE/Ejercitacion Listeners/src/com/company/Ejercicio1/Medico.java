package com.company.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Medico implements Notificable {

    private String nombre;
    private List<Medidor> listaDeMedidores;

    public Medico(String nombre) {
        this.nombre = nombre;
        listaDeMedidores = new ArrayList<>();
    }

    public void agregarMedidor(Medidor unMedidor){
        listaDeMedidores.add(unMedidor);
    }

    public void removerMedidor(Medidor unMedidor){
        listaDeMedidores.remove(unMedidor);
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void recibirNotificacion(Medidor unMedidor) {
        unMedidor.notificar();
    }
}
