/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package despachogarnicagaribay;

import java.awt.Dimension;
import javax.swing.JDesktopPane;

/**
 *
 * @author Cesz
 */
public class FrameInternoClientes extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrameInternoClientes
     */
    public FrameInternoClientes() {
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackInfoGral = new javax.swing.JPanel();
        panelCliente = new javax.swing.JPanel();
        btnBuscarCliente = new javax.swing.JButton();
        tfBuscarCliente = new javax.swing.JTextField();
        btnNuevoCliente = new javax.swing.JButton();
        btnActualizarInfoCliente = new javax.swing.JButton();
        btnVerServiciosPrestados = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblCliente = new javax.swing.JLabel();
        panelInfoGral = new javax.swing.JPanel();
        lblNombreInfoGral = new javax.swing.JLabel();
        lblDomicilioInfoGral = new javax.swing.JLabel();
        lblDomicilioAuxInfoGral = new javax.swing.JLabel();
        lblTelefonoInfoGral = new javax.swing.JLabel();
        lblTelefonoAuxInfoGral = new javax.swing.JLabel();
        lblCelularInfoGral = new javax.swing.JLabel();
        lblCiudadInfoGral = new javax.swing.JLabel();
        lblPoblacionInfoGral = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tfNombreInfoGral = new javax.swing.JTextField();
        tfDomicilioInfoGral = new javax.swing.JTextField();
        tfDomicilioAuxInfoGral = new javax.swing.JTextField();
        tfTelefonoInfoGral = new javax.swing.JTextField();
        tfTelefonoAuxInfoGral = new javax.swing.JTextField();
        tfCelularInfoGral = new javax.swing.JTextField();
        tfCiudadInfoGral = new javax.swing.JTextField();
        tfEstadoInfoGral = new javax.swing.JTextField();
        tfPoblacionInfoGral = new javax.swing.JTextField();
        btnAgregarNuevoCliente = new javax.swing.JButton();
        lblInfoGral = new javax.swing.JLabel();
        panelPrestarServicios = new javax.swing.JPanel();
        lblPresarServicios = new javax.swing.JLabel();
        btnPSAsesoria = new javax.swing.JButton();
        btnPSConsulta = new javax.swing.JButton();
        btnPSDemanda = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setPreferredSize(new java.awt.Dimension(876, 680));

        panelBackInfoGral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        panelCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscarCliente.setBackground(new java.awt.Color(51, 153, 255));
        btnBuscarCliente.setForeground(new java.awt.Color(153, 153, 153));
        btnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/magnifier.png"))); // NOI18N
        btnBuscarCliente.setToolTipText("");
        btnBuscarCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscarCliente.setBorderPainted(false);
        btnBuscarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });
        panelCliente.add(btnBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 40, 30));
        panelCliente.add(tfBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 480, 30));

        btnNuevoCliente.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnNuevoCliente.setForeground(new java.awt.Color(51, 51, 51));
        btnNuevoCliente.setText("Nuevo Cliente");
        btnNuevoCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoClienteMouseClicked(evt);
            }
        });
        btnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteActionPerformed(evt);
            }
        });
        panelCliente.add(btnNuevoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 210, 40));

        btnActualizarInfoCliente.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnActualizarInfoCliente.setForeground(new java.awt.Color(51, 51, 51));
        btnActualizarInfoCliente.setText("Actualizar Información de Cliente");
        panelCliente.add(btnActualizarInfoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 210, 40));

        btnVerServiciosPrestados.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnVerServiciosPrestados.setForeground(new java.awt.Color(51, 51, 51));
        btnVerServiciosPrestados.setText("Ver Servicios Prestados");
        btnVerServiciosPrestados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerServiciosPrestadosMouseClicked(evt);
            }
        });
        btnVerServiciosPrestados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerServiciosPrestadosActionPerformed(evt);
            }
        });
        panelCliente.add(btnVerServiciosPrestados, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 210, 40));

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(51, 51, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Folio Cliente", "Nombre", "No de Casos Activos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        panelCliente.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 530, 100));

        lblCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCliente.setForeground(new java.awt.Color(51, 51, 51));
        lblCliente.setText("Cliente");
        panelCliente.add(lblCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        panelInfoGral.setPreferredSize(new java.awt.Dimension(530, 530));

        lblNombreInfoGral.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNombreInfoGral.setForeground(new java.awt.Color(102, 102, 102));
        lblNombreInfoGral.setText("Nombre: ");

        lblDomicilioInfoGral.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDomicilioInfoGral.setForeground(new java.awt.Color(102, 102, 102));
        lblDomicilioInfoGral.setText("Domicilio: ");

        lblDomicilioAuxInfoGral.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDomicilioAuxInfoGral.setForeground(new java.awt.Color(102, 102, 102));
        lblDomicilioAuxInfoGral.setText("Domicilio Auxiliar: ");

        lblTelefonoInfoGral.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTelefonoInfoGral.setForeground(new java.awt.Color(102, 102, 102));
        lblTelefonoInfoGral.setText("Teléfono:");

        lblTelefonoAuxInfoGral.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTelefonoAuxInfoGral.setForeground(new java.awt.Color(102, 102, 102));
        lblTelefonoAuxInfoGral.setText("Teléfono Auxiliar: ");

        lblCelularInfoGral.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCelularInfoGral.setForeground(new java.awt.Color(102, 102, 102));
        lblCelularInfoGral.setText("Celular: ");

        lblCiudadInfoGral.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCiudadInfoGral.setForeground(new java.awt.Color(102, 102, 102));
        lblCiudadInfoGral.setText("Ciudad: ");

        lblPoblacionInfoGral.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPoblacionInfoGral.setForeground(new java.awt.Color(102, 102, 102));
        lblPoblacionInfoGral.setText("Población: ");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Estado: ");

        tfNombreInfoGral.setEnabled(false);

        tfDomicilioInfoGral.setEnabled(false);

        tfDomicilioAuxInfoGral.setEnabled(false);

        tfTelefonoInfoGral.setEnabled(false);

        tfTelefonoAuxInfoGral.setEnabled(false);

        tfCelularInfoGral.setEnabled(false);

        tfCiudadInfoGral.setEnabled(false);

        tfEstadoInfoGral.setEnabled(false);

        tfPoblacionInfoGral.setEnabled(false);
        tfPoblacionInfoGral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPoblacionInfoGralActionPerformed(evt);
            }
        });

        btnAgregarNuevoCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAgregarNuevoCliente.setForeground(new java.awt.Color(51, 51, 51));
        btnAgregarNuevoCliente.setText("Agregar Nuevo Cliente");
        btnAgregarNuevoCliente.setEnabled(false);

        javax.swing.GroupLayout panelInfoGralLayout = new javax.swing.GroupLayout(panelInfoGral);
        panelInfoGral.setLayout(panelInfoGralLayout);
        panelInfoGralLayout.setHorizontalGroup(
            panelInfoGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoGralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfoGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelInfoGralLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAgregarNuevoCliente))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelInfoGralLayout.createSequentialGroup()
                        .addGroup(panelInfoGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreInfoGral)
                            .addComponent(lblDomicilioInfoGral))
                        .addGap(49, 49, 49)
                        .addGroup(panelInfoGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNombreInfoGral)
                            .addComponent(tfDomicilioInfoGral, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelInfoGralLayout.createSequentialGroup()
                        .addGroup(panelInfoGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDomicilioAuxInfoGral)
                            .addComponent(lblTelefonoInfoGral)
                            .addComponent(lblTelefonoAuxInfoGral)
                            .addComponent(lblCelularInfoGral)
                            .addComponent(lblCiudadInfoGral)
                            .addComponent(lblPoblacionInfoGral)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelInfoGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCiudadInfoGral)
                            .addComponent(tfCelularInfoGral)
                            .addComponent(tfTelefonoAuxInfoGral)
                            .addComponent(tfTelefonoInfoGral)
                            .addComponent(tfDomicilioAuxInfoGral, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfPoblacionInfoGral, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfEstadoInfoGral, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        panelInfoGralLayout.setVerticalGroup(
            panelInfoGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoGralLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelInfoGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreInfoGral)
                    .addComponent(tfNombreInfoGral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInfoGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDomicilioInfoGral)
                    .addComponent(tfDomicilioInfoGral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInfoGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDomicilioAuxInfoGral)
                    .addComponent(tfDomicilioAuxInfoGral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInfoGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefonoInfoGral)
                    .addComponent(tfTelefonoInfoGral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInfoGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefonoAuxInfoGral)
                    .addComponent(tfTelefonoAuxInfoGral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInfoGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCelularInfoGral)
                    .addComponent(tfCelularInfoGral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInfoGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCiudadInfoGral)
                    .addComponent(tfCiudadInfoGral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInfoGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPoblacionInfoGral)
                    .addComponent(tfPoblacionInfoGral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInfoGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(tfEstadoInfoGral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCliente.add(panelInfoGral, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, 370));

        lblInfoGral.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblInfoGral.setForeground(new java.awt.Color(51, 51, 51));
        lblInfoGral.setText("Información General");
        panelCliente.add(lblInfoGral, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        panelPrestarServicios.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        panelPrestarServicios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPresarServicios.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPresarServicios.setForeground(new java.awt.Color(51, 51, 51));
        lblPresarServicios.setText("Prestar Servicios");
        panelPrestarServicios.add(lblPresarServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 20, -1, -1));

        btnPSAsesoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPSAsesoria.setForeground(new java.awt.Color(51, 51, 51));
        btnPSAsesoria.setText("Asesoría");
        btnPSAsesoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPSAsesoriaActionPerformed(evt);
            }
        });
        panelPrestarServicios.add(btnPSAsesoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 170, -1));

        btnPSConsulta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPSConsulta.setForeground(new java.awt.Color(51, 51, 51));
        btnPSConsulta.setText("Consulta");
        panelPrestarServicios.add(btnPSConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 170, -1));

        btnPSDemanda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPSDemanda.setForeground(new java.awt.Color(51, 51, 51));
        btnPSDemanda.setText("Demanda");
        btnPSDemanda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPSDemandaMouseClicked(evt);
            }
        });
        btnPSDemanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPSDemandaActionPerformed(evt);
            }
        });
        panelPrestarServicios.add(btnPSDemanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 170, -1));

        panelCliente.add(panelPrestarServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 230, 210));

        panelBackInfoGral.add(panelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackInfoGral, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBackInfoGral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerServiciosPrestadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerServiciosPrestadosActionPerformed
       
    }//GEN-LAST:event_btnVerServiciosPrestadosActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnPSDemandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPSDemandaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPSDemandaActionPerformed

    private void btnPSAsesoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPSAsesoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPSAsesoriaActionPerformed

    private void btnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteActionPerformed
        
    }//GEN-LAST:event_btnNuevoClienteActionPerformed

    private void tfPoblacionInfoGralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPoblacionInfoGralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPoblacionInfoGralActionPerformed

    private void btnNuevoClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoClienteMouseClicked
        tfCelularInfoGral.setEnabled(true);
        tfNombreInfoGral.setEnabled(true);
        tfCiudadInfoGral.setEnabled(true);
        tfEstadoInfoGral.setEnabled(true);
        tfDomicilioInfoGral.setEnabled(true);
        tfDomicilioAuxInfoGral.setEnabled(true);
        tfTelefonoInfoGral.setEnabled(true);
        tfTelefonoAuxInfoGral.setEnabled(true);
        tfPoblacionInfoGral.setEnabled(true);
        tfEstadoInfoGral.setEnabled(true);
        btnAgregarNuevoCliente.setEnabled(true);
    }//GEN-LAST:event_btnNuevoClienteMouseClicked

    private void btnVerServiciosPrestadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerServiciosPrestadosMouseClicked
        FrameInternoServiciosPrestados fiod = new FrameInternoServiciosPrestados();
        
        JDesktopPane desk = getDesktopPane();
        
        Dimension desktopSize = desk.getSize();
        Dimension jInternalFrameSize = fiod.getSize();
        fiod.setLocation((desktopSize.width - jInternalFrameSize.width) / 2, (desktopSize.height - jInternalFrameSize.height) / 2);
        
        desk.add(fiod);
        fiod.show();
    }//GEN-LAST:event_btnVerServiciosPrestadosMouseClicked

    private void btnPSDemandaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPSDemandaMouseClicked
        
        FrameInternoOpcionesDemanda fiod = new FrameInternoOpcionesDemanda();
        
        JDesktopPane desk = getDesktopPane();
        
        Dimension desktopSize = desk.getSize();
        Dimension jInternalFrameSize = fiod.getSize();
        fiod.setLocation((desktopSize.width - jInternalFrameSize.width) / 2, (desktopSize.height - jInternalFrameSize.height) / 2);
        
        desk.add(fiod);
        fiod.show();
        this.dispose();
    }//GEN-LAST:event_btnPSDemandaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarInfoCliente;
    private javax.swing.JButton btnAgregarNuevoCliente;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnNuevoCliente;
    private javax.swing.JButton btnPSAsesoria;
    private javax.swing.JButton btnPSConsulta;
    private javax.swing.JButton btnPSDemanda;
    private javax.swing.JButton btnVerServiciosPrestados;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCelularInfoGral;
    private javax.swing.JLabel lblCiudadInfoGral;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblDomicilioAuxInfoGral;
    private javax.swing.JLabel lblDomicilioInfoGral;
    private javax.swing.JLabel lblInfoGral;
    private javax.swing.JLabel lblNombreInfoGral;
    private javax.swing.JLabel lblPoblacionInfoGral;
    private javax.swing.JLabel lblPresarServicios;
    private javax.swing.JLabel lblTelefonoAuxInfoGral;
    private javax.swing.JLabel lblTelefonoInfoGral;
    private javax.swing.JPanel panelBackInfoGral;
    private javax.swing.JPanel panelCliente;
    private javax.swing.JPanel panelInfoGral;
    private javax.swing.JPanel panelPrestarServicios;
    private javax.swing.JTextField tfBuscarCliente;
    private javax.swing.JTextField tfCelularInfoGral;
    private javax.swing.JTextField tfCiudadInfoGral;
    private javax.swing.JTextField tfDomicilioAuxInfoGral;
    private javax.swing.JTextField tfDomicilioInfoGral;
    private javax.swing.JTextField tfEstadoInfoGral;
    private javax.swing.JTextField tfNombreInfoGral;
    private javax.swing.JTextField tfPoblacionInfoGral;
    private javax.swing.JTextField tfTelefonoAuxInfoGral;
    private javax.swing.JTextField tfTelefonoInfoGral;
    // End of variables declaration//GEN-END:variables
}
