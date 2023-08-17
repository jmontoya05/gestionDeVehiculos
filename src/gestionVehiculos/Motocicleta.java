package gestionVehiculos;

public class Motocicleta extends Vehiculo implements Conducible{
    private int cilindrada;
    private String tipoDeManejo;

    public Motocicleta(int ruedas, String marca, String modelo, int cilindrada, String tipoDeManejo) {
        super(ruedas, marca, modelo);
        this.cilindrada = cilindrada;
        this.tipoDeManejo = tipoDeManejo;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoDeManejo() {
        return tipoDeManejo;
    }

    public void setTipoDeManejo(String tipoDeManejo) {
        this.tipoDeManejo = tipoDeManejo;
    }

    @Override
    public String obtenerInformacion(){

        return super.obtenerInformacion() +
                "\nCilindrada: " + this.cilindrada +
                "\nTipo de manejo: " + this.tipoDeManejo;
    }

    @Override
    public void conducir(){
        System.out.println("La motocicleta se encuentra en movimiento...");
    }
}
