/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploAgregacion;

/**
 *
 * @author Abigail
 */
public class main 
{
    public static void main(String[] args) {
        cliente cliente = new cliente (1, "Jose");
        producto prod = new producto(0001,"Cafe", (float) 4.50);
        factura f1 = new factura(cliente,prod, (float)4.50);
        
        f1.mostrar();
    }
    
}
