package com.company.ejercicio1;

public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Jose","Perez");

        Cliente cliente2=new Cliente("Uriel", "Garrido");

        Cuenta cuenta1 = new Cuenta(200.0);
        cuenta1.setTitular(cliente1);

        Cuenta cuenta2 = new Cuenta(300.0);
        cuenta2.setTitular(cliente2);

        cuenta1.extraccion( 40.0);
        cuenta1.depositar(100.0);
        System.out.println("-------------------");
        cuenta2.extraccion(10.0);
        cuenta2.depositar(100.0);
    }
}
