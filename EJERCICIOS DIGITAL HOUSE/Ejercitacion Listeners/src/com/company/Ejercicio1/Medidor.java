package com.company.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public abstract class Medidor {
    protected List<Notificable>listaDeMedicos;

    public Medidor(){
        listaDeMedicos=new ArrayList<>();
    }

    public void agregarNotificable(Notificable unNotificable){
        listaDeMedicos.add(unNotificable);
    }

    public void removerNotificable(Notificable unNotificable){
        listaDeMedicos.remove(unNotificable);
    }

    public abstract void notificar();
}
