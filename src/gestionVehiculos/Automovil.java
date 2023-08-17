package gestionVehiculos;

public class Automovil extends Vehiculo implements Conducible{

    private int numeroDePuertas;
    private String tipoCombustible;

    public Automovil(int ruedas, String marca, String modelo, int numeroDePuertas, String tipoCombustible) {
        super(ruedas, marca, modelo);
        this.numeroDePuertas = numeroDePuertas;
        this.tipoCombustible = tipoCombustible;
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public String obtenerInformacion(){

        return super.obtenerInformacion() +
                "\nNúmero de puertas: " + this.numeroDePuertas +
                "\nTipo de combustible: " + this.tipoCombustible;
    }

    @Override
    public void conducir(){
        System.out.println("El automóvil se encuentra en movimiento...");
    }
}
