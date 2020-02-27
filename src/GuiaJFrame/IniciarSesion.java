package GuiaJFrame;

import javax.swing.*;

/**
 *
 * @author Abigail
 */
public class IniciarSesion extends JFrame
{
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel1; // X para cerrar ventana
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JPasswordField jPasswordField1;
    private JTextField jTextField2;
    private JButton jButton1;



    public IniciarSesion()
    {
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Iniciar Sesión");
        setUndecorated(true);

        JPanel jPanel1 = new JPanel();
        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);
        JPanel jPanel2 = new JPanel();
        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        JLabel  jLabel2 = new JLabel();
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abigail\\Desktop\\user.png")); 

        JLabel  jLabel3 = new JLabel();
        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); 
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("¡Bienvenidos!");

         javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(58, 58, 58))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 339, 439);

        JPanel jPanel3 = new JPanel();
        jPanel3.setBackground(new java.awt.Color(0, 153, 255));

        JLabel  jLabel1 = new JLabel();
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        //////// EVENTO PARA CERRAR VENTANA ///////
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        /////// EVENTO PARA CERRAR VENTANA ///////
       javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(619, 0, 32, 25);

        JLabel  jLabel4 = new JLabel();
        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); 
        jLabel4.setForeground(new java.awt.Color(0, 153, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Iniciar Sesión");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(430, 70, 130, 20);

        JLabel  jLabel5 = new JLabel();
        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14));
        jLabel5.setForeground(new java.awt.Color(0, 153, 255));
        jLabel5.setText("Contraseña:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(390, 190, 90, 16);

        JLabel  jLabel6 = new JLabel();
        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); 
        jLabel6.setForeground(new java.awt.Color(0, 153, 255));
        jLabel6.setText("Usuario:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(390, 140, 90, 16);

        JTextField jTextField2 = new JTextField();
        jTextField2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jTextField2);
        jTextField2.setBounds(390, 160, 220, 18);

        JPasswordField jPasswordField1 = new JPasswordField();
        jPasswordField1.setText("jPasswordField1");
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(390, 210, 220, 20);

        JButton jButton1 = new JButton();
        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); 
        jButton1.setForeground(new java.awt.Color(0, 102, 255));
        jButton1.setText("Iniciar Sesión");
        jPanel1.add(jButton1);
        jButton1.setBounds(450, 270, 110, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        setSize(new java.awt.Dimension(651, 439));
        setLocationRelativeTo(null);
        
          

      
    }
    //CERRAR VENTANA
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {
        dispose();
    }
    public static void main(String[] args) {
        IniciarSesion is = new IniciarSesion();
        is.setVisible(true);
        
    }
    
}
