package despachogarnicagaribay;

import java.awt.MouseInfo;
import java.awt.Point;


public class LogIn extends javax.swing.JFrame {
    
    int x,y;
    public LogIn() {
        initComponents();
        this.setLocationRelativeTo(null);
       
    }
    
    
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFondoLogIn = new javax.swing.JPanel();
        jpBarraEstadoLogIn = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        lblContraseña = new javax.swing.JLabel();
        lblImagenUsuario = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        jtfContraseña = new javax.swing.JPasswordField();
        sepContraseña = new javax.swing.JSeparator();
        jtfUsuario = new javax.swing.JTextField();
        sepUsuario = new javax.swing.JSeparator();
        lblBienvenido = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpFondoLogIn.setBackground(new java.awt.Color(255, 255, 255));
        jpFondoLogIn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpBarraEstadoLogIn.setBackground(new java.awt.Color(0, 109, 240));
        jpBarraEstadoLogIn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jpBarraEstadoLogInMouseDragged(evt);
            }
        });
        jpBarraEstadoLogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpBarraEstadoLogInMousePressed(evt);
            }
        });

        btnCerrar.setBackground(new java.awt.Color(51, 153, 255));
        btnCerrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setText("X");
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnMinimizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnMinimizar.setForeground(new java.awt.Color(255, 255, 255));
        btnMinimizar.setText("-");
        btnMinimizar.setContentAreaFilled(false);
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMinimizar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpBarraEstadoLogInLayout = new javax.swing.GroupLayout(jpBarraEstadoLogIn);
        jpBarraEstadoLogIn.setLayout(jpBarraEstadoLogInLayout);
        jpBarraEstadoLogInLayout.setHorizontalGroup(
            jpBarraEstadoLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBarraEstadoLogInLayout.createSequentialGroup()
                .addGap(0, 496, Short.MAX_VALUE)
                .addComponent(btnMinimizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrar)
                .addContainerGap())
        );
        jpBarraEstadoLogInLayout.setVerticalGroup(
            jpBarraEstadoLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBarraEstadoLogInLayout.createSequentialGroup()
                .addGroup(jpBarraEstadoLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrar)
                    .addComponent(btnMinimizar))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jpFondoLogIn.add(jpBarraEstadoLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, -1));

        lblContraseña.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(51, 51, 51));
        lblContraseña.setText("CONTRASEÑA");
        jpFondoLogIn.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 90, -1));

        lblImagenUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user-silhouette.png"))); // NOI18N
        lblImagenUsuario.setContentAreaFilled(false);
        lblImagenUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblImagenUsuario.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jpFondoLogIn.add(lblImagenUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 100, 150, 160));

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(51, 51, 51));
        lblUsuario.setText("USUARIO");
        jpFondoLogIn.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 260, -1, -1));

        jtfContraseña.setForeground(new java.awt.Color(51, 51, 51));
        jtfContraseña.setBorder(null);
        jtfContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfContraseñaActionPerformed(evt);
            }
        });
        jpFondoLogIn.add(jtfContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 110, 16));
        jpFondoLogIn.add(sepContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 356, 110, 20));

        jtfUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jtfUsuario.setForeground(new java.awt.Color(51, 51, 51));
        jtfUsuario.setBorder(null);
        jtfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUsuarioActionPerformed(evt);
            }
        });
        jpFondoLogIn.add(jtfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 110, 16));
        jpFondoLogIn.add(sepUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 296, 110, 20));

        lblBienvenido.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblBienvenido.setForeground(new java.awt.Color(51, 102, 255));
        lblBienvenido.setText("Bienvenido");
        jpFondoLogIn.add(lblBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 140, -1));

        getContentPane().add(jpFondoLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void jtfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfUsuarioActionPerformed

    private void jtfContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfContraseñaActionPerformed

    private void jpBarraEstadoLogInMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBarraEstadoLogInMousePressed
        x = evt.getX(); 
        y = evt.getY();
    }//GEN-LAST:event_jpBarraEstadoLogInMousePressed

    private void jpBarraEstadoLogInMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBarraEstadoLogInMouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation(); 
        setLocation(point.x - x, point.y - y); 
    }//GEN-LAST:event_jpBarraEstadoLogInMouseDragged

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        setExtendedState(javax.swing.JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
       
    }//GEN-LAST:event_btnMinimizarMouseClicked
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JPanel jpBarraEstadoLogIn;
    private javax.swing.JPanel jpFondoLogIn;
    private javax.swing.JPasswordField jtfContraseña;
    private javax.swing.JTextField jtfUsuario;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JButton lblImagenUsuario;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JSeparator sepContraseña;
    private javax.swing.JSeparator sepUsuario;
    // End of variables declaration//GEN-END:variables

   
}
