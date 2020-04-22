/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asociacion;

/**
 *
 * @author Abigail
 */
public class perro 
{
    private String nombre;
    private persona propietario;

    public perro(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public persona getPropietario() {
        return propietario;
    }

    public void setPropietario(persona propietario) {
        this.propietario = propietario;
    }
    
    public void asignarPropietario(persona p)
    {
        propietario = p;
        System.out.println("El propietario del perrito es: "+p.getNombre());
    }
    
    
    
}
