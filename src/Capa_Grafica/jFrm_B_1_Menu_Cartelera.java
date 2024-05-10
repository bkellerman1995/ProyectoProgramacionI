/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Grafica;

import javax.swing.JOptionPane;
import Capa_Lógica.B_Película;
import Capa_Lógica.C_Cine;
import Capa_Lógica.D_Cliente;
import Capa_Lógica.Tipo_Tarjeta;

public class jFrm_B_1_Menu_Cartelera extends javax.swing.JFrame {
    
C_Cine cine;
B_Película pelicula;
D_Cliente cliente;
Tipo_Tarjeta tipo_tarjeta;
 
    public jFrm_B_1_Menu_Cartelera(C_Cine cine, B_Película pelicula, D_Cliente cliente, Tipo_Tarjeta tipo_tarjeta
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

        jPanel1 = new javax.swing.JPanel();
        jBtn_Regresar = new javax.swing.JButton();
        jBtn_Reporte_cantidad_asientos = new javax.swing.JButton();
        jBtn_Reporte_ingresos_sala = new javax.swing.JButton();
        jBtn_Mostrar_estado_salas = new javax.swing.JButton();
        jBtn_Definir_Cartelera4 = new javax.swing.JButton();
        jLbl_Image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Opciones de administración de cartelera");

        jPanel1.setLayout(null);

        jBtn_Regresar.setForeground(new java.awt.Color(255, 0, 51));
        jBtn_Regresar.setText("Regresar al menú anterior");
        jBtn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_RegresarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn_Regresar);
        jBtn_Regresar.setBounds(10, 240, 210, 32);

        jBtn_Reporte_cantidad_asientos.setForeground(new java.awt.Color(51, 51, 255));
        jBtn_Reporte_cantidad_asientos.setText("4- Reporte de la cantidad de asientos reservados en cada sala");
        jBtn_Reporte_cantidad_asientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Reporte_cantidad_asientosActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn_Reporte_cantidad_asientos);
        jBtn_Reporte_cantidad_asientos.setBounds(10, 180, 420, 32);

        jBtn_Reporte_ingresos_sala.setForeground(new java.awt.Color(51, 51, 255));
        jBtn_Reporte_ingresos_sala.setText("3- Reporte de ingresos por sala");
        jBtn_Reporte_ingresos_sala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Reporte_ingresos_salaActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn_Reporte_ingresos_sala);
        jBtn_Reporte_ingresos_sala.setBounds(10, 130, 220, 32);

        jBtn_Mostrar_estado_salas.setForeground(new java.awt.Color(51, 51, 255));
        jBtn_Mostrar_estado_salas.setText("2- Mostrar estado de las salas");
        jBtn_Mostrar_estado_salas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Mostrar_estado_salasActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn_Mostrar_estado_salas);
        jBtn_Mostrar_estado_salas.setBounds(10, 80, 220, 32);

        jBtn_Definir_Cartelera4.setForeground(new java.awt.Color(51, 51, 255));
        jBtn_Definir_Cartelera4.setText("1- Definir cartelera");
        jBtn_Definir_Cartelera4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Definir_Cartelera4ActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn_Definir_Cartelera4);
        jBtn_Definir_Cartelera4.setBounds(10, 30, 220, 32);

        jLbl_Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Capa_Grafica/star_wars.jpg"))); // NOI18N
        jPanel1.add(jLbl_Image);
        jLbl_Image.setBounds(-10, 0, 500, 320);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_RegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBtn_RegresarActionPerformed

    private void jBtn_Definir_Cartelera4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Definir_Cartelera4ActionPerformed
        jFrm_C_1_Definir_Cartelera ventana = new jFrm_C_1_Definir_Cartelera(this.cine, this.pelicula, this.cliente, this.tipo_tarjeta);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);

    }//GEN-LAST:event_jBtn_Definir_Cartelera4ActionPerformed

    private void jBtn_Mostrar_estado_salasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Mostrar_estado_salasActionPerformed
        jFrm_C_2_Mostrar_estado_de_las_salas ventana = new jFrm_C_2_Mostrar_estado_de_las_salas(this.cine, this.pelicula, this.cliente, this.tipo_tarjeta);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }//GEN-LAST:event_jBtn_Mostrar_estado_salasActionPerformed

    private void jBtn_Reporte_ingresos_salaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Reporte_ingresos_salaActionPerformed
        jFrm_C_3_Reporte_de_ingresos_por_sala ventana = new jFrm_C_3_Reporte_de_ingresos_por_sala(this.cine, this.pelicula, this.cliente, this.tipo_tarjeta);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }//GEN-LAST:event_jBtn_Reporte_ingresos_salaActionPerformed

    private void jBtn_Reporte_cantidad_asientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Reporte_cantidad_asientosActionPerformed
        jFrm_C_4_Reporte_cantidad_de_asientos_reservados_en_cada_sala ventana = new  jFrm_C_4_Reporte_cantidad_de_asientos_reservados_en_cada_sala(this.cine, this.pelicula, this.cliente, this.tipo_tarjeta);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }//GEN-LAST:event_jBtn_Reporte_cantidad_asientosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_Definir_Cartelera4;
    private javax.swing.JButton jBtn_Mostrar_estado_salas;
    private javax.swing.JButton jBtn_Regresar;
    private javax.swing.JButton jBtn_Reporte_cantidad_asientos;
    private javax.swing.JButton jBtn_Reporte_ingresos_sala;
    private javax.swing.JLabel jLbl_Image;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
