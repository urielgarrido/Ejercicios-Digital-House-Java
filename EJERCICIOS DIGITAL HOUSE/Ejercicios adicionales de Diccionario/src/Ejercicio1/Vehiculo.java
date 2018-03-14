package Ejercicio1;

public class Vehiculo {
    private Integer velocidad;
    private Integer aceleracion;
    private Double anguloDeGiro;
    private String patente;
    private Integer peso;
    private Integer ruedas;

    public Vehiculo(Integer velocidad, Integer aceleracion, Double anguloDeGiro, String patente, Integer peso, Integer ruedas) {
        this.velocidad = velocidad;
        this.aceleracion = aceleracion;
        this.anguloDeGiro = anguloDeGiro;
        this.patente = patente;
        this.peso=peso;
        this.ruedas=ruedas;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }

    public Integer getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(Integer aceleracion) {
        this.aceleracion = aceleracion;
    }

    public Double getAnguloDeGiro() {
        return anguloDeGiro;
    }

    public void setAnguloDeGiro(Double anguloDeGiro) {
        this.anguloDeGiro = anguloDeGiro;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getRuedas() {
        return ruedas;
    }

    public void setRuedas(Integer ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public boolean equals(Object obj) {
        Vehiculo unVehiculo = (Vehiculo)obj;
        if (patente.equals(unVehiculo.getPatente())){
            return true;
        }else return false;
    }
    public Double formulaGanador(){
        Double ganador = (velocidad*aceleracion/2)/(anguloDeGiro*(peso-ruedas*100));
        return ganador;
    }

    @Override
    public String toString() {
        return String.format(getPatente());
    }
}
