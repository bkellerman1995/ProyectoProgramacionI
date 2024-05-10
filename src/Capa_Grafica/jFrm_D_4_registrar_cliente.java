
package Capa_Grafica;

import Capa_Lógica.C_Cine;
import Capa_Lógica.D_Cliente;
import Capa_Lógica.B_Película;
import Capa_Lógica.Tipo_Tarjeta;
import com.toedter.calendar.JTextFieldDateEditor;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
public class jFrm_D_4_registrar_cliente extends javax.swing.JFrame {

    
    C_Cine cine;
    B_Película pelicula;
    D_Cliente cliente;
    Tipo_Tarjeta tipo_tarjeta;
    int sala;
    String numero_tarjeta;
    String nombre;
    String anno_actual;
    String mes_actual;
    Date date;
    SimpleDateFormat sdf_anno;
    SimpleDateFormat sdf_mes;
    
    
    public jFrm_D_4_registrar_cliente(C_Cine cine, B_Película pelicula, D_Cliente cliente,Tipo_Tarjeta tipo_tarjeta, int sala) {
        this.cine = cine;
        this.pelicula = pelicula;
        this.cliente = cliente;
        this.tipo_tarjeta = tipo_tarjeta;
        this.sala = sala;
        this.date = new Date();
        this.sdf_anno = new SimpleDateFormat ("YYYY");
        this.anno_actual = sdf_anno.format(this.date);
        this.sdf_mes = new SimpleDateFormat ("MM");
        this.mes_actual = sdf_mes.format(this.date);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLlb_Nombre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtA_Factura_de_compra = new javax.swing.JTextArea();
        jLbl_Tipo_Tarjeta = new javax.swing.JLabel();
        jCbo_Tipo_Tarjeta = new javax.swing.JComboBox<>();
        jLbl_Número_tarjeta = new javax.swing.JLabel();
        jBtn_Regresar = new javax.swing.JButton();
        jTxt_Número_Tarjeta = new javax.swing.JTextField();
        jLbl_CVC = new javax.swing.JLabel();
        jTxt_CVC = new javax.swing.JTextField();
        jTxt_Nombre = new javax.swing.JTextField();
        jBtn_limpiar = new javax.swing.JButton();
        jBtn_Completar_Compra = new javax.swing.JButton();
        jLlbl_Anno = new javax.swing.JLabel();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        jLabel1 = new javax.swing.JLabel();
        jBtn_Verificar_tarjeta = new javax.swing.JButton();
        jLbl_Image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar cliente");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(null);

        jLlb_Nombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLlb_Nombre.setForeground(java.awt.Color.black);
        jLlb_Nombre.setText("Nombre");
        jPanel1.add(jLlb_Nombre);
        jLlb_Nombre.setBounds(10, 70, 55, 19);

        jTxtA_Factura_de_compra.setColumns(20);
        jTxtA_Factura_de_compra.setRows(5);
        jScrollPane1.setViewportView(jTxtA_Factura_de_compra);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(340, 100, 290, 350);

        jLbl_Tipo_Tarjeta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLbl_Tipo_Tarjeta.setForeground(java.awt.Color.black);
        jLbl_Tipo_Tarjeta.setText("Tipo de tarjeta");
        jPanel1.add(jLbl_Tipo_Tarjeta);
        jLbl_Tipo_Tarjeta.setBounds(10, 120, 101, 19);

        jCbo_Tipo_Tarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbo_Tipo_TarjetaActionPerformed(evt);
            }
        });
        jPanel1.add(jCbo_Tipo_Tarjeta);
        jCbo_Tipo_Tarjeta.setBounds(150, 120, 90, 26);

        jLbl_Número_tarjeta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLbl_Número_tarjeta.setForeground(java.awt.Color.black);
        jLbl_Número_tarjeta.setText("Número de tarjeta");
        jPanel1.add(jLbl_Número_tarjeta);
        jLbl_Número_tarjeta.setBounds(10, 160, 126, 19);

        jBtn_Regresar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBtn_Regresar.setForeground(new java.awt.Color(255, 102, 0));
        jBtn_Regresar.setText("Regresar");
        jBtn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_RegresarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn_Regresar);
        jBtn_Regresar.setBounds(405, 10, 160, 35);

        jTxt_Número_Tarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxt_Número_TarjetaActionPerformed(evt);
            }
        });
        jPanel1.add(jTxt_Número_Tarjeta);
        jTxt_Número_Tarjeta.setBounds(150, 160, 180, 24);

        jLbl_CVC.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLbl_CVC.setForeground(java.awt.Color.black);
        jLbl_CVC.setText("CVC");
        jPanel1.add(jLbl_CVC);
        jLbl_CVC.setBounds(10, 220, 29, 19);

        jTxt_CVC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxt_CVCActionPerformed(evt);
            }
        });
        jPanel1.add(jTxt_CVC);
        jTxt_CVC.setBounds(150, 220, 70, 24);

        jTxt_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxt_NombreActionPerformed(evt);
            }
        });
        jPanel1.add(jTxt_Nombre);
        jTxt_Nombre.setBounds(150, 70, 160, 24);

        jBtn_limpiar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBtn_limpiar.setForeground(new java.awt.Color(0, 204, 153));
        jBtn_limpiar.setText("Limpiar");
        jBtn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_limpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn_limpiar);
        jBtn_limpiar.setBounds(401, 60, 160, 35);

        jBtn_Completar_Compra.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBtn_Completar_Compra.setForeground(new java.awt.Color(153, 153, 0));
        jBtn_Completar_Compra.setText("Completar Compra");
        jBtn_Completar_Compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Completar_CompraActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn_Completar_Compra);
        jBtn_Completar_Compra.setBounds(10, 450, 240, 35);

        jLlbl_Anno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLlbl_Anno.setForeground(java.awt.Color.black);
        jLlbl_Anno.setText("Año");
        jPanel1.add(jLlbl_Anno);
        jLlbl_Anno.setBounds(10, 270, 27, 19);
        jPanel1.add(jYearChooser1);
        jYearChooser1.setBounds(150, 270, 58, 24);
        jPanel1.add(jMonthChooser1);
        jMonthChooser1.setBounds(150, 310, 109, 24);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.black);
        jLabel1.setText("Mes");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 310, 41, 16);

        jBtn_Verificar_tarjeta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBtn_Verificar_tarjeta.setForeground(java.awt.Color.blue);
        jBtn_Verificar_tarjeta.setText("Verificar Tarjeta");
        jBtn_Verificar_tarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Verificar_tarjetaActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn_Verificar_tarjeta);
        jBtn_Verificar_tarjeta.setBounds(10, 380, 250, 35);

        jLbl_Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Capa_Grafica/toy story.jpg"))); // NOI18N
        jPanel1.add(jLbl_Image);
        jLbl_Image.setBounds(-110, 0, 740, 590);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (Tipo_Tarjeta tipo : Tipo_Tarjeta.values()) {
            this.jCbo_Tipo_Tarjeta.addItem(tipo);

        }
        this.jCbo_Tipo_Tarjeta.setSelectedIndex(-1);
        this.jCbo_Tipo_Tarjeta.setEnabled(false);
        this.jTxt_Número_Tarjeta.setEditable(false);
        this.jTxt_CVC.setEditable(false);
        this.jTxtA_Factura_de_compra.setEditable(false);
        this.jBtn_Completar_Compra.setEnabled(false);
        this.jYearChooser1.setEnabled(false);
        this.jYearChooser1.setStartYear(2020);
        this.jMonthChooser1.setEnabled(false);
        this.jBtn_Verificar_tarjeta.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void jCbo_Tipo_TarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbo_Tipo_TarjetaActionPerformed
        if (this.jCbo_Tipo_Tarjeta.getSelectedIndex() != -1){
            this.jCbo_Tipo_Tarjeta.setEnabled(false);
            this.jTxt_Número_Tarjeta.setEditable(true);
            this.jTxt_Número_Tarjeta.requestFocus();
        } else {
            this.jCbo_Tipo_Tarjeta.setEnabled(true);
        }
    }//GEN-LAST:event_jCbo_Tipo_TarjetaActionPerformed

    private void jBtn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_RegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBtn_RegresarActionPerformed

    private void jBtn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_limpiarActionPerformed
        this.jCbo_Tipo_Tarjeta.setSelectedIndex(-1);
        this.jCbo_Tipo_Tarjeta.setEnabled(false);
        this.jTxt_Nombre.setText("");
        this.jTxt_Nombre.setEditable(true);
        this.jTxt_Número_Tarjeta.setText("");
        this.jTxt_Número_Tarjeta.setEditable(false);
        this.jTxt_CVC.setText("");
        this.jTxt_CVC.setEditable(false);
        this.jTxtA_Factura_de_compra.setText("");
        this.jTxt_Nombre.requestFocus();
        this.jBtn_Completar_Compra.setEnabled(false);
    }//GEN-LAST:event_jBtn_limpiarActionPerformed

    private void jTxt_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxt_NombreActionPerformed
        try {
            nombre = this.jTxt_Nombre.getText();
            if (nombre.matches("^\\D+$")) {
                this.jCbo_Tipo_Tarjeta.setEnabled(true);
                this.jTxt_Nombre.setEditable(false);
                this.cliente.setNombre_cliente(nombre);

            } else {
                JOptionPane.showMessageDialog(this, "Digite un nombre válido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this, "Digite un nombre válido:" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jTxt_NombreActionPerformed

    private void jTxt_Número_TarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxt_Número_TarjetaActionPerformed

            numero_tarjeta = this.jTxt_Número_Tarjeta.getText();
            switch (this.jCbo_Tipo_Tarjeta.getSelectedIndex()) {

                case 0:

                    if (numero_tarjeta.matches("^\\d+$")
                            && numero_tarjeta.trim().length()>0
                            && Character.getNumericValue(numero_tarjeta.charAt(0)) == 4
                            && numero_tarjeta.length() == 16) {
                        this.jTxt_Número_Tarjeta.setEditable(false);
                        JOptionPane.showMessageDialog(null, "Vamos a validar la tarjeta, un momento por favor");
                        this.cliente.setNumero_Tarjeta(numero_tarjeta);
                        if (this.cliente.algoritmo_luhn(this.cliente) == true) {
                            JOptionPane.showMessageDialog(null, "Número de tarjeta válido");
                            this.jTxt_CVC.setEditable(true);
                            this.jTxt_CVC.requestFocus();
                        } else {
                            JOptionPane.showMessageDialog(null, "Número de tarjeta inválido", "Error", JOptionPane.ERROR_MESSAGE);
                            this.jTxt_Número_Tarjeta.setText("");
                            this.jTxt_Número_Tarjeta.setEditable(true);
                            this.jTxt_Número_Tarjeta.requestFocus();
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Digite un número válido de tarjeta", "Error", JOptionPane.ERROR_MESSAGE);
                        this.jTxt_Número_Tarjeta.setEditable(true);
                        this.jTxt_Número_Tarjeta.setText("");
                        this.jTxt_Número_Tarjeta.requestFocus();
                    }
                    break;

                case 1:


                    if (numero_tarjeta.matches("^\\d+$")
                            && numero_tarjeta.trim().length()>0
                            && Character.getNumericValue(numero_tarjeta.charAt(0)) == 5
                            && numero_tarjeta.length() == 16
                            && (Integer.parseInt(numero_tarjeta.substring(0, 1)) >= 51 || Integer.parseInt(numero_tarjeta.substring(0, 1)) <= 55)) {
                        this.jTxt_Número_Tarjeta.setEditable(false);
                        JOptionPane.showMessageDialog(null, "Vamos a validar la tarjeta, un momento por favor");
                        this.cliente.setNumero_Tarjeta(numero_tarjeta);
                        if (this.cliente.algoritmo_luhn(this.cliente) == true) {
                            JOptionPane.showMessageDialog(null, "Número de tarjeta válido");

                            this.jTxt_CVC.setEditable(true);
                            this.jTxt_CVC.requestFocus();
                        } else {
                            JOptionPane.showMessageDialog(null, "Número de tarjeta inválido", "Error", JOptionPane.ERROR_MESSAGE);
                            this.jTxt_Número_Tarjeta.setText("");
                            this.jTxt_Número_Tarjeta.setEditable(true);
                            this.jTxt_Número_Tarjeta.requestFocus();
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Digite un número válido de tarjeta", "Error", JOptionPane.ERROR_MESSAGE);
                        this.jTxt_Número_Tarjeta.setEditable(true);
                        this.jTxt_Número_Tarjeta.setText("");
                        this.jTxt_Número_Tarjeta.requestFocus();
                    }
                    break;

            }



    }//GEN-LAST:event_jTxt_Número_TarjetaActionPerformed

    private void jTxt_CVCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxt_CVCActionPerformed

        String cvc = this.jTxt_CVC.getText();
        if (cvc.matches("^\\d+$") && cvc.length() == 3) {
            this.jYearChooser1.setEnabled(true);
            this.jMonthChooser1.setEnabled(true);
            this.jTxt_CVC.setEditable(false);
            this.jBtn_Verificar_tarjeta.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(this, "Digite un cvc válido", "Error", JOptionPane.ERROR_MESSAGE);
            this.jTxt_CVC.setText("");
            this.jTxt_CVC.setEditable(true);
            this.jTxt_CVC.requestFocus();
            this.jBtn_Verificar_tarjeta.setEnabled(false);
        }

    }//GEN-LAST:event_jTxt_CVCActionPerformed

    private void jBtn_Completar_CompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Completar_CompraActionPerformed

        int opcion = JOptionPane.showConfirmDialog(null,"¿Desea confirmar la compra?","Confirmación",JOptionPane.YES_NO_OPTION);
        switch (this.cliente.getSala()){
            case 1:
                if (opcion == 1){
                    this.cine.quitar_asiento_sala_1(this.cliente);
                } else {
                    this.cliente.setTipo((Tipo_Tarjeta)this.jCbo_Tipo_Tarjeta.getSelectedItem());
                    this.jTxtA_Factura_de_compra.setText(this.cliente.toString_2());
                }
                break;
            case 2:
                if (opcion == 1) {
                    this.cine.quitar_asiento_sala_2(this.cliente);
                } else {
                    this.cliente.setTipo((Tipo_Tarjeta)this.jCbo_Tipo_Tarjeta.getSelectedItem());
                    this.jTxtA_Factura_de_compra.setText(this.cliente.toString_2());
                }
                break;
            case 3:
                if (opcion == 1) {
                    this.cine.quitar_asiento_sala_3(this.cliente);
                } else {
                    this.cliente.setTipo((Tipo_Tarjeta)this.jCbo_Tipo_Tarjeta.getSelectedItem());
                    this.jTxtA_Factura_de_compra.setText(this.cliente.toString_2());
                }
                break;
        }
  
    }//GEN-LAST:event_jBtn_Completar_CompraActionPerformed

    private void jBtn_Verificar_tarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Verificar_tarjetaActionPerformed

        int anno = this.jYearChooser1.getYear();
        int mes = this.jMonthChooser1.getMonth()+1;
        if (anno > Integer.parseInt(this.anno_actual)) {
            JOptionPane.showMessageDialog(null, "Tarjeta válida, proceda a confirmar la compra");
            this.jBtn_Verificar_tarjeta.setEnabled(false);
            this.jBtn_Completar_Compra.setEnabled(true);
            this.jBtn_Completar_Compra.doClick();


        } else {
            if (mes <= Integer.parseInt(this.mes_actual) ) {
                JOptionPane.showMessageDialog(null,  "La tarjeta está expirada"
                        + "\nDigite otra tarjeta","Error",JOptionPane.ERROR_MESSAGE);
                this.jBtn_Verificar_tarjeta.setEnabled(false);
                this.jTxt_CVC.setText("");
                this.jCbo_Tipo_Tarjeta.setEnabled(true);
                this.jCbo_Tipo_Tarjeta.setSelectedIndex(-1);
                this.jTxt_Número_Tarjeta.setText("");
                this.jTxt_Número_Tarjeta.setEditable(true);
                this.jTxt_Número_Tarjeta.requestFocus();
                
            } else {
                JOptionPane.showMessageDialog(null, "Tarjeta válida, proceda a confirmar la compra");
                this.jBtn_Verificar_tarjeta.setEnabled(false);
                this.jBtn_Completar_Compra.setEnabled(true);

            }
        }
        
    }//GEN-LAST:event_jBtn_Verificar_tarjetaActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_Completar_Compra;
    private javax.swing.JButton jBtn_Regresar;
    private javax.swing.JButton jBtn_Verificar_tarjeta;
    private javax.swing.JButton jBtn_limpiar;
    private javax.swing.JComboBox<Capa_Lógica.Tipo_Tarjeta> jCbo_Tipo_Tarjeta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLbl_CVC;
    private javax.swing.JLabel jLbl_Image;
    private javax.swing.JLabel jLbl_Número_tarjeta;
    private javax.swing.JLabel jLbl_Tipo_Tarjeta;
    private javax.swing.JLabel jLlb_Nombre;
    private javax.swing.JLabel jLlbl_Anno;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTxtA_Factura_de_compra;
    private javax.swing.JTextField jTxt_CVC;
    private javax.swing.JTextField jTxt_Nombre;
    private javax.swing.JTextField jTxt_Número_Tarjeta;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    // End of variables declaration//GEN-END:variables
}
