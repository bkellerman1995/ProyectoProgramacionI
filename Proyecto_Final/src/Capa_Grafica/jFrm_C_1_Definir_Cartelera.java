/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Grafica;

import javax.swing.ButtonGroup;
import java.util.Date;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import Capa_Lógica.C_Cine;
import Capa_Lógica.D_Cliente;
import Capa_Lógica.B_Película;
import Capa_Lógica.Tipo_Tarjeta;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JTextFieldDateEditor;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.GregorianCalendar;

public class jFrm_C_1_Definir_Cartelera extends javax.swing.JFrame {

    C_Cine cine;
    B_Película pelicula;
    D_Cliente cliente;
    Tipo_Tarjeta tipo_tarjeta;
    Date date;
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
    JTextFieldDateEditor editor;
    int sala;
    public jFrm_C_1_Definir_Cartelera(C_Cine cine, B_Película pelicula, D_Cliente cliente, Tipo_Tarjeta tipo_tarjeta
    ) {
        this.cine = cine;
        this.pelicula = pelicula;
        this.cliente = cliente;
        this.tipo_tarjeta = tipo_tarjeta;
        this.date = new Date();
        this.editor = null;
        sala = 0;
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRdb_Group_buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jBtn_Regresar = new javax.swing.JButton();
        jRdb_sala_1 = new javax.swing.JRadioButton();
        jRdb_sala_2 = new javax.swing.JRadioButton();
        jRdb_sala_3 = new javax.swing.JRadioButton();
        jBtn_Limpiar = new javax.swing.JButton();
        jLbl_Hora = new javax.swing.JLabel();
        jLbl_Nombre_Película = new javax.swing.JLabel();
        jDate_chooser = new com.toedter.calendar.JDateChooser();
        jLbl_num_sala = new javax.swing.JLabel();
        jCbo_Hora = new javax.swing.JComboBox<>();
        jLbl_fecha = new javax.swing.JLabel();
        jTxt_nombre_peli = new javax.swing.JTextField();
        jBtn_crear_pelicula = new javax.swing.JButton();
        jBtn_Quitar_Película = new javax.swing.JButton();
        jLbl_Película_a_eliminar = new javax.swing.JLabel();
        jTxt_Pelicula_a_eliminar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtA_lista_de_películas = new javax.swing.JTextArea();
        jLbl_Image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Definir Cartelera");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setLayout(null);

        jBtn_Regresar.setForeground(new java.awt.Color(255, 0, 0));
        jBtn_Regresar.setText("Regresar");
        jBtn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_RegresarActionPerformed(evt);
            }
        });
        jPanel2.add(jBtn_Regresar);
        jBtn_Regresar.setBounds(600, 410, 130, 32);

        jRdb_sala_1.setText("Sala 1");
        jRdb_sala_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRdb_sala_1ActionPerformed(evt);
            }
        });
        jPanel2.add(jRdb_sala_1);
        jRdb_sala_1.setBounds(170, 80, 67, 28);

        jRdb_sala_2.setText("Sala 2");
        jRdb_sala_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRdb_sala_2ActionPerformed(evt);
            }
        });
        jPanel2.add(jRdb_sala_2);
        jRdb_sala_2.setBounds(170, 130, 67, 28);

        jRdb_sala_3.setText("Sala 3");
        jRdb_sala_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRdb_sala_3ActionPerformed(evt);
            }
        });
        jPanel2.add(jRdb_sala_3);
        jRdb_sala_3.setBounds(170, 180, 67, 28);

        jBtn_Limpiar.setForeground(new java.awt.Color(51, 204, 0));
        jBtn_Limpiar.setText("Limpiar");
        jBtn_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_LimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(jBtn_Limpiar);
        jBtn_Limpiar.setBounds(10, 400, 110, 32);

        jLbl_Hora.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLbl_Hora.setForeground(java.awt.Color.white);
        jLbl_Hora.setText("Hora");
        jPanel2.add(jLbl_Hora);
        jLbl_Hora.setBounds(30, 280, 33, 19);

        jLbl_Nombre_Película.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLbl_Nombre_Película.setForeground(java.awt.Color.white);
        jLbl_Nombre_Película.setText("Nombre de película");
        jPanel2.add(jLbl_Nombre_Película);
        jLbl_Nombre_Película.setBounds(10, 30, 136, 19);
        jPanel2.add(jDate_chooser);
        jDate_chooser.setBounds(170, 230, 123, 29);

        jLbl_num_sala.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLbl_num_sala.setForeground(java.awt.Color.white);
        jLbl_num_sala.setText("Número de sala");
        jPanel2.add(jLbl_num_sala);
        jLbl_num_sala.setBounds(10, 90, 109, 19);

        jCbo_Hora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00:00", "01:00", "02:00", "03:00", "04:00", "05:00", "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00" }));
        jCbo_Hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbo_HoraActionPerformed(evt);
            }
        });
        jPanel2.add(jCbo_Hora);
        jCbo_Hora.setBounds(170, 280, 61, 26);

        jLbl_fecha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLbl_fecha.setForeground(java.awt.Color.white);
        jLbl_fecha.setText("Fecha");
        jPanel2.add(jLbl_fecha);
        jLbl_fecha.setBounds(20, 230, 43, 19);

        jTxt_nombre_peli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxt_nombre_peliActionPerformed(evt);
            }
        });
        jPanel2.add(jTxt_nombre_peli);
        jTxt_nombre_peli.setBounds(170, 30, 140, 24);

        jBtn_crear_pelicula.setForeground(new java.awt.Color(153, 153, 0));
        jBtn_crear_pelicula.setText("Agregar Película");
        jBtn_crear_pelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_crear_peliculaActionPerformed(evt);
            }
        });
        jPanel2.add(jBtn_crear_pelicula);
        jBtn_crear_pelicula.setBounds(10, 340, 180, 32);

        jBtn_Quitar_Película.setForeground(java.awt.Color.red);
        jBtn_Quitar_Película.setText("Quitar Película");
        jBtn_Quitar_Película.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Quitar_PelículaActionPerformed(evt);
            }
        });
        jPanel2.add(jBtn_Quitar_Película);
        jBtn_Quitar_Película.setBounds(580, 30, 150, 32);

        jLbl_Película_a_eliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLbl_Película_a_eliminar.setForeground(new java.awt.Color(255, 255, 0));
        jLbl_Película_a_eliminar.setText("Película a Eliminar");
        jPanel2.add(jLbl_Película_a_eliminar);
        jLbl_Película_a_eliminar.setBounds(340, 200, 160, 19);

        jTxt_Pelicula_a_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxt_Pelicula_a_eliminarActionPerformed(evt);
            }
        });
        jPanel2.add(jTxt_Pelicula_a_eliminar);
        jTxt_Pelicula_a_eliminar.setBounds(510, 200, 100, 24);

        jTxtA_lista_de_películas.setColumns(20);
        jTxtA_lista_de_películas.setRows(5);
        jScrollPane1.setViewportView(jTxtA_lista_de_películas);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(300, 80, 440, 110);

        jLbl_Image.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLbl_Image.setForeground(java.awt.Color.white);
        jLbl_Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Capa_Grafica/Avengers.jpg"))); // NOI18N
        jPanel2.add(jLbl_Image);
        jLbl_Image.setBounds(0, 0, 750, 460);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        if (this.cine.getContador_pelis() == 3) {
            JOptionPane.showMessageDialog(null, "Las salas están llenas"
                    + "\nDebe eliminar una película para poder agregar una nueva película", "Error", JOptionPane.ERROR_MESSAGE);
            this.jBtn_Quitar_Película.setEnabled(true);
            this.jBtn_Quitar_Película.doClick();
            this.jTxtA_lista_de_películas.setEditable(false);
            this.jTxtA_lista_de_películas.setText(this.cine.toString_arreglo());
            this.jTxt_nombre_peli.setEditable(true);
            this.jRdb_Group_buttonGroup1.add(this.jRdb_sala_1);
            this.jRdb_Group_buttonGroup1.add(this.jRdb_sala_2);
            this.jRdb_Group_buttonGroup1.add(this.jRdb_sala_3);
            this.jRdb_sala_1.setEnabled(false);
            this.jRdb_sala_2.setEnabled(false);
            this.jRdb_sala_3.setEnabled(false);
            this.jBtn_crear_pelicula.setEnabled(false);
            this.jDate_chooser.setEnabled(false);
            this.jDate_chooser.setMinSelectableDate(this.date);
            this.editor = (JTextFieldDateEditor) this.jDate_chooser.getDateEditor();
            this.editor.setEditable(false);
            this.jCbo_Hora.setEnabled(false);
            this.jCbo_Hora.setSelectedIndex(-1);
            this.jBtn_Quitar_Película.setEnabled(false);
            this.jBtn_Limpiar.setEnabled(false);
        } else {
            this.jTxtA_lista_de_películas.setEditable(false);
            this.jTxtA_lista_de_películas.setText("LISTA DE PELÍCULAS: "
                    + "\n" + this.cine.toString_arreglo());
            this.jTxt_nombre_peli.setEditable(true);
            this.jRdb_Group_buttonGroup1.add(this.jRdb_sala_1);
            this.jRdb_Group_buttonGroup1.add(this.jRdb_sala_2);
            this.jRdb_Group_buttonGroup1.add(this.jRdb_sala_3);
            this.jRdb_sala_1.setEnabled(false);
            this.jRdb_sala_2.setEnabled(false);
            this.jRdb_sala_3.setEnabled(false);
            this.jBtn_crear_pelicula.setEnabled(false);
            this.jDate_chooser.setEnabled(false);
            this.jDate_chooser.setMinSelectableDate(this.date);
            this.editor = (JTextFieldDateEditor) this.jDate_chooser.getDateEditor();
            this.editor.setEditable(false);
            this.jCbo_Hora.setEnabled(false);
            this.jCbo_Hora.setSelectedIndex(-1);
            this.jBtn_Quitar_Película.setEnabled(false);
            this.jTxt_Pelicula_a_eliminar.setEditable(false);
            this.jBtn_Limpiar.setEnabled(false);
        }
    }//GEN-LAST:event_formWindowOpened

    private void jBtn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_RegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBtn_RegresarActionPerformed

    private void jTxt_nombre_peliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxt_nombre_peliActionPerformed
        if (this.jTxt_nombre_peli.getText().trim().length() > 0) {
            this.jRdb_sala_1.setEnabled(true);
            this.jRdb_sala_2.setEnabled(true);
            this.jRdb_sala_3.setEnabled(true);

            this.jTxt_nombre_peli.setEditable(false);
            this.jBtn_Limpiar.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Debe digitar un nombre", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTxt_nombre_peliActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void jBtn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_LimpiarActionPerformed

        this.jTxt_nombre_peli.setText("");
        this.jTxt_nombre_peli.setEditable(true);
        this.jTxt_nombre_peli.requestFocus();
        this.jDate_chooser.setEnabled(false);
        this.jRdb_sala_1.setSelected(false);
        this.jRdb_sala_2.setSelected(false);
        this.jRdb_sala_3.setSelected(false);
        this.jTxt_Pelicula_a_eliminar.setText("");
        this.jTxt_Pelicula_a_eliminar.setEditable(false);


    }//GEN-LAST:event_jBtn_LimpiarActionPerformed

    private void jBtn_crear_peliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_crear_peliculaActionPerformed
        String nombre = this.jTxt_nombre_peli.getText();

        if (this.jDate_chooser.getDate() != null) {

            if (this.jRdb_sala_1.isSelected()) {
                sala = 1;

            } else {
                if (this.jRdb_sala_2.isSelected()) {
                    sala = 2;

                } else {
                    if (this.jRdb_sala_3.isSelected()) {
                        sala = 3;

                    }
                }
            }

            Date fecha = this.jDate_chooser.getDate();

            String fechaS = sdf.format(fecha);
            String hora = (String) this.jCbo_Hora.getSelectedItem();

            this.pelicula = new B_Película(nombre, sala, fechaS, hora);
            int respuesta = 0;
            if (this.cine.agregar_pelicula_arreglo(this.pelicula) == true) {
                JOptionPane.showMessageDialog(null, "¡Película añadida exitosamente!");
                this.jBtn_Quitar_Película.setEnabled(true);
                this.jTxtA_lista_de_películas.setText("LISTA DE PELÍCULAS: "
                        + "\n" + this.cine.toString_arreglo());
                respuesta = JOptionPane.showConfirmDialog(null, "¿Desea agregar otra película?", "Aviso", JOptionPane.YES_NO_OPTION);
                if (respuesta == 0) {

                    this.jTxt_nombre_peli.setText("");
                    this.jTxt_nombre_peli.setEditable(true);
                    this.jTxt_nombre_peli.requestFocus();

                    this.jRdb_sala_1.setSelected(false);
                    this.jRdb_sala_2.setSelected(false);
                    this.jRdb_sala_3.setSelected(false);
                } else {
                    this.jCbo_Hora.setSelectedIndex(-1);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se puede agregar "
                        + "la película porque "
                        + "ya hay una película añadida en esta sala",
                        "Error", JOptionPane.ERROR_MESSAGE);
                this.jTxt_nombre_peli.setText("");
                this.jTxt_nombre_peli.setEditable(true);
                this.jTxt_nombre_peli.requestFocus();

                this.jRdb_sala_1.setSelected(false);
                this.jRdb_sala_2.setSelected(false);
                this.jRdb_sala_3.setSelected(false);
            }

            if (this.cine.getContador_pelis() == 3) {
                JOptionPane.showMessageDialog(null, "Alcanzó el límite de películas a "
                        + "añadir"
                        + "\n Volviendo al menú anterior",
                        "Aviso",
                        JOptionPane.WARNING_MESSAGE);
                this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor seleccione una fecha para continuar", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jBtn_crear_peliculaActionPerformed

    private void jCbo_HoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbo_HoraActionPerformed
         if (this.jCbo_Hora.getSelectedIndex()!=-1){
             this.jBtn_crear_pelicula.setEnabled(true);
         } else {
             this.jBtn_crear_pelicula.setEnabled(false);
         }
    }//GEN-LAST:event_jCbo_HoraActionPerformed

    private void jBtn_Quitar_PelículaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Quitar_PelículaActionPerformed
        
        JOptionPane.showMessageDialog(null,"Digite un número de película (de 1 a 3)");
        this.jTxt_Pelicula_a_eliminar.setEditable(true);
        this.jTxt_Pelicula_a_eliminar.setText("");
        this.jTxt_Pelicula_a_eliminar.requestFocus();

    }//GEN-LAST:event_jBtn_Quitar_PelículaActionPerformed

    private void jRdb_sala_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRdb_sala_1ActionPerformed
        if (this.jRdb_sala_1.isSelected()) {
            this.jDate_chooser.setEnabled(true);
            this.jCbo_Hora.setEnabled(true);
        }
    }//GEN-LAST:event_jRdb_sala_1ActionPerformed

    private void jRdb_sala_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRdb_sala_2ActionPerformed
        if (this.jRdb_sala_2.isSelected()) {
            this.jDate_chooser.setEnabled(true);
            this.jCbo_Hora.setEnabled(true);
        }
    }//GEN-LAST:event_jRdb_sala_2ActionPerformed

    private void jRdb_sala_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRdb_sala_3ActionPerformed
        if (this.jRdb_sala_2.isSelected()) {
            this.jDate_chooser.setEnabled(true);
            this.jCbo_Hora.setEnabled(true);
        }
    }//GEN-LAST:event_jRdb_sala_3ActionPerformed

    private void jTxt_Pelicula_a_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxt_Pelicula_a_eliminarActionPerformed
        String num_pelicula = this.jTxt_Pelicula_a_eliminar.getText();
        this.jTxt_Pelicula_a_eliminar.setEditable(false);
        if (num_pelicula.matches("^\\d+$")
                && num_pelicula.matches("[1-3]")
                && num_pelicula.length() == 1) {
            if (this.cine.quitar_película(Integer.parseInt(num_pelicula)) == true) {
                JOptionPane.showMessageDialog(null, "Película eliminada");
                this.jTxt_nombre_peli.setEditable(true);
                this.jTxt_nombre_peli.setText("");
                this.jTxt_nombre_peli.requestFocus();
                this.jTxtA_lista_de_películas.setText("LISTA DE PELÍCULAS: "
                        + "\n" + this.cine.toString_arreglo());
            } else {
                JOptionPane.showMessageDialog(null, "No hay películas en el espacio seleccionado", "Error", JOptionPane.ERROR_MESSAGE);
                this.jTxt_Pelicula_a_eliminar.setText("");
                this.jTxt_Pelicula_a_eliminar.setEditable(true);
                this.jTxt_Pelicula_a_eliminar.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Digite un valor válido (número entre 1 y 3", "Error", JOptionPane.ERROR_MESSAGE);
            this.jTxt_Pelicula_a_eliminar.setText("");
            this.jTxt_Pelicula_a_eliminar.setEditable(true);
            this.jTxt_Pelicula_a_eliminar.requestFocus();
        }
    }//GEN-LAST:event_jTxt_Pelicula_a_eliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_Limpiar;
    private javax.swing.JButton jBtn_Quitar_Película;
    private javax.swing.JButton jBtn_Regresar;
    private javax.swing.JButton jBtn_crear_pelicula;
    private javax.swing.JComboBox<String> jCbo_Hora;
    private com.toedter.calendar.JDateChooser jDate_chooser;
    private javax.swing.JLabel jLbl_Hora;
    private javax.swing.JLabel jLbl_Image;
    private javax.swing.JLabel jLbl_Nombre_Película;
    private javax.swing.JLabel jLbl_Película_a_eliminar;
    private javax.swing.JLabel jLbl_fecha;
    private javax.swing.JLabel jLbl_num_sala;
    private javax.swing.JPanel jPanel2;
    private javax.swing.ButtonGroup jRdb_Group_buttonGroup1;
    private javax.swing.JRadioButton jRdb_sala_1;
    private javax.swing.JRadioButton jRdb_sala_2;
    private javax.swing.JRadioButton jRdb_sala_3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTxtA_lista_de_películas;
    private javax.swing.JTextField jTxt_Pelicula_a_eliminar;
    private javax.swing.JTextField jTxt_nombre_peli;
    // End of variables declaration//GEN-END:variables

    private SimpleDateFormat SimpleDateFormat(String ddMMyyyy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
