/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidaduno;

import java.awt.*;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Abigail
 */
public class ClaseFra extends JFrame{

    public ClaseFra() {
    setLayout(new BorderLayout());
        setTitle("Programacion II");
        setSize(400,200);
        setLocationRelativeTo(null);
        JPanel jp = new JPanel();
        jp.add(new JLabel("Hola"));
        jp.add(new JButton("Boton"));
        add(jp, BorderLayout.EAST);
//       JPanel p = new JPanel();
//       p.setLayout(new BorderLayout());
//       p.add(new JButton("Sur"), BorderLayout.SOUTH);
//       p.add(new JButton("Sur"), BorderLayout.SOUTH);
//       p.add(new JButton("Sur"), BorderLayout.SOUTH);
//       p.add(new JButton("Sur"), BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        ClaseFra cla = new ClaseFra();
        cla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cla.setVisible(true);
    }
 
    
    
}
