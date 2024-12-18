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

public class jFrm_D_1_submenu_reservacion_y_compra extends javax.swing.JFrame {

    C_Cine cine;
    B_Película pelicula;
    D_Cliente cliente;
    Tipo_Tarjeta tipo_tarjeta;

    public jFrm_D_1_submenu_reservacion_y_compra(C_Cine cine, B_Película pelicula, D_Cliente cliente, Tipo_Tarjeta tipo_tarjeta
    ) {
        this.cine = cine;
        this.pelicula = pelicula;
        this.cliente = cliente;
        this.tipo_tarjeta = tipo_tarjeta;

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

        jBtn_Consultar_Cartelera = new javax.swing.JButton();
        jBtn_Salir = new javax.swing.JButton();
        jBtn_Reservar_comprar = new javax.swing.JButton();
        jBtn_Regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reservaciones y Compra");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jBtn_Consultar_Cartelera.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBtn_Consultar_Cartelera.setForeground(new java.awt.Color(102, 0, 204));
        jBtn_Consultar_Cartelera.setText("1 - Consultar Cartelera");
        jBtn_Consultar_Cartelera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Consultar_CarteleraActionPerformed(evt);
            }
        });

        jBtn_Salir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBtn_Salir.setForeground(new java.awt.Color(102, 0, 204));
        jBtn_Salir.setText("3 - Salir del sistema");
        jBtn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_SalirActionPerformed(evt);
            }
        });

        jBtn_Reservar_comprar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBtn_Reservar_comprar.setForeground(new java.awt.Color(102, 0, 204));
        jBtn_Reservar_comprar.setText("2 - Reservar y comprar");
        jBtn_Reservar_comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Reservar_comprarActionPerformed(evt);
            }
        });

        jBtn_Regresar.setForeground(new java.awt.Color(255, 51, 0));
        jBtn_Regresar.setText("Regresar");
        jBtn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_RegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtn_Consultar_Cartelera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtn_Reservar_comprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtn_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtn_Regresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jBtn_Consultar_Cartelera)
                .addGap(18, 18, 18)
                .addComponent(jBtn_Reservar_comprar)
                .addGap(18, 18, 18)
                .addComponent(jBtn_Salir)
                .addGap(18, 18, 18)
                .addComponent(jBtn_Regresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_RegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBtn_RegresarActionPerformed

    private void jBtn_Reservar_comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Reservar_comprarActionPerformed
        jFrm_D_2_Reservar_y_Comprar ventana = new jFrm_D_2_Reservar_y_Comprar(this.cine, this.pelicula, this.cliente, this.tipo_tarjeta);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }//GEN-LAST:event_jBtn_Reservar_comprarActionPerformed

    private void jBtn_Consultar_CarteleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Consultar_CarteleraActionPerformed
        this.cine.get_pelicula();
        JOptionPane.showMessageDialog(null, "==========="
                + "\nLista de películas: "
                + "\n==========="
                + "\n" + this.cine.toString_arreglo());
    }//GEN-LAST:event_jBtn_Consultar_CarteleraActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.jBtn_Reservar_comprar.setEnabled(false);
        if (this.cine.getContador_pelis() ==3) {
            this.jBtn_Reservar_comprar.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "No se pueden hacer reservaciones hasta que las salas"
                    + "estén llenas", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_formWindowOpened

    private void jBtn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBtn_SalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_Consultar_Cartelera;
    private javax.swing.JButton jBtn_Regresar;
    private javax.swing.JButton jBtn_Reservar_comprar;
    private javax.swing.JButton jBtn_Salir;
    // End of variables declaration//GEN-END:variables
}
