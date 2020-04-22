/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agregación;

/**
 *
 * @author Abigail
 */
public class main {
    public static void main(String[] args) {

 producto pro1 = new producto(1, "Cafe", (float) 8.5);
 cliente cliente = new cliente(1, "Juana");
 factura f1 = new factura(pro1, (float) 8.5, cliente);

 f1.mostrar();
 }

}
