package com.company;

public class Main {

    public static void main(String[] args) {
	Diario diario1 = new Diario("La Nacion");
	Diario diario2 = new Diario("Clarin");

	Empresa empresa = new Empresa("Grido",1234567890,5,45326754);
	Individuo individuo1 = new Individuo("Uriel",40675474,"Serrano 3719",47348938);

	empresa.reaccionarANotificacion(diario1);
	individuo1.reaccionarANotificacion(diario2);
    }
}
