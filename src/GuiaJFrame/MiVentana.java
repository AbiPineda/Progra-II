/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiaJFrame;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Abigail
 */
public class MiVentana extends JFrame {

    public MiVentana() {
        super("Titulo de ventana"); //Heredar del Padre, y colocar Titulo.
        setSize(400, 100); //Tamaño de la ventana
        setResizable(false); //no se puede maximizar la pantalla
        setLocationRelativeTo(null); //centrar ventana.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar Ventana
        setLayout(new FlowLayout()); //Gestor de Diseño
        Container cp = getContentPane(); //Contenedor
        cp.add(new JLabel("Nombre :")); 
        JTextField texto = new JTextField(20);
        cp.add(texto);
        JButton botonSaludo = new JButton("Saludar");
        cp.add(botonSaludo);
        botonSaludo.addActionListener((ActionListener) new EventoSaludo(texto));
    }

    public class EventoSaludo implements ActionListener {

        private JTextField cuadroTexto;

        public EventoSaludo(JTextField cuadroTexto) {
            this.cuadroTexto = cuadroTexto;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "¡Hola, "
                    + cuadroTexto.getText() + "!");
            cuadroTexto.setText("");
            cuadroTexto.requestFocus();
        }
    }

    public static void main(String[] ARGS) {
        MiVentana ventanita = new MiVentana();
        ventanita.setVisible(true);
    }
}
