package com.company;

import java.util.ArrayList;
import java.util.List;

public abstract class Notificador {
    protected List<Notificable> listaDeNotificables;

    public Notificador(){
        listaDeNotificables=new ArrayList<>();
    }

    public void agregarNotificable(Notificable unNotificable){
        listaDeNotificables.add(unNotificable);
    }

    public void removerNotificable(Notificable unNotificable){
        listaDeNotificables.remove(unNotificable);
    }

    public abstract void notificar();
}
