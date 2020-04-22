/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asociacion;

import java.util.ArrayList;

/**
 *
 * @author Abigail
 */
public class persona {
    private String nombre;
    private ArrayList<perro>mascotas = new ArrayList();

    public persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<perro> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<perro> mascotas) {
        this.mascotas = mascotas;
    }
    
    public void agregarMascota(perro p)
    {
        mascotas.add(p);
        System.out.println("Mi perrito/a se llama: "+p.getNombre());
   
    }    
}
