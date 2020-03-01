/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiaJFrame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Abigail
 */
public class Menu 
{
    JTextArea area;
    JScrollPane scrollPane;
    static JFrame frame ;
    
    public JMenuBar createMenuBar() {
     
        JMenuBar menuBar;
        JMenu menu, submenu;
        JMenuItem menuItem;
        JRadioButtonMenuItem rbMenuItem;
        JCheckBoxMenuItem cbMenuItem;

        MenuListener  listener = new MenuListener();

        //Crear la barra del menu.
        menuBar = new JMenuBar();

        //Crear el primer menu.
        menu = new JMenu("Archivo");
        menu.setMnemonic(KeyEvent.VK_A);
        menuBar.add(menu);

        //Un item de menu JMenuItem
        menuItem = new JMenuItem("Nuevo");
        menuItem.addActionListener(listener);
        menu.add(menuItem);

        //Un menu radio boton
        menu.addSeparator();
        ButtonGroup group = new ButtonGroup();
        rbMenuItem = new JRadioButtonMenuItem("Imagenes");
        rbMenuItem.setSelected(true);
        rbMenuItem.addActionListener(listener);
        group.add(rbMenuItem);
        menu.add(rbMenuItem);

        rbMenuItem = new JRadioButtonMenuItem("Textos");
        rbMenuItem.addActionListener(listener);
        group.add(rbMenuItem);
        menu.add(rbMenuItem);

        //Un menu check box.
        menu.addSeparator();
        cbMenuItem = new JCheckBoxMenuItem("Masculino"); 
        cbMenuItem.addActionListener(listener);
        menu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("Femenino"); 
        cbMenuItem.addActionListener(listener);
        menu.add(cbMenuItem);

        //un submenu
        menu.addSeparator();
        submenu = new JMenu("Opciones");
        menuItem = new JMenuItem("Opcion 1");
        menuItem.addActionListener(listener);
        submenu.add(menuItem);

        menuItem = new JMenuItem("Opcion 2");
        menuItem.addActionListener(listener);
        submenu.add(menuItem);
        menu.add(submenu);

        //Segundo menu en la barra.
        menu = new JMenu("Edicion");       
        menuBar.add(menu);
        return menuBar;
    }

    public Container createContentPane() {
        //Crear el panel contenedor.
        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.setOpaque(true);

        //Crear un area de texto con scroll.
        area = new JTextArea(5, 30);
        area.setEditable(false);
        scrollPane = new JScrollPane(area);

        //Agregar esta area como contenido de la ventana.
        contentPane.add(scrollPane, BorderLayout.CENTER);

        return contentPane;
    }

    private static void crearAplicacion() {
        //Definir decoradores de la ventana.
       //JFrame.setDefaultLookAndFeelDecorated(true);

        //Crear y configurar la ventana
        frame = new JFrame("Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame. setLocationRelativeTo(null); //centrar la ventana

        //Crear y configurar el contenido
        Menu demo = new Menu();
        frame.setJMenuBar(demo.createMenuBar());
        frame.setContentPane(demo.createContentPane());

        //Mostrar la ventana.
        frame.setSize(450, 260);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                  crearAplicacion();
            }
        });
    }
   
    public class MenuListener implements ActionListener {
          public void actionPerformed(ActionEvent e)
          {
            JMenuItem jmenuitem = (JMenuItem)e.getSource();
            String opcion  = jmenuitem.getText();
            String mensaje = "Opcion : "+opcion+"\n";
            area.append(mensaje);
          }
    }   
}
