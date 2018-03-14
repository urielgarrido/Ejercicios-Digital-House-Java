package com.company.Ejercicio3;

public class Main {
    public static void main(String[] args){

        InvitadosComunes invitadosComunes=new InvitadosComunes();
        InvitadosDH invitadosDH = new InvitadosDH();
        FuegosArtificialesIndividuales fuegosArtificialesIndividuales = new FuegosArtificialesIndividuales();
        PackDeFuegosArtificiales packDeFuegosArtificiales = new PackDeFuegosArtificiales();

        fuegosArtificialesIndividuales.explotar();
        fuegosArtificialesIndividuales.explotar();
        packDeFuegosArtificiales.agregarFuegoALaLista(fuegosArtificialesIndividuales);
        packDeFuegosArtificiales.agregarFuegoALaLista(fuegosArtificialesIndividuales);
        packDeFuegosArtificiales.agregarFuegoALaLista(fuegosArtificialesIndividuales);
        packDeFuegosArtificiales.agregarFuegoALaLista(fuegosArtificialesIndividuales);
        packDeFuegosArtificiales.explotar();
        invitadosComunes.comer();
        invitadosDH.comer();

    }
}
