/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulario;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author Abigail
 */
public class Formulario extends JFrame {

    DefaultListModel modelo;
    
    public Formulario() {
        this.setTitle("Formulario de Ingreso");
        this.setSize(500,230);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        //iniciar modelo
        modelo = new DefaultListModel();
        
        Container cp = getContentPane();
        cp.setLayout(null);
        
        JPanel jptitulo = new JPanel();
        jptitulo.setLayout(null);
        jptitulo.setBackground(Color.BLACK);
        jptitulo.setBounds(0, 0, 500, 50);
        
        JLabel titulo = new JLabel("Información de Usuario");
        titulo.setBounds(150, 1,200, 50);
        titulo.setFont(new Font("Arial", Font.BOLD,15));
        titulo.setBackground(Color.WHITE);
        jptitulo.add(titulo);
        cp.add(jptitulo);
        
        JPanel campos = new JPanel();
        campos.setLayout(null);
        campos.setBackground(Color.cyan);
        campos.setBounds(0, 50, 320, 150);

        JLabel etnombre = new JLabel("Nombre");
        etnombre.setBounds(5, 2, 50, 25);
       campos.add(etnombre);

        JTextField tnombre = new JTextField();
        tnombre.setBounds(60, 2, 200, 25);
        campos.add(tnombre);
        
        JLabel etapellido = new JLabel("Apellido");
        etapellido.setBounds(5, 30, 50, 25);
       campos.add(etapellido);
       
        JTextField tapellido = new JTextField();
        tapellido.setBounds(60, 30, 200, 25);
        campos.add(tapellido);
        
        JLabel etgenero = new JLabel("Sexo");
        etgenero.setBounds(5, 60, 50, 25);
        campos.add(etgenero);
        
        ButtonGroup bg = new ButtonGroup();
        
        JRadioButton masculino = new JRadioButton("Masculino");
        masculino.setBounds(60, 60, 100, 25);
        masculino.setBackground(Color.cyan);
        bg.add(masculino);
        campos.add(masculino);
       
        JRadioButton femenino = new JRadioButton("Femenino");
        femenino.setBounds(175, 60, 100, 25);
        femenino.setBackground(Color.cyan);
        campos.add(femenino);
        bg.add(femenino);
        
        JLabel etedad = new JLabel("Edad");
        etedad.setBounds(5, 90, 50, 25);
        campos.add(etedad);
        
        JComboBox jedad = new JComboBox();
        jedad.setBounds(60, 90, 200, 25); 
        campos.add(jedad);
        for (int i = 0; i <= 100; i++) {
        jedad.addItem(""+i);    
        }
        
        JButton boton = new JButton("Agregar");
        boton.setBounds(100, 120, 100, 25);
        campos.add(boton);

         JPanel campolista = new JPanel();
        campolista.setLayout(null);
        campolista.setBackground(Color.red);
        campolista.setBounds(300, 50, 195, 150);
        
        JList lista = new JList();
        lista.setBounds(5, 5, 185, 140);
        campolista.add(lista);
        
       

        cp.add(campolista);

        cp.add(campos);
       
        
        boton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent ae) {
            if(tnombre.getText().toString().isEmpty()){
                JOptionPane.showMessageDialog(null, "Rellene Campos", "", JOptionPane.INFORMATION_MESSAGE);
                tnombre.requestFocus();
            }else if(tapellido.getText().toString().isEmpty()){
                JOptionPane.showMessageDialog(null, "Rellene Campos", "", JOptionPane.INFORMATION_MESSAGE);
                tapellido.requestFocus();
            }else if(!masculino.isSelected() && !femenino.isSelected()){
             JOptionPane.showMessageDialog(null, "Seleccione Sexo", "", JOptionPane.INFORMATION_MESSAGE);
            }
            else{ 
                String cadena = tnombre.getText()+", "+tapellido.getText()+", "+(masculino.isSelected()?" Masculino":" Femenino")+", "+jedad.getSelectedItem();
                //Agregar a Lista
                modelo.addElement(cadena);
                lista.setModel(modelo);
                
                tnombre.setText("");
                tapellido.setText("");
                bg.clearSelection();
                jedad.setSelectedIndex(0);
                tnombre.requestFocus();
                
            }
            }
        });
        
        lista.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent evt)
            {
                JList list = (JList) evt.getSource();
                if(evt.getClickCount()==2)
                {
                    String [] result = String.valueOf(list.getSelectedValue()).split(", ");
                    
                    String cadena = "Nombre: "+result[0] + "\n";
                    cadena += "Apellido: "+result[1] + "\n";
                    cadena += "Sexo: "+result[2] + "\n";
                    cadena += "Edad: "+result[3] + "\n";
                    
                       JOptionPane.showMessageDialog(null, cadena , "Titulo", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

    }

    
    
    
    
    
    
    public static void main(String[] args) {
        Formulario fo = new Formulario();
        fo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fo.setVisible(true);
    }
}
