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
public class vehiculoAlquilado {

    private cliente cliente;
    private vehiculo vehiculo;
    private int diaAlquiler;
    private int mesAlquiler;
    private int añoAlquiler;
    private int totalDiasAlquiler;

    public vehiculoAlquilado(cliente cliente, vehiculo vehiculo, int diaAlquiler, int mesAlquiler, int añoAlquiler, int totalDiasAlquiler) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.diaAlquiler = diaAlquiler;
        this.mesAlquiler = mesAlquiler;
        this.añoAlquiler = añoAlquiler;
        this.totalDiasAlquiler = totalDiasAlquiler;
    }

    

    public cliente getCliente() {
        return this.cliente;
    }

    public vehiculo getVehiculo() {
        return this.vehiculo;
    }

}
