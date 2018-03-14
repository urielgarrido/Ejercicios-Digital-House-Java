package com.company;

import com.sun.javafx.scene.control.skin.VirtualFlow;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	Documento unDocumento=new Documento();
	Foto unaFoto=new Foto();

	Impresora unaImpresora= new Impresora();

	unaImpresora.agregarACola(unDocumento);
	unaImpresora.agregarACola(unaFoto);

	unaImpresora.imprimir();

		ArrayList<Imprimible> listaDeCosasImprimibles = new ArrayList<>();

		listaDeCosasImprimibles.add(unaFoto);
		listaDeCosasImprimibles.add(unDocumento);


		unaImpresora.imprimirImprimibles(listaDeCosasImprimibles);


    }
}
