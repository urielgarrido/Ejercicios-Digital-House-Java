package Ejercicio2;

public class Coca {
    private Integer tamaño;
    private Double precio;

    public Coca(Integer tamaño, Double precio) {
        this.tamaño = tamaño;
        this.precio = precio;
    }

    public Integer getTamaño() {
        return tamaño;
    }

    public Double getPrecio() {
        return precio;
    }

    @Override
    public boolean equals(Object obj) {
        Coca unaCoca = (Coca)obj;
        if (tamaño.equals(unaCoca.getTamaño())){
            return true;
        }else {
            return false;
        }
    }
}
