package Ejercicio2;

public class Main {
    public static void main(String[] args){
        Coliseo coliseo = new Coliseo();
        coliseo.agregarVendedor("Carlos",20,50,123,1000);
        coliseo.agregarProducto("Coca",90);
        coliseo.agregarEspectador("Paola",500);
        coliseo.agregarEnfermera("Marta");
        coliseo.agregarPersonalTrainer("Omar",30);
        coliseo.agregarGladiador("Uriel",400,100,150);
        coliseo.agregarGladiador("Maxi",300,200,100);
        coliseo.entrenarGladiador("Uriel","Omar");
        coliseo.pelaDeGladiadores("Uriel","Maxi");
        coliseo.venderProducto("Carlos","Paola","Coca");

    }
}
