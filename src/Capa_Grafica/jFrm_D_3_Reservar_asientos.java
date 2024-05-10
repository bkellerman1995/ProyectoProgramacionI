/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Grafica;

import Capa_Lógica.C_Cine;
import Capa_Lógica.D_Cliente;
import Capa_Lógica.B_Película;
import Capa_Lógica.Tipo_Tarjeta;
import javax.swing.JOptionPane;

public class jFrm_D_3_Reservar_asientos extends javax.swing.JFrame {

    C_Cine cine;
    B_Película pelicula;
    int sala;
    D_Cliente cliente;
    Tipo_Tarjeta tipo_tarjeta;
    String filaS;
    String columnaS;
    char fila;
    int columna;
    int contador;

    public jFrm_D_3_Reservar_asientos(C_Cine cine, B_Película pelicula,D_Cliente cliente, Tipo_Tarjeta tipo_tarjeta,int sala) {
        this.cine = cine;
        this.pelicula = pelicula;
        this.sala = sala;
        this.cliente = cliente;
        this.tipo_tarjeta = tipo_tarjeta;
        this.filaS = "";
        this.columnaS = "";
        this.contador = 0;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBtn_Regresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtA_mostrar_asientos = new javax.swing.JTextArea();
        jBtn_Mostrar_asientos = new javax.swing.JButton();
        jTxt_Numero_Sala = new javax.swing.JTextField();
        jBtn_Seleccionar_Asiento = new javax.swing.JButton();
        jLbl_numero_sala = new javax.swing.JLabel();
        jLbl_Número_Fila = new javax.swing.JLabel();
        jLbl_Número_Asiento = new javax.swing.JLabel();
        jTxt_Número_fila = new javax.swing.JTextField();
        jTxt_Número_Asiento = new javax.swing.JTextField();
        jLbl_image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reservar asientos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(null);

        jBtn_Regresar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBtn_Regresar.setForeground(new java.awt.Color(255, 51, 51));
        jBtn_Regresar.setText("Regresar");
        jBtn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_RegresarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn_Regresar);
        jBtn_Regresar.setBounds(0, 0, 130, 35);

        jTxtA_mostrar_asientos.setColumns(20);
        jTxtA_mostrar_asientos.setRows(5);
        jScrollPane1.setViewportView(jTxtA_mostrar_asientos);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(70, 70, 590, 250);

