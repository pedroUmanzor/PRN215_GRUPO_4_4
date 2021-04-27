
package prn215_grupo_4_4;

import Clases.Empleado;
import Clases.Persona;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;


public class frmAgregarEmpleado extends javax.swing.JFrame {

    //PERMITE INSERTAR ELEMENTOS EN TIEMPO CONSTANTE
    public static LinkedList contenedor = new LinkedList();
    public frmAgregarEmpleado() {
        initComponents();
        //PONER LA VENTANA EN MEDIO DE LA PANTALLA
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTNombreEmpleado = new javax.swing.JTextField();
        jTTelefonoEmpleado = new javax.swing.JTextField();
        jTApellidosEmpleado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTDuiEmpleado = new javax.swing.JTextField();
        lblGuardar = new javax.swing.JPanel();
        jBLimpiar = new javax.swing.JButton();
        jBMostrarDatos = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lblCancelar = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jCbxCargo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAreaDireccionEmpleado = new javax.swing.JTextArea();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        jLabel1.setFont(new java.awt.Font("Cooper Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(30, 139, 195));
        jLabel1.setText("Registrar Empleados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel2.setText("Nombres:");

        jLabel3.setText("Apellidos:");

        jLabel4.setText("Direccion:");

        jLabel5.setText("Telefono:");

        jTNombreEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTNombreEmpleadoKeyTyped(evt);
            }
        });

        jTTelefonoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTTelefonoEmpleadoActionPerformed(evt);
            }
        });
        jTTelefonoEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTTelefonoEmpleadoKeyTyped(evt);
            }
        });

        jTApellidosEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTApellidosEmpleadoActionPerformed(evt);
            }
        });
        jTApellidosEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTApellidosEmpleadoKeyTyped(evt);
            }
        });

        jLabel7.setText("DUI:");

        jTDuiEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTDuiEmpleadoKeyTyped(evt);
            }
        });

        lblGuardar.setBackground(new java.awt.Color(51, 110, 123));

        jBLimpiar.setBackground(new java.awt.Color(44, 62, 80));
        jBLimpiar.setFont(new java.awt.Font("Bodoni MT", 1, 12)); // NOI18N
        jBLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jBMostrarDatos.setBackground(new java.awt.Color(44, 62, 80));
        jBMostrarDatos.setFont(new java.awt.Font("Bodoni MT", 1, 12)); // NOI18N
        jBMostrarDatos.setForeground(new java.awt.Color(255, 255, 255));
        jBMostrarDatos.setText("Mostrar Datos");
        jBMostrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMostrarDatosActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cheque.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        lblCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CANCELAR.png"))); // NOI18N
        lblCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCancelarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout lblGuardarLayout = new javax.swing.GroupLayout(lblGuardar);
        lblGuardar.setLayout(lblGuardarLayout);
        lblGuardarLayout.setHorizontalGroup(
            lblGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblGuardarLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCancelar)
                .addGap(49, 49, 49)
                .addComponent(jBLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBMostrarDatos)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        lblGuardarLayout.setVerticalGroup(
            lblGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblGuardarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(lblGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addGroup(lblGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblCancelar, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(lblGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBLimpiar)
                            .addComponent(jBMostrarDatos))))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel9.setText("Cardo");

        jCbxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cajero", "Gerente" }));

        jTAreaDireccionEmpleado.setColumns(20);
        jTAreaDireccionEmpleado.setRows(5);
        jScrollPane1.setViewportView(jTAreaDireccionEmpleado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTApellidosEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addComponent(jTTelefonoEmpleado)
                    .addComponent(jTNombreEmpleado)
                    .addComponent(jTDuiEmpleado)
                    .addComponent(jCbxCargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jTNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTApellidosEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTTelefonoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTDuiEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCbxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(41, 41, 41)
                .addComponent(lblGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTTelefonoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTTelefonoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTTelefonoEmpleadoActionPerformed

    private void jTApellidosEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTApellidosEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTApellidosEmpleadoActionPerformed

    private void jBMostrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMostrarDatosActionPerformed
        dispose();
        frmEmpleados mostrarEmpleados = new frmEmpleados();
        mostrarEmpleados.setVisible(true);
    }//GEN-LAST:event_jBMostrarDatosActionPerformed

    private void jTTelefonoEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTTelefonoEmpleadoKeyTyped
        char c=evt.getKeyChar();
        if (c<'0' || c>'9') {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese datos numericos");
        }
    }//GEN-LAST:event_jTTelefonoEmpleadoKeyTyped

    private void jTDuiEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDuiEmpleadoKeyTyped

        char c=evt.getKeyChar();
        if (c<'0' || c>'9') {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese datos numericos");       
        }
    }//GEN-LAST:event_jTDuiEmpleadoKeyTyped

    private void jTNombreEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNombreEmpleadoKeyTyped
        char c=evt.getKeyChar();
        if ((c<'a' || c>'z') && (c<'A' || c>'Z') ) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo caracteres");
        }
    }//GEN-LAST:event_jTNombreEmpleadoKeyTyped

    private void jTApellidosEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTApellidosEmpleadoKeyTyped
        char c=evt.getKeyChar();
        if ((c<'a' || c>'z') && (c<'A' || c>'Z') ) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo caracteres");
        }
    }//GEN-LAST:event_jTApellidosEmpleadoKeyTyped

    
    
    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        //LIMPIAMOS LOS CAMPOS.
            jTNombreEmpleado.setText("");
            jTApellidosEmpleado.setText("");
            jTAreaDireccionEmpleado.setText("");
            jTTelefonoEmpleado.setText("");
            jTDuiEmpleado.setText("");
            jTNombreEmpleado.requestFocus();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        if (jTNombreEmpleado.getText().isEmpty() || jTApellidosEmpleado.getText().isEmpty() || jTAreaDireccionEmpleado.getText().isEmpty() || jTTelefonoEmpleado.getText().isEmpty() || jTDuiEmpleado.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(rootPane, "No dejes vacio los campos");
        }
        else
        {
        Empleado empleado = new Empleado();
        empleado.setNombre(jTNombreEmpleado.getText());
        empleado.setApellido(jTApellidosEmpleado.getText());
        empleado.setDireccion(jTAreaDireccionEmpleado.getText());
        empleado.setTelefono(jTTelefonoEmpleado.getText());
        empleado.setDui(jTDuiEmpleado.getText());
        empleado.setCargo(jCbxCargo.getSelectedItem().toString());
        contenedor.add(empleado);
        
        jTNombreEmpleado.setText("");
        jTApellidosEmpleado.setText("");
        jTAreaDireccionEmpleado.setText("");
        jTTelefonoEmpleado.setText("");
        jTDuiEmpleado.setText("");
        JOptionPane.showMessageDialog(rootPane, "Datos ingresados correctamente");
        jTNombreEmpleado.requestFocus();
        }   
    }//GEN-LAST:event_jLabel8MouseClicked

    private void lblCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelarMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_lblCancelarMouseClicked

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
            java.util.logging.Logger.getLogger(frmAgregarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAgregarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAgregarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAgregarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAgregarEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBMostrarDatos;
    private javax.swing.JComboBox<String> jCbxCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTApellidosEmpleado;
    private javax.swing.JTextArea jTAreaDireccionEmpleado;
    private javax.swing.JTextField jTDuiEmpleado;
    private javax.swing.JTextField jTNombreEmpleado;
    private javax.swing.JTextField jTTelefonoEmpleado;
    private javax.swing.JLabel lblCancelar;
    private javax.swing.JPanel lblGuardar;
    // End of variables declaration//GEN-END:variables
}
