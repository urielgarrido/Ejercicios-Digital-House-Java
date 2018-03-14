package Ejercicio2;

public class Vendedor {
    private String nombre;
    private Integer carisma;
    private Integer experiencia;
    private Integer matricula;
    private Producto producto;
    private Integer plata;

    public Vendedor(String nombre, Integer carisma, Integer experiencia, Integer matricula, Integer plata) {
        this.nombre = nombre;
        this.carisma = carisma;
        this.experiencia = experiencia;
        this.matricula = matricula;
        this.plata = plata;
    }

    public Integer getPlata() {
        return plata;
    }

    public void setPlata(Integer plata) {
        this.plata = plata;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCarisma() {
        return carisma;
    }

    public Integer getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Integer experiencia) {
        this.experiencia = experiencia;
    }

    public Integer getMatricula() {
        return matricula;
    }
}