        jBtn_Mostrar_asientos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBtn_Mostrar_asientos.setForeground(new java.awt.Color(255, 51, 51));
        jBtn_Mostrar_asientos.setText("Mostrar asientos");
        jBtn_Mostrar_asientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Mostrar_asientosActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn_Mostrar_asientos);
        jBtn_Mostrar_asientos.setBounds(570, 10, 160, 35);
        jPanel1.add(jTxt_Numero_Sala);
        jTxt_Numero_Sala.setBounds(400, 10, 130, 24);

        jBtn_Seleccionar_Asiento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBtn_Seleccionar_Asiento.setForeground(new java.awt.Color(255, 51, 51));
        jBtn_Seleccionar_Asiento.setText("Seleccionar asiento");
        jBtn_Seleccionar_Asiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Seleccionar_AsientoActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn_Seleccionar_Asiento);
        jBtn_Seleccionar_Asiento.setBounds(30, 350, 220, 35);

        jLbl_numero_sala.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLbl_numero_sala.setForeground(new java.awt.Color(255, 51, 51));
        jLbl_numero_sala.setText("Número de sala");
        jPanel1.add(jLbl_numero_sala);
        jLbl_numero_sala.setBounds(250, 10, 120, 19);

        jLbl_Número_Fila.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLbl_Número_Fila.setForeground(java.awt.Color.yellow);
        jLbl_Número_Fila.setText("Fila");
        jPanel1.add(jLbl_Número_Fila);
        jLbl_Número_Fila.setBounds(390, 360, 150, 19);

        jLbl_Número_Asiento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLbl_Número_Asiento.setForeground(java.awt.Color.yellow);
        jLbl_Número_Asiento.setText("Número de asiento");
        jPanel1.add(jLbl_Número_Asiento);
        jLbl_Número_Asiento.setBounds(390, 400, 150, 19);

        jTxt_Número_fila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxt_Número_filaActionPerformed(evt);
            }
        });
        jPanel1.add(jTxt_Número_fila);
        jTxt_Número_fila.setBounds(550, 360, 100, 24);

        jTxt_Número_Asiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxt_Número_AsientoActionPerformed(evt);
            }
        });
        jPanel1.add(jTxt_Número_Asiento);
        jTxt_Número_Asiento.setBounds(550, 400, 100, 24);

        jLbl_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Capa_Grafica/cinema.jpg"))); // NOI18N
        jPanel1.add(jLbl_image);
        jLbl_image.setBounds(-130, 0, 900, 490);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.jTxtA_mostrar_asientos.setEditable(false);
        this.jTxt_Numero_Sala.setEditable(false);
        this.jTxt_Numero_Sala.setText("" + sala);
        this.jTxt_Número_fila.setEditable(false);
        this.jTxt_Número_Asiento.setEditable(false);
        this.jBtn_Seleccionar_Asiento.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void jBtn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_RegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBtn_RegresarActionPerformed

    private void jBtn_Mostrar_asientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Mostrar_asientosActionPerformed
        switch (this.sala) {
            case 1:
                this.jTxtA_mostrar_asientos.setText(this.cine.toString_sala_1());
                break;
            case 2:
                this.jTxtA_mostrar_asientos.setText(this.cine.toString_sala_2());
                break;
            case 3:
                this.jTxtA_mostrar_asientos.setText(this.cine.toString_sala_3());
                break;
        }
        this.jTxt_Número_fila.setEditable(true);
        this.jTxt_Número_fila.requestFocus();

    }//GEN-LAST:event_jBtn_Mostrar_asientosActionPerformed

    private void jBtn_Seleccionar_AsientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Seleccionar_AsientoActionPerformed
        switch (this.sala) {
            case 1:
                if (this.cine.agregar_asientos_Sala_1(this.fila, this.columna, this.cliente) == true) {
                    JOptionPane.showMessageDialog(null, "Asiento reservado con éxito");
                    
                    this.jTxtA_mostrar_asientos.setText(this.cine.toString_sala_1());
                    this.cliente.setAsiento(this.cliente.getAsiento() + "" + this.fila + this.columna + ", ");
                    this.contador++;
                    this.jTxt_Número_fila.setText("");
                    this.jTxt_Número_fila.setEditable(true);
                    this.jTxt_Número_fila.requestFocus();
                    this.jTxt_Número_Asiento.setText("");

                } else {
                    JOptionPane.showMessageDialog(null, "El asiento está reservado", "Error", JOptionPane.ERROR_MESSAGE);
                    JOptionPane.showMessageDialog(null, "Debe registrar otro asiento");
                    this.jTxt_Número_fila.requestFocus();
                    this.jTxt_Número_fila.setText("");
                    this.jTxt_Número_fila.setEditable(true);
                    this.jTxt_Número_Asiento.setText("");
                }
                break;

            case 2:
                if (this.cine.agregar_asientos_Sala_2(this.fila, this.columna, this.cliente) == true) {
                    JOptionPane.showMessageDialog(null, "Asiento reservado con éxito");
                    this.jTxtA_mostrar_asientos.setText(this.cine.toString_sala_2());
                    this.cliente.setAsiento(this.cliente.getAsiento() + "" + this.fila + this.columna + ", ");
                    this.contador++;
                    this.jTxt_Número_fila.setText("");
                    this.jTxt_Número_fila.setEditable(true);
                    this.jTxt_Número_fila.requestFocus();
                    this.jTxt_Número_Asiento.setText("");

                } else {
                    JOptionPane.showMessageDialog(null, "El asiento está reservado", "Error", JOptionPane.ERROR_MESSAGE);
                    JOptionPane.showMessageDialog(null, "Debe registrar otro asiento");
                    this.jTxt_Número_fila.requestFocus();
                    this.jTxt_Número_fila.setText("");
                    this.jTxt_Número_fila.setEditable(true);
                    this.jTxt_Número_Asiento.setText("");
                }
                break;
            case 3:
                if (this.cine.agregar_asientos_Sala_3(this.fila, this.columna, this.cliente) == true) {
                    JOptionPane.showMessageDialog(null, "Asiento reservado con éxito");
                    this.jTxtA_mostrar_asientos.setText(this.cine.toString_sala_3());
                    this.cliente.setAsiento(this.cliente.getAsiento() + "" + this.fila + this.columna + ", ");
                    this.contador++;
                    this.jTxt_Número_fila.setText("");
                    this.jTxt_Número_fila.setEditable(true);
                    this.jTxt_Número_fila.requestFocus();
                    this.jTxt_Número_Asiento.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "El asiento está reservado", "Error", JOptionPane.ERROR_MESSAGE);
                    JOptionPane.showMessageDialog(null, "Debe registrar otro asiento");
                    this.jTxt_Número_fila.requestFocus();
                    this.jTxt_Número_fila.setText("");
                    this.jTxt_Número_fila.setEditable(true);
                    this.jTxt_Número_Asiento.setText("");
                }
                break;
        }
        if (this.contador >= this.cliente.getCant_boletos()) {
            JOptionPane.showMessageDialog(null, "Ya se reservaron los asientos,"
                    + "\nPuede proceder con la compra", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jFrm_D_4_registrar_cliente ventana = new jFrm_D_4_registrar_cliente(this.cine, this.pelicula, this.cliente, this.tipo_tarjeta, sala);
            ventana.setLocationRelativeTo(null);
            ventana.setVisible(true);
        }


    }//GEN-LAST:event_jBtn_Seleccionar_AsientoActionPerformed

    private void jTxt_Número_filaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxt_Número_filaActionPerformed
        this.filaS = this.jTxt_Número_fila.getText();
        try {
            if (this.filaS.matches("^\\D+$")
                    && this.filaS.length() == 1
                    && Character.isUpperCase(this.filaS.charAt(0))
                    && this.filaS.matches("[A-J]")) {
                this.fila = this.filaS.charAt(0);
                this.jTxt_Número_Asiento.setEditable(true);
                this.jTxt_Número_Asiento.requestFocus();
                this.jTxt_Número_fila.setEditable(false);
            } else {

                JOptionPane.showMessageDialog(null, "Digite una letra entre A y H ", "Error", JOptionPane.ERROR_MESSAGE);
                this.jTxt_Número_fila.setText("");
                this.jTxt_Número_fila.requestFocus();
                this.jTxt_Número_fila.setEditable(true);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Digite un valor válido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTxt_Número_filaActionPerformed

    private void jTxt_Número_AsientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxt_Número_AsientoActionPerformed
        this.columnaS = this.jTxt_Número_Asiento.getText();
        try {
            if (this.columnaS.matches("^\\d+$")
                    && this.columnaS.length() == 1
                    && Integer.parseInt(columnaS) > 0
                    && Integer.parseInt(columnaS) <= 8) {
                this.columna = Character.getNumericValue(columnaS.charAt(0));
                this.jTxt_Número_Asiento.setEditable(false);
                this.jBtn_Seleccionar_Asiento.setEnabled(true);
                this.jBtn_Seleccionar_Asiento.doClick();
            } else {
                JOptionPane.showMessageDialog(null, "Digite un asiento entre 1 y 8", "Error", JOptionPane.ERROR_MESSAGE);
                this.jTxt_Número_Asiento.setText("");
                this.jTxt_Número_Asiento.requestFocus();
                this.jTxt_Número_Asiento.setEditable(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Digite un valor válido", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jTxt_Número_AsientoActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_Mostrar_asientos;
    private javax.swing.JButton jBtn_Regresar;
    private javax.swing.JButton jBtn_Seleccionar_Asiento;
    private javax.swing.JLabel jLbl_Número_Asiento;
    private javax.swing.JLabel jLbl_Número_Fila;
    private javax.swing.JLabel jLbl_image;
    private javax.swing.JLabel jLbl_numero_sala;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTxtA_mostrar_asientos;
    private javax.swing.JTextField jTxt_Numero_Sala;
    private javax.swing.JTextField jTxt_Número_Asiento;
    private javax.swing.JTextField jTxt_Número_fila;
    // End of variables declaration//GEN-END:variables
}
