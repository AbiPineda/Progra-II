/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidaduno;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Abigail
 */
public class GestoresDiseño extends JFrame{

    public GestoresDiseño() 
    {
        setLayout(new BorderLayout());
        setTitle("Ejemplo");
        setSize(400,200);
        setLocationRelativeTo(null);
        JPanel jp1 = new JPanel();
        jp1.setLayout(new GridLayout(2,2));
        jp1.add(new JLabel("Hola"));
        jp1.setBackground(Color.green);
        add(jp1,BorderLayout.NORTH);
    }
    
    
    public static void main(String[] args) {
        GestoresDiseño g = new GestoresDiseño();
        g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        g.setVisible(true);
    }
    
}
