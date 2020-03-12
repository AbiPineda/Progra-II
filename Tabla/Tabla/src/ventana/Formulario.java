
package ventana;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;


public class Formulario extends JFrame{
    private SimpleDateFormat formato;
    DefaultTableModel modelo;
   
    
    public Formulario() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        
        modelo.addColumn("Carnet");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Dui");
        modelo.addColumn("Fecha de Nacimiento");
        modelo.addColumn("Sexo");
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCarnet = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldDui = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldFecha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxSexo = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldDireccion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButtonGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Formulario"));
        jPanel1.setLayout(new java.awt.GridLayout(9, 0));

        jLabel1.setText("Carnet");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel1);
        jPanel1.add(jTextFieldCarnet);

        jLabel2.setText("Nombre");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel2);
        jPanel1.add(jTextFieldNombre);

        jLabel3.setText("Apellido");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel3);
        jPanel1.add(jTextFieldApellido);

        jLabel4.setText("DUI");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel4);
        jPanel1.add(jTextFieldDui);

        jLabel5.setText("Fecha de Nacimiento");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel5);

        jTextFieldFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFechaActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldFecha);

        jLabel6.setText("Sexo");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel6);

        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino" }));
        jPanel1.add(jComboBoxSexo);

        jLabel7.setText("Direccion");
        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel7);
        jPanel1.add(jTextFieldDireccion);

        jLabel8.setText("Telefono");
        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel8);
        jPanel1.add(jTextFieldTelefono);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGuardar);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
   
        Object []object = new Object[8];
        object[0] = jTextFieldCarnet.getText();
        object[1] = jTextFieldNombre.getText(); 
        object[2] = jTextFieldApellido.getText(); 
        object[3] = jTextFieldDui.getText(); 
        object[4] = jTextFieldFecha.getText(); 
        object[5] = jComboBoxSexo.getSelectedItem(); 
        object[6] = jTextFieldDireccion.getText(); 
        object[7] = jTextFieldTelefono.getText(); 
        
        modelo.addRow(object);     
        
        limpiar();
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int fila = tabla.getSelectedRow();
        if(fila != -1){
            modelo.removeRow(fila);
        }else{
            JOptionPane.showMessageDialog(this,"Debe seleccionar una fila");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFechaActionPerformed

    }//GEN-LAST:event_jTextFieldFechaActionPerformed

    private void limpiar(){
        jTextFieldCarnet.setText("");
        jTextFieldNombre.setText(""); 
        jTextFieldApellido.setText(""); 
        jTextFieldDui.setText(""); 
        jTextFieldFecha.setText(""); 
        jComboBoxSexo.setSelectedIndex(0); 
        jTextFieldDireccion.setText(""); 
        jTextFieldTelefono.setText(""); 
    }
    
   
    

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JComboBox jComboBoxSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldCarnet;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldDui;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

}
