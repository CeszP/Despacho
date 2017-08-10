
package despachogarnicagaribay;

import java.awt.Color;



public class FrameInternoAgenda extends javax.swing.JInternalFrame {
   int x,y;
    public FrameInternoAgenda() {
        initComponents();
        jcAgenda.setBackground(Color.white);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jcAgenda = new com.toedter.calendar.JCalendar();
        jpBarraMenuAgenda = new javax.swing.JPanel();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        btnAgregarMarcadorAgenda = new javax.swing.JButton();
        btnIrAlCasoAgenda = new javax.swing.JButton();
        lblAgenda = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcAgenda.setBackground(new java.awt.Color(255, 255, 255));
        jcAgenda.setForeground(new java.awt.Color(51, 51, 51));
        jcAgenda.setDecorationBackgroundColor(new java.awt.Color(204, 204, 255));
        jcAgenda.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jcAgenda.setName("jcAgenda"); // NOI18N
        jPanel1.add(jcAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 800, 440));

        jpBarraMenuAgenda.setBackground(new java.awt.Color(102, 153, 255));

        jCheckBox4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setText("jCheckBox4");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jCheckBox3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setText("jCheckBox3");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("jCheckBox2");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("jCheckBox1");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        btnAgregarMarcadorAgenda.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnAgregarMarcadorAgenda.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarMarcadorAgenda.setText("Agregar Marcador");
        btnAgregarMarcadorAgenda.setContentAreaFilled(false);
        btnAgregarMarcadorAgenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarMarcadorAgenda.setMargin(new java.awt.Insets(0, 0, 0, 0));

        btnIrAlCasoAgenda.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnIrAlCasoAgenda.setForeground(new java.awt.Color(255, 255, 255));
        btnIrAlCasoAgenda.setText("Ir al Caso");
        btnIrAlCasoAgenda.setContentAreaFilled(false);
        btnIrAlCasoAgenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jpBarraMenuAgendaLayout = new javax.swing.GroupLayout(jpBarraMenuAgenda);
        jpBarraMenuAgenda.setLayout(jpBarraMenuAgendaLayout);
        jpBarraMenuAgendaLayout.setHorizontalGroup(
            jpBarraMenuAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBarraMenuAgendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox1)
                .addGap(25, 25, 25)
                .addComponent(jCheckBox2)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox3)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(btnAgregarMarcadorAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIrAlCasoAgenda)
                .addContainerGap())
        );
        jpBarraMenuAgendaLayout.setVerticalGroup(
            jpBarraMenuAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBarraMenuAgendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBarraMenuAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox4)
                    .addComponent(btnAgregarMarcadorAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIrAlCasoAgenda))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jpBarraMenuAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 800, 50));

        lblAgenda.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblAgenda.setForeground(new java.awt.Color(0, 153, 255));
        lblAgenda.setText("Agenda");
        jPanel1.add(lblAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed
    
    /**NOTA: Revisar bien qué opciones de vista se 
     * darán sobre el jCalendar. Y crear marcadores.*/
    
    public void verificaChecks(){
        if(jCheckBox1.isSelected()){
                       
        }
        if(jCheckBox2.isSelected()){
            
        }
        if(jCheckBox3.isSelected()){
            
        }
        if(jCheckBox4.isSelected()){
            
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarMarcadorAgenda;
    private javax.swing.JButton btnIrAlCasoAgenda;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JCalendar jcAgenda;
    private javax.swing.JPanel jpBarraMenuAgenda;
    private javax.swing.JLabel lblAgenda;
    // End of variables declaration//GEN-END:variables

    private void setExtendedState(int ICONIFIED) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
