/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion;

/**
 *
 * @author Abigail
 */
public class Main {

    public static void main(String[] args) {
//        vehiculo vehiculo1 = new vehiculo("4050 ABJ",
//                "VW",
//                "GTI",
//                "Blanco",
//                100.0);
//        vehiculo vehiculo2 = new vehiculo("2345 JVM",
//                "SEAT",
//                "León",
//                "Negro",
//                80.0);

        

        vehiculoAlquilado alquiler1 = new vehiculoAlquilado(
                "12345678-9" ,"Juan",  "Pérez",
                "2345 JVM","SEAT", "León", "Negro", 8.0,
                11, 11, 2011, 2);

        System.out.println("Vehículo alquilado");
 
        System.out.println("Cliente : "
                + alquiler1.getCliente().getDui() + " "
                + alquiler1.getCliente().getNombre() + " "
                + alquiler1.getCliente().getApellidos());
        System.out.println("Vehículo: "
                + alquiler1.getVehiculo().getMatricula());
    }
}
