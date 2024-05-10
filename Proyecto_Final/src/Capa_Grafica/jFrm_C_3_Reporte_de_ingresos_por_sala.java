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
public class jFrm_C_3_Reporte_de_ingresos_por_sala extends javax.swing.JFrame {

C_Cine cine;
B_Película pelicula;
D_Cliente cliente;
Tipo_Tarjeta tipo_tarjeta;

    
    public jFrm_C_3_Reporte_de_ingresos_por_sala(C_Cine cine, B_Película pelicula, D_Cliente cliente,Tipo_Tarjeta tipo_tarjeta
) {
this.cine = cine;
this.pelicula = pelicula;
this.cliente = cliente;
this.tipo_tarjeta = tipo_tarjeta;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRdbGrp_Salas = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jBtn_Regresar = new javax.swing.JButton();
        jLbl_numero_sala = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtA_Impresion = new javax.swing.JTextArea();
        jRdb_sala_1 = new javax.swing.JRadioButton();
        jRdb_sala_3 = new javax.swing.JRadioButton();
        jRdb_sala_2 = new javax.swing.JRadioButton();
        jBtn_Mostrar_Ingreso = new javax.swing.JButton();
        jLbl_image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingresos por sala");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(null);

        jBtn_Regresar.setForeground(new java.awt.Color(255, 51, 0));
        jBtn_Regresar.setText("Regresar");
        jBtn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_RegresarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn_Regresar);
        jBtn_Regresar.setBounds(263, 10, 130, 32);

        jLbl_numero_sala.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLbl_numero_sala.setForeground(java.awt.Color.black);
        jLbl_numero_sala.setText("Número de sala");
        jPanel1.add(jLbl_numero_sala);
        jLbl_numero_sala.setBounds(10, 20, 130, 19);

        jTxtA_Impresion.setColumns(20);
        jTxtA_Impresion.setRows(5);
        jScrollPane1.setViewportView(jTxtA_Impresion);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 210, 223, 83);

        jRdb_sala_1.setText("Sala 1");
        jPanel1.add(jRdb_sala_1);
        jRdb_sala_1.setBounds(150, 20, 67, 28);

        jRdb_sala_3.setText("Sala 3");
        jPanel1.add(jRdb_sala_3);
        jRdb_sala_3.setBounds(150, 100, 67, 28);

        jRdb_sala_2.setText("Sala 2");
        jPanel1.add(jRdb_sala_2);
        jRdb_sala_2.setBounds(150, 60, 67, 28);

        jBtn_Mostrar_Ingreso.setForeground(new java.awt.Color(0, 204, 0));
        jBtn_Mostrar_Ingreso.setText("Mostrar ingreso");
        jBtn_Mostrar_Ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Mostrar_IngresoActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn_Mostrar_Ingreso);
        jBtn_Mostrar_Ingreso.setBounds(10, 160, 190, 32);

        jLbl_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Capa_Grafica/spiderman.jpg"))); // NOI18N
        jPanel1.add(jLbl_image);
        jLbl_image.setBounds(0, 0, 400, 320);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.jRdbGrp_Salas.add(jRdb_sala_1);
        this.jRdbGrp_Salas.add(jRdb_sala_2);
        this.jRdbGrp_Salas.add(jRdb_sala_3);
        this.jRdb_sala_1.setSelected(false);
        this.jRdb_sala_2.setSelected(false);
        this.jRdb_sala_3.setSelected(false);
    }//GEN-LAST:event_formWindowOpened

    private void jBtn_Mostrar_IngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Mostrar_IngresoActionPerformed

        if (this.jRdbGrp_Salas.getSelection() != null) {
            if (this.jRdb_sala_1.isSelected()) {
                this.jTxtA_Impresion.setText("El ingreso total de sala 1 es: "
                        + this.cine.ingresos_Sala_1());
            }
            if (this.jRdb_sala_2.isSelected()) {
                this.jTxtA_Impresion.setText("El ingreso total de sala 2 es: "
                        + this.cine.ingresos_Sala_2());
            }
            if (this.jRdb_sala_3.isSelected()) {
                this.jTxtA_Impresion.setText("El ingreso total de sala 3 es: "
                        + this.cine.ingresos_Sala_3());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una sala", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jBtn_Mostrar_IngresoActionPerformed

    private void jBtn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_RegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBtn_RegresarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_Mostrar_Ingreso;
    private javax.swing.JButton jBtn_Regresar;
    private javax.swing.JLabel jLbl_image;
    private javax.swing.JLabel jLbl_numero_sala;
    private javax.swing.JPanel jPanel1;
    private javax.swing.ButtonGroup jRdbGrp_Salas;
    private javax.swing.JRadioButton jRdb_sala_1;
    private javax.swing.JRadioButton jRdb_sala_2;
    private javax.swing.JRadioButton jRdb_sala_3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTxtA_Impresion;
    // End of variables declaration//GEN-END:variables
}
