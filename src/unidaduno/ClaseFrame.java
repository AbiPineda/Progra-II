/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidaduno;

import java.awt.Container;
import javax.swing.JFrame;

/**
 *
 * @author Abigail
 */
public class ClaseFrame extends JFrame{

    private Container contenedor;
    public ClaseFrame()  //constructor vacio
    {
        contenedor= getContentPane();
        contenedor.setLayout(null);
        
        setTitle("Programacion II");
        setSize(400,200);
        setLocationRelativeTo(null);
    }

     public static void main(String[] ARGS){
        //-- HACEMOS QUE SE INICIALIZE NUESTRA VENTANA JFRAME

        ClaseFrame MI_INTERFAZ = new ClaseFrame();

        //-- HACEMOS QUE NUESTRA VENTANA SE VISIBLE

        MI_INTERFAZ.setVisible(true);
    }
    
}
