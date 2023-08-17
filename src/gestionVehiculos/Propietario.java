package gestionVehiculos;

public class Propietario {
    private String nombre;
    private String apellido;
    private Vehiculo[] vehiculo;
    private int cantidadvehiculos = 0;

    public Propietario(String nombre, String apellido, Vehiculo vehiculo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.vehiculo = new Vehiculo[2];
        this.vehiculo[cantidadvehiculos] = vehiculo;
        this.cantidadvehiculos += 1;

    }

    public void setVehiculo(Vehiculo vehiculo) {

        if (cantidadvehiculos < 2) {
            this.vehiculo[cantidadvehiculos] = vehiculo;
            this.cantidadvehiculos += 1;
            System.out.println("Vehiculo agregado con éxito");
        } else {
            System.out.println("El propietario no puede tener más vehiculos");
        }

    }

    public void removeVehiculos() {
        this.vehiculo = new Vehiculo[2];
        System.out.println("Vehiculos retirados con éxito");
        cantidadvehiculos = 0;
    }

    public String mostrarInformacion() {
        String informacion = "\nNombre: " + this.nombre +
                "\nApellido: " + this.apellido +
                "\nInformación de los vehiculos:";
        for (int i = 0; i < this.cantidadvehiculos; i++) {
            informacion += "\nVehiculo # " + (i+1) + this.vehiculo[i].obtenerInformacion();
        }

        return informacion;
    }


}
