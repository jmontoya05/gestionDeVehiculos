package gestionVehiculos;

public class Main {
    public static void main(String[] args) {
        Motocicleta motoDeportiva = new Motocicleta(2,"Yamaha","R1",1200,"Mecánica");
        Motocicleta motoScooter = new Motocicleta(2,"Auteco","Kymko",125,"Automática");
        Motocicleta motoCarguera = new Motocicleta(3,"AKT", "Ceronte", 200, "Semiautomática");
        Motocicleta motoUrbana = new Motocicleta(2, "Suzuki", "DR", 650, "Mecánica");

        Automovil sedan = new Automovil(4,"KIA","Picanto",4,"Corriente");
        Automovil volqueta = new Automovil(6,"International", "Kodiak", 2, "ACPM");
        Automovil camioneta = new Automovil(4,"Toyota", "TXL", 5,"ACPM");
        Automovil tractomula = new Automovil(22,"Kenworth", "Random",2,"Extra");

        Propietario carlos = new Propietario("Carlos","Castro", motoDeportiva);
        carlos.setVehiculo(motoScooter);
        System.out.println(carlos.mostrarInformacion());


        Propietario maria = new Propietario("María", "Valdéz", sedan);
        System.out.println(maria.mostrarInformacion());

        Propietario alvaro = new Propietario("Alvaro", "García", volqueta);
        alvaro.setVehiculo(tractomula);
        alvaro.setVehiculo(motoCarguera);
        System.out.println(alvaro.mostrarInformacion());

        alvaro.removeVehiculos();

        alvaro.setVehiculo(motoUrbana);
        alvaro.setVehiculo(camioneta);
        System.out.println(alvaro.mostrarInformacion());

        camioneta.conducir();
        motoDeportiva.conducir();
    }
}
