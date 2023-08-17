package gestionVehiculos;

public class Vehiculo {
    private int ruedas;
    private String marca;
    private String modelo;

    public Vehiculo(int ruedas, String marca, String modelo){
        this.ruedas = ruedas;
        this.marca = marca;
        this.modelo = modelo;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String obtenerInformacion(){

        return "\nNúmero de ruedas: " + this.ruedas +
                "\nMarca: " + this.marca +
                "\nModelo: " + this.modelo;
    }
}
