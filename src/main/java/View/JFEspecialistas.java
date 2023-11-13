/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author araya
 */
public class JFEspecialistas extends javax.swing.JFrame {

    /**
     * Creates new form JFUsuarios
     */
    public JFEspecialistas() {
        initComponents();
          this.setLocationRelativeTo(null);
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        txtCedula = new javax.swing.JLabel();
        txtCodigoEspecialista = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JTextField();
        txtEspecialidad = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        bntCita = new javax.swing.JButton();
        btnEspecialistas = new javax.swing.JButton();
        btnAuditoria = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblEspecialidad = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.white);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEliminar.setText("Eliminar");
        btnEliminar.setName("bntEliminar"); // NOI18N
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 110, 48));

        btnGuardar.setText("Guardar");
        btnGuardar.setName("bntGuardar"); // NOI18N
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 120, 48));

        txtCedula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCedula.setText("Código Especialista");
        getContentPane().add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 54, -1, -1));

        txtCodigoEspecialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoEspecialistaActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigoEspecialista, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 80, 249, 34));

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUsuario.setText("Usuario");
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 126, -1, -1));
        getContentPane().add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 152, 249, 34));

        txtEspecialidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEspecialidad.setText("Nombre");
        getContentPane().add(txtEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 198, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setForeground(new java.awt.Color(51, 51, 0));

        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setText("HOME");
        btnHome.setBorder(null);
        btnHome.setContentAreaFilled(false);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        bntCita.setForeground(new java.awt.Color(255, 255, 255));
        bntCita.setText("CITAS");
        bntCita.setBorder(null);
        bntCita.setContentAreaFilled(false);
        bntCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCitaActionPerformed(evt);
            }
        });

        btnEspecialistas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEspecialistas.setForeground(new java.awt.Color(255, 255, 255));
        btnEspecialistas.setText("ESPECIALISTAS");
        btnEspecialistas.setBorder(null);
        btnEspecialistas.setContentAreaFilled(false);

        btnAuditoria.setForeground(new java.awt.Color(255, 255, 255));
        btnAuditoria.setText("AUDITORIA");
        btnAuditoria.setBorder(null);
        btnAuditoria.setContentAreaFilled(false);
        btnAuditoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAuditoriaActionPerformed(evt);
            }
        });

        btnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setText("USUARIOS");
        btnUsuarios.setBorder(null);
        btnUsuarios.setContentAreaFilled(false);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        btnClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes.setText("CLIENTES");
        btnClientes.setBorder(null);
        btnClientes.setContentAreaFilled(false);
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.setContentAreaFilled(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnHome)
                .addGap(18, 18, 18)
                .addComponent(bntCita)
                .addGap(18, 18, 18)
                .addComponent(btnAuditoria)
                .addGap(18, 18, 18)
                .addComponent(btnClientes)
                .addGap(18, 18, 18)
                .addComponent(btnEspecialistas)
                .addGap(18, 18, 18)
                .addComponent(btnUsuarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 296, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHome)
                    .addComponent(bntCita)
                    .addComponent(btnEspecialistas)
                    .addComponent(btnAuditoria)
                    .addComponent(btnUsuarios)
                    .addComponent(btnClientes)
                    .addComponent(btnSalir))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 785, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 54, 490, -1));
        getContentPane().add(lblEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 224, 249, 34));
        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoEspecialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoEspecialistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoEspecialistaActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHomeActionPerformed

    private void bntCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bntCitaActionPerformed

    private void btnAuditoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAuditoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAuditoriaActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JFEspecialistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFEspecialistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFEspecialistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFEspecialistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFEspecialistas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCita;
    private javax.swing.JButton btnAuditoria;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEspecialistas;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lblEspecialidad;
    private javax.swing.JTextField lblUsuario;
    private javax.swing.JLabel txtCedula;
    private javax.swing.JTextField txtCodigoEspecialista;
    private javax.swing.JLabel txtEspecialidad;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
