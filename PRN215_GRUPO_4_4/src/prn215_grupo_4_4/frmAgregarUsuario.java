
package prn215_grupo_4_4;

import Clases.Empleado;
import Clases.Persona;
import Clases.Usuario;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frmAgregarUsuario extends javax.swing.JFrame {
    
    
        //PERMITE INSERTAR ELEMENTOS EN TIEMPO CONSTANTE
    public static LinkedList contenedor = new LinkedList();

    private DefaultTableModel modelo;
    int contador=0;
    int fila;
    public frmAgregarUsuario() {
        initComponents();
     
        
        CargarInterfaz();
        CargarDatos();
        //PONER LA VENTANA EN MEDIO DE LA PANTALLA
        this.setLocationRelativeTo(null);
        
        
        
    }
    
    //METODO CARGAR INTERFAZ
    public void CargarInterfaz(){
        String datos[][]={};
        String columna[]= {"Codigo","Nombre","Apellido","Cargo"};
        modelo= new DefaultTableModel(datos,columna);
        jTControlEmpleadoUsuario.setModel(modelo);
    }
    
    //METODO CARGAR DATOS
    public void CargarDatos(){
        
       
        Empleado e;
        for (int i = 0; i < frmAgregarEmpleado.contenedor.size(); i++) {
            e=(Empleado)frmAgregarEmpleado.contenedor.get(i);
            modelo.insertRow(contador,new Object[]{} );
            modelo.setValueAt("EMP"+e.getIdEmpleado(),contador,0);
            modelo.setValueAt(e.getNombre(),contador,1);
            modelo.setValueAt(e.getApellido(),contador,2);
            modelo.setValueAt(e.getCargo(),contador,3);
            
            
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTNombreUsuario = new javax.swing.JTextField();
        jTContraseña = new javax.swing.JTextField();
        lblGuardar = new javax.swing.JPanel();
        jBLimpiar = new javax.swing.JButton();
        jBMostrarDatos = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lblCancelar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTControlEmpleadoUsuario = new javax.swing.JTable();

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

        jLabel2.setText("Nombres");

        jLabel3.setText("Contraseña:");

        jTNombreUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTNombreUsuarioKeyTyped(evt);
            }
        });

        jTContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTContraseñaKeyTyped(evt);
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

        jTControlEmpleadoUsuario.setBackground(new java.awt.Color(44, 62, 80));
        jTControlEmpleadoUsuario.setFont(new java.awt.Font("Bodoni MT", 0, 12)); // NOI18N
        jTControlEmpleadoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jTControlEmpleadoUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Apellido", "Cargo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTControlEmpleadoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTControlEmpleadoUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTControlEmpleadoUsuario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addComponent(jTNombreUsuario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jTNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(273, 273, 273)
                .addComponent(lblGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(167, 167, 167)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGap(167, 167, 167)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBMostrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMostrarDatosActionPerformed
        dispose();
        frmUsuarios mostrarUsuarios = new frmUsuarios();
        mostrarUsuarios.setVisible(true);
    }//GEN-LAST:event_jBMostrarDatosActionPerformed

    private void jTNombreUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNombreUsuarioKeyTyped
        char c=evt.getKeyChar();
        if ((c<'a' || c>'z') && (c<'A' || c>'Z') ) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo caracteres");
        }
    }//GEN-LAST:event_jTNombreUsuarioKeyTyped

    private void jTContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTContraseñaKeyTyped
        char c=evt.getKeyChar();
        if ((c<'a' || c>'z') && (c<'A' || c>'Z') ) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo caracteres");
        }
    }//GEN-LAST:event_jTContraseñaKeyTyped

    
    
    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        //LIMPIAMOS LOS CAMPOS.
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
           if (jTNombreUsuario.getText().isEmpty() || jTContraseña.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "No dejes vacio los campos");
        }
        else
        {
        Usuario usuario  = new Usuario();
        usuario.setNombreUsuario(jTNombreUsuario.getText());
        usuario.setContraseña(jTContraseña.getText());
        contenedor.add(usuario);
        
        jTNombreUsuario.setText("");
        jTContraseña.setText("");
        JOptionPane.showMessageDialog(rootPane, "Datos ingresados correctamente");
        
    }//GEN-LAST:event_jLabel8MouseClicked
    }
    private void lblCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelarMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_lblCancelarMouseClicked

    private void jTControlEmpleadoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTControlEmpleadoUsuarioMouseClicked
        // TODO add your handling code here:
        fila = jTControlEmpleadoUsuario.getSelectedRow();
        jTNombreUsuario.setText(jTControlEmpleadoUsuario.getValueAt(fila, 1).toString()+"."+jTControlEmpleadoUsuario.getValueAt(fila, 2).toString());
    }//GEN-LAST:event_jTControlEmpleadoUsuarioMouseClicked

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
            java.util.logging.Logger.getLogger(frmAgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAgregarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBMostrarDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTContraseña;
    private javax.swing.JTable jTControlEmpleadoUsuario;
    private javax.swing.JTextField jTNombreUsuario;
    private javax.swing.JLabel lblCancelar;
    private javax.swing.JPanel lblGuardar;
    // End of variables declaration//GEN-END:variables
}
