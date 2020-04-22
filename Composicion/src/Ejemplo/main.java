/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo;

/**
 *
 * @author Abigail
 */
public class main 
{
    public static void main(String[] args) {
        
        cliente cliente1 = new cliente("12345678-9","Juan","Perez");
        vehiculo vehiculo1 = new vehiculo("AA12345","Nissan","Sentra","Rojo",35.50,false);
        vehiculoAlquiler alquiler1 = new vehiculoAlquiler(cliente1, vehiculo1, 20,4,2020,2);
        
        System.out.println("Alquiler: ");
        
        System.out.println("Cliente : "
                + alquiler1.getCliente().getDui() + " "
                + alquiler1.getCliente().getNombre() + " "
                + alquiler1.getCliente().getApellido());
        System.out.println("Vehículo: "
                + alquiler1.getVehiculo().getPlaca() + " "
                + alquiler1.getVehiculo().getMarca());
    }
    
}
