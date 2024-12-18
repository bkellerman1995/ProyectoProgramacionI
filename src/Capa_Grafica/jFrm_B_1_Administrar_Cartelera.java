/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Grafica;

import javax.swing.JOptionPane;

import Capa_Lógica.C_Cine;
import Capa_Lógica.D_Cliente;
import Capa_Lógica.B_Película;
import Capa_Lógica.Tipo_Tarjeta;
public class jFrm_B_1_Administrar_Cartelera extends javax.swing.JFrame {

    C_Cine cine;
    B_Película pelicula;
    D_Cliente cliente;
    Tipo_Tarjeta tipo_tarjeta;

    public jFrm_B_1_Administrar_Cartelera(C_Cine cine, B_Película pelicula, D_Cliente cliente, Tipo_Tarjeta tipo_tarjeta) {
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

        jBtn_Regresar = new javax.swing.JButton();
        jBtn_Iniciar_Sesión = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inicio de sesión");

        jBtn_Regresar.setForeground(new java.awt.Color(153, 0, 0));
        jBtn_Regresar.setText("Regresar");
        jBtn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_RegresarActionPerformed(evt);
            }
        });

        jBtn_Iniciar_Sesión.setForeground(new java.awt.Color(0, 153, 153));
        jBtn_Iniciar_Sesión.setText("Iniciar sesión");
        jBtn_Iniciar_Sesión.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Iniciar_SesiónActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtn_Iniciar_Sesión)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jBtn_Regresar)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jBtn_Iniciar_Sesión)
                .addGap(18, 18, 18)
                .addComponent(jBtn_Regresar)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_RegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBtn_RegresarActionPerformed

    private void jBtn_Iniciar_SesiónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Iniciar_SesiónActionPerformed

        int cont_requisitos = 0;
        int cont_intentos = 0;

        do {
            String pwd = JOptionPane.showInputDialog(null, "Por favor digite la contraseña."
                    + "\n"
                    + "\n Esta debe cumplir las siguientes características:"
                    + "\n 1- Debe ser de 4 dígitos."
                    + "\n 2- El siguiente dígito debe ser el doble al anterior."
                    + "\n 3- Si el doble del dígito es de dos cifras, se mostrará "
                    + "\n solo el dígito de las unidades");

            if (pwd.length() == 4) {
                for (int i = 0; i < pwd.length() - 1; i++) {
                    int valor_1 = Character.getNumericValue(pwd.charAt(i));
                    int valor_2 = Character.getNumericValue(pwd.charAt(i + 1));
                    if (valor_1 * 2 == valor_2 ||(valor_2 + 10)/2 == valor_1 ) {
                        cont_requisitos++;
                    }
                }
                if (cont_requisitos == 3) {
                    JOptionPane.showMessageDialog(null, "¡BIENVENIDO(A)");
                    jFrm_B_1_Menu_Cartelera jfrm_menu_cartelera = new jFrm_B_1_Menu_Cartelera(this.cine, this.pelicula, this.cliente, this.tipo_tarjeta);
                    jfrm_menu_cartelera.setLocationRelativeTo(null);
                    jfrm_menu_cartelera.setVisible(true);
                    this.dispose();
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Contraseña inválida");
                    cont_intentos++;

                }
            } else {
                JOptionPane.showMessageDialog(null, "Contraseña inválida");
                cont_intentos++;
            }

            if (cont_intentos == 3) {
                JOptionPane.showMessageDialog(null, "3 intentos fallidos"
                        + "\n¡SALIENDO DEL MÓDULO!","Error",JOptionPane.ERROR_MESSAGE);
                this.dispose();
            }
        } while (cont_intentos < 3);


    }//GEN-LAST:event_jBtn_Iniciar_SesiónActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_Iniciar_Sesión;
    private javax.swing.JButton jBtn_Regresar;
    // End of variables declaration//GEN-END:variables
}
