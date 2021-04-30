
package prn215_grupo_4_4;


import Clases.Cliente;
import Clases.Persona;
import Clases.Producto;
import java.util.LinkedList;
import javax.swing.JOptionPane;


public class AgregarProducto extends javax.swing.JFrame {

    //PERMITE INSERTAR ELEMENTOS EN TIEMPO CONSTANTE
    public static LinkedList contenedor = new LinkedList();
    
    public AgregarProducto() {
        initComponents();
        //PONER LA VENTANA EN MEDIO DE LA PANTALLA
        this.setLocationRelativeTo(null);
                //LLenar combobox
        jCBEstado.addItem("Disponible");
        jCBEstado.addItem("Vendido");
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
        jTNombreProducto = new javax.swing.JTextField();
        jTSerie = new javax.swing.JTextField();
        jTPrecioVenta = new javax.swing.JTextField();
        jTModelo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jBListo = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        jBMostrarDatos = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTCosto = new javax.swing.JTextField();
        jTMarca = new javax.swing.JTextField();
        jCBCategorias = new javax.swing.JComboBox<>();
        jCBEstado = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTACaracteristicas = new javax.swing.JTextArea();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        jLabel1.setFont(new java.awt.Font("Cooper Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(30, 139, 195));
        jLabel1.setText("Registrar producto");

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

        jLabel3.setText("Marca:");

        jLabel4.setText("Modelo:");

        jLabel5.setText("N. serie:");

        jTNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNombreProductoActionPerformed(evt);
            }
        });
        jTNombreProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTNombreProductoKeyTyped(evt);
            }
        });

        jTSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTSerieActionPerformed(evt);
            }
        });
        jTSerie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTSerieKeyTyped(evt);
            }
        });

        jTPrecioVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPrecioVentaActionPerformed(evt);
            }
        });
        jTPrecioVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTPrecioVentaKeyTyped(evt);
            }
        });

        jTModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTModeloActionPerformed(evt);
            }
        });
        jTModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTModeloKeyTyped(evt);
            }
        });

        jLabel7.setText("caracterisiticas:");

        jPanel2.setBackground(new java.awt.Color(51, 110, 123));

        jBListo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cheque.png"))); // NOI18N
        jBListo.setBorder(null);
        jBListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBListoActionPerformed(evt);
            }
        });

        jBCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CANCELAR.png"))); // NOI18N
        jBCancelar.setBorder(null);
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jBListo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBCancelar)
                .addGap(39, 39, 39)
                .addComponent(jBLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBMostrarDatos)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBLimpiar)
                        .addComponent(jBMostrarDatos))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jBCancelar)
                        .addComponent(jBListo)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel8.setText("Categoria:");

        jLabel9.setText("Costo:");

        jLabel10.setText("Estado:");

        jLabel11.setText("Precio venta:");

        jTCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCostoActionPerformed(evt);
            }
        });
        jTCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTCostoKeyTyped(evt);
            }
        });

        jTMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTMarcaActionPerformed(evt);
            }
        });
        jTMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTMarcaKeyTyped(evt);
            }
        });

        jTACaracteristicas.setColumns(20);
        jTACaracteristicas.setRows(5);
        jScrollPane2.setViewportView(jTACaracteristicas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCBEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTCosto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCBCategorias, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTNombreProducto)
                            .addComponent(jTMarca)
                            .addComponent(jTModelo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTSerie, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTPrecioVenta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jTNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jTMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTModelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jTSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCBCategorias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTCosto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCBEstado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTPrecioVenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTSerieActionPerformed

    }//GEN-LAST:event_jTSerieActionPerformed

    private void jTPrecioVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPrecioVentaActionPerformed

    }//GEN-LAST:event_jTPrecioVentaActionPerformed

    private void jTModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTModeloActionPerformed

    }//GEN-LAST:event_jTModeloActionPerformed

    private void jBListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListoActionPerformed

        try{
        if (jTNombreProducto.getText().isEmpty() || jTPrecioVenta.getText().isEmpty()
            || jTModelo.getText().isEmpty() || jTSerie.getText().isEmpty() || jTACaracteristicas.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(rootPane, "No dejes vacio los campos");
        }
        else{
            
            //NOMBRE DE LA CLASE: "Persona" CON SUS ATRIBUTOS
            Producto producto = new Producto();
            producto.setNombre(String.valueOf(jTNombreProducto.getText()));
            producto.setMarca(String.valueOf(jTMarca.getText())); 
            producto.setModelo(String.valueOf(jTModelo.getText())); 
            producto.setNumeroSerie(String.valueOf(jTSerie.getText()));
            producto.setCaracteristicas(String.valueOf(jTACaracteristicas.getText()));
            producto.setCosto(Float.valueOf(jTCosto.getText()));
            producto.setEstado(String.valueOf(jCBEstado.getSelectedItem()));
            producto.setPrecioVenta(Float.valueOf(jTPrecioVenta.getText()));
            //VALIDAMOS QUE EL COSTO Y EL PRECIO VENTA SEAN POSITIVOS
            if (producto.getCosto()<=0 || producto.getPrecioVenta()<=0) {
                JOptionPane.showMessageDialog(rootPane, "Datos Errones,Ingrese valores positivos"+" "+
                                               "en el costo y en el precio venta");
            }else{
            contenedor.add(producto);           
            //LIMPIAMOS LOS CAMPOS.
            jTMarca.setText("");
            jTNombreProducto.setText("");
            jTPrecioVenta.setText("");
            jTModelo.setText("");
            jTSerie.setText("");
            jTACaracteristicas.setText("");
            jTCosto.setText("");
            JOptionPane.showMessageDialog(rootPane, "Datos ingresados correctamente");
            jTNombreProducto.requestFocus();
            }
 
        }  
        }catch(NumberFormatException excepcion){
            JOptionPane.showMessageDialog(rootPane, "Datos no Errones, para el costo y el precio venta ingrese numericos");
        }
    }//GEN-LAST:event_jBListoActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        dispose();      
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBMostrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMostrarDatosActionPerformed
        dispose();
        frmProductos mostrar = new frmProductos();
        mostrar.setVisible(true);
    }//GEN-LAST:event_jBMostrarDatosActionPerformed

    private void jTSerieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTSerieKeyTyped
  
    }//GEN-LAST:event_jTSerieKeyTyped

    private void jTNombreProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNombreProductoKeyTyped

    }//GEN-LAST:event_jTNombreProductoKeyTyped

    private void jTPrecioVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTPrecioVentaKeyTyped

    }//GEN-LAST:event_jTPrecioVentaKeyTyped

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        //LIMPIAMOS LOS CAMPOS.
            jTNombreProducto.setText("");
            jTPrecioVenta.setText("");
            jTModelo.setText("");
            jTSerie.setText("");
            jTACaracteristicas.setText("");
            jTNombreProducto.requestFocus();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jTNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNombreProductoActionPerformed

    }//GEN-LAST:event_jTNombreProductoActionPerformed

    private void jTCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCostoActionPerformed

    }//GEN-LAST:event_jTCostoActionPerformed

    private void jTCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCostoKeyTyped
 
    }//GEN-LAST:event_jTCostoKeyTyped

    private void jTMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTMarcaActionPerformed
        
    }//GEN-LAST:event_jTMarcaActionPerformed

    private void jTMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTMarcaKeyTyped

    }//GEN-LAST:event_jTMarcaKeyTyped

    private void jTModeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTModeloKeyTyped

    }//GEN-LAST:event_jTModeloKeyTyped

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
            java.util.logging.Logger.getLogger(AgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBListo;
    private javax.swing.JButton jBMostrarDatos;
    private javax.swing.JComboBox<String> jCBCategorias;
    private javax.swing.JComboBox<String> jCBEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTACaracteristicas;
    private javax.swing.JTextField jTCosto;
    private javax.swing.JTextField jTMarca;
    private javax.swing.JTextField jTModelo;
    private javax.swing.JTextField jTNombreProducto;
    private javax.swing.JTextField jTPrecioVenta;
    private javax.swing.JTextField jTSerie;
    // End of variables declaration//GEN-END:variables
}
