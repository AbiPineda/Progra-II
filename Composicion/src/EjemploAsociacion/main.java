/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploAsociacion;

/**
 *
 * @author Abigail
 */
public class main
{
    public static void main(String[] args) {
        persona personita = new persona("Anita");
        perro perrito = new perro("Luna");
        
       // personita.agregarMascotas(perrito);
        perrito.asignarPropietario(personita);
    }
    
}
