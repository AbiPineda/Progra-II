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
public class vehiculoAlquiler 
{
    private cliente cliente;
    private vehiculo vehiculo;
    private int diaAlquiler;
    private int mesAlquiler;
    private int anoAlquiler;
    private int totalDiasAlquiler;

    public vehiculoAlquiler(cliente cliente, vehiculo vehiculo, int diaAlquiler, int mesAlquiler, int anoAlquiler, int totalDiasAlquiler) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.diaAlquiler = diaAlquiler;
        this.mesAlquiler = mesAlquiler;
        this.anoAlquiler = anoAlquiler;
        this.totalDiasAlquiler = totalDiasAlquiler;
    }

    
    public cliente getCliente() {
        return cliente;
    }

    public void setCliente(cliente cliente) {
        this.cliente = cliente;
    }

    public vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getDiaAlquiler() {
        return diaAlquiler;
    }

    public void setDiaAlquiler(int diaAlquiler) {
        this.diaAlquiler = diaAlquiler;
    }

    public int getMesAlquiler() {
        return mesAlquiler;
    }

    public void setMesAlquiler(int mesAlquiler) {
        this.mesAlquiler = mesAlquiler;
    }

    public int getAnoAlquiler() {
        return anoAlquiler;
    }

    public void setAnoAlquiler(int anoAlquiler) {
        this.anoAlquiler = anoAlquiler;
    }

    public int getTotalDiasAlquiler() {
        return totalDiasAlquiler;
    }

    public void setTotalDiasAlquiler(int totalDiasAlquiler) {
        this.totalDiasAlquiler = totalDiasAlquiler;
    }
    
    
    
}
