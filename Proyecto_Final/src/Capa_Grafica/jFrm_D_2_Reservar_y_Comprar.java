package Capa_Grafica;

import Capa_Lógica.C_Cine;
import Capa_Lógica.D_Cliente;
import Capa_Lógica.B_Película;
import Capa_Lógica.Tipo_Tarjeta;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class jFrm_D_2_Reservar_y_Comprar extends javax.swing.JFrame {

    C_Cine cine;
    B_Película pelicula;
    int sala;
    D_Cliente cliente;
    Tipo_Tarjeta tipo_tarjeta;
    Date date_fecha;
    String fecha_actual;
    String hora_actual;
    String cant_boletos;
    String tipo_cliente;
    int contador;
    int contador_adultos;

    public jFrm_D_2_Reservar_y_Comprar(C_Cine cine, B_Película pelicula, D_Cliente cliente, Tipo_Tarjeta tipo_tarjeta
    ) {
        this.cine = cine;
        this.pelicula = pelicula;
        this.sala = 0;
        this.cliente = cliente;
        this.tipo_tarjeta = tipo_tarjeta;
        this.date_fecha = new Date();
        SimpleDateFormat sdf_fecha = new SimpleDateFormat("dd-MM-YYYY");
        this.fecha_actual = sdf_fecha.format(this.date_fecha);
        SimpleDateFormat sdf_hora = new SimpleDateFormat("hh");
        this.hora_actual = sdf_hora.format(this.date_fecha);
        this.cant_boletos = "";
        this.tipo_cliente = "";

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jCbo_lista_peliculas = new javax.swing.JComboBox<>();
        jLbl_Cant_boletos = new javax.swing.JLabel();
        jTxt_Cant_boletos = new javax.swing.JTextField();
        jLbl_Tipo_Cliente = new javax.swing.JLabel();
        jCbo_tipo_cliente = new javax.swing.JComboBox<>();
        jBtn_Limpiar = new javax.swing.JButton();
        jBtn_Regresar = new javax.swing.JButton();
        jBtn_Comprar = new javax.swing.JButton();
        jBtn_Confirmar_película = new javax.swing.JButton();
        jLBL_Lista_Películas = new javax.swing.JLabel();
        jBtn_Agregar_cliente = new javax.swing.JButton();
        jLbl_Image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reservar y comprar");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(null);

        jCbo_lista_peliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbo_lista_peliculasActionPerformed(evt);
            }
        });
        jPanel1.add(jCbo_lista_peliculas);
        jCbo_lista_peliculas.setBounds(140, 40, 460, 26);

        jLbl_Cant_boletos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLbl_Cant_boletos.setForeground(java.awt.Color.white);
        jLbl_Cant_boletos.setText("Cantidad de boletos");
        jPanel1.add(jLbl_Cant_boletos);
        jLbl_Cant_boletos.setBounds(10, 210, 141, 19);

        jTxt_Cant_boletos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxt_Cant_boletosActionPerformed(evt);
            }
        });
        jPanel1.add(jTxt_Cant_boletos);
        jTxt_Cant_boletos.setBounds(190, 210, 140, 24);

        jLbl_Tipo_Cliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLbl_Tipo_Cliente.setForeground(java.awt.Color.white);
        jLbl_Tipo_Cliente.setText("Tipo de cliente");
        jPanel1.add(jLbl_Tipo_Cliente);
        jLbl_Tipo_Cliente.setBounds(10, 160, 104, 19);

        jCbo_tipo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbo_tipo_clienteActionPerformed(evt);
            }
        });
        jPanel1.add(jCbo_tipo_cliente);
        jCbo_tipo_cliente.setBounds(160, 160, 300, 26);

        jBtn_Limpiar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBtn_Limpiar.setForeground(java.awt.Color.orange);
        jBtn_Limpiar.setText("Limpiar");
        jBtn_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_LimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn_Limpiar);
        jBtn_Limpiar.setBounds(20, 320, 190, 40);

        jBtn_Regresar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBtn_Regresar.setForeground(java.awt.Color.red);
        jBtn_Regresar.setText("Regresar");
        jBtn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_RegresarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn_Regresar);
        jBtn_Regresar.setBounds(290, 320, 210, 40);

        jBtn_Comprar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBtn_Comprar.setForeground(java.awt.Color.green);
        jBtn_Comprar.setText("Comprar");
        jBtn_Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_ComprarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn_Comprar);
        jBtn_Comprar.setBounds(10, 260, 200, 40);

        jBtn_Confirmar_película.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBtn_Confirmar_película.setForeground(java.awt.Color.green);
        jBtn_Confirmar_película.setText("Confirmar película");
        jBtn_Confirmar_película.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Confirmar_películaActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn_Confirmar_película);
        jBtn_Confirmar_película.setBounds(10, 90, 250, 40);

        jLBL_Lista_Películas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLBL_Lista_Películas.setForeground(java.awt.Color.white);
        jLBL_Lista_Películas.setText("Lista de películas");
        jPanel1.add(jLBL_Lista_Películas);
        jLBL_Lista_Películas.setBounds(10, 40, 122, 19);

        jBtn_Agregar_cliente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBtn_Agregar_cliente.setForeground(java.awt.Color.green);
        jBtn_Agregar_cliente.setText("Agregar");
        jBtn_Agregar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Agregar_clienteActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn_Agregar_cliente);
        jBtn_Agregar_cliente.setBounds(480, 160, 120, 40);

        jLbl_Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Capa_Grafica/El_caballero_oscuro-102763119-large.jpg"))); // NOI18N
        jPanel1.add(jLbl_Image);
        jLbl_Image.setBounds(0, 0, 660, 380);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        for (int i = 0; i < this.cine.get_pelicula().length; i++) {
            this.jCbo_lista_peliculas.addItem(this.cine.get_pelicula()[i].toString_Pelicula());
        }
        this.jCbo_lista_peliculas.setEnabled(true);
        this.jCbo_lista_peliculas.setSelectedIndex(-1);
        this.jCbo_tipo_cliente.addItem("Cliente regular = ₡2800");
        this.jCbo_tipo_cliente.addItem("Adulto Mayor = ₡2300");
        this.jCbo_tipo_cliente.addItem("Niño = ₡2000");
        this.jCbo_tipo_cliente.setSelectedIndex(-1);
        this.jCbo_tipo_cliente.setEnabled(false);
        this.jTxt_Cant_boletos.setEditable(false);
        this.jBtn_Comprar.setEnabled(false);
        this.jBtn_Limpiar.setEnabled(false);
        this.jBtn_Confirmar_película.setEnabled(false);
        this.jBtn_Agregar_cliente.setEnabled(false);

    }//GEN-LAST:event_formWindowOpened

    private void jBtn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_RegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBtn_RegresarActionPerformed

    private void jCbo_tipo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbo_tipo_clienteActionPerformed
        if (this.jCbo_tipo_cliente.getSelectedIndex() != -1) {
            this.jCbo_tipo_cliente.setEnabled(false);
            this.jTxt_Cant_boletos.setEditable(true);
            this.jTxt_Cant_boletos.requestFocus();
        }
        if (this.jCbo_tipo_cliente.getSelectedIndex() == 2) {
            JOptionPane.showMessageDialog(null, "Niños deben de ir acompañados al menos de un adulto", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jCbo_tipo_clienteActionPerformed

    private void jCbo_lista_peliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbo_lista_peliculasActionPerformed
        if (this.jCbo_lista_peliculas.getSelectedIndex() != -1) {
            this.jBtn_Confirmar_película.setEnabled(true);
            this.jCbo_lista_peliculas.setEnabled(false);
        } else {
            this.jBtn_Confirmar_película.setEnabled(false);
        }
    }//GEN-LAST:event_jCbo_lista_peliculasActionPerformed

    private void jTxt_Cant_boletosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxt_Cant_boletosActionPerformed
        this.cant_boletos = this.jTxt_Cant_boletos.getText();
        if (this.cant_boletos.trim().length() > 0
                && this.cant_boletos.matches("^\\d+$")
                && this.cant_boletos.length() == 1
                && !this.cant_boletos.matches("0")) {
            if ((Integer.parseInt(this.cant_boletos) == 4
                    && this.jCbo_tipo_cliente.getSelectedIndex() == 2)) {
                JOptionPane.showMessageDialog(null, "Los niños no pueden ir solos al cine"
                        + "\nDebe seleccionar al menos un cliente regular o adulto mayor para agregar la compra", "Error", JOptionPane.ERROR_MESSAGE);
                this.jCbo_tipo_cliente.setEnabled(true);
                this.jCbo_tipo_cliente.setSelectedIndex(-1);
                this.jTxt_Cant_boletos.setText("");
                this.jTxt_Cant_boletos.setEditable(false);
                this.jBtn_Confirmar_película.doClick();
            } else {
                this.jCbo_tipo_cliente.setEnabled(false);
                this.jTxt_Cant_boletos.setEditable(false);
                this.contador = this.contador + Integer.parseInt(this.jTxt_Cant_boletos.getText());
                this.jBtn_Agregar_cliente.setEnabled(true);
                this.jBtn_Agregar_cliente.doClick();

            }

        } else {
            JOptionPane.showMessageDialog(null, "Digite un valor válido (1 a 4)", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTxt_Cant_boletosActionPerformed

    private void jBtn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_LimpiarActionPerformed
        this.jCbo_lista_peliculas.setEnabled(true);
        this.jCbo_lista_peliculas.setSelectedIndex(-1);
        this.jTxt_Cant_boletos.setEditable(false);
        this.jTxt_Cant_boletos.setText("");
        this.jCbo_tipo_cliente.setSelectedIndex(-1);
        this.jCbo_tipo_cliente.setEnabled(false);
        this.jCbo_tipo_cliente.setSelectedIndex(-1);
        this.jBtn_Agregar_cliente.setEnabled(false);


    }//GEN-LAST:event_jBtn_LimpiarActionPerformed

    private void jBtn_ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_ComprarActionPerformed
        String opcion = (String) this.jCbo_lista_peliculas.getSelectedItem();
        this.sala = Character.getNumericValue(opcion.charAt(opcion.length() - 1));
        if (this.contador_adultos >= 1) {
            switch (this.sala) {
                case 1:
                    if (this.cliente.getCant_boletos() + this.cine.getCant_asientos_sala_1()
                            <= (this.cine.getCANT_FILAS() * this.cine.getCANT_COLUMNAS())) {

                        JOptionPane.showMessageDialog(null, "El monto total a pagar es: ₡" + this.cliente.getTotal_pagado());
                        this.cliente.setSala(this.sala);
                        this.cliente.setPeli(this.cine.get_pelicula()[0].getNombre_pelicula());
                        this.cliente.setFecha(this.cine.get_pelicula()[0].getFecha());
                        this.cliente.setHora(this.cine.get_pelicula()[0].getHora());
                        jFrm_D_3_Reservar_asientos ventana = new jFrm_D_3_Reservar_asientos(this.cine, this.pelicula, this.cliente, this.tipo_tarjeta, sala);
                        ventana.setLocationRelativeTo(null);
                        ventana.setVisible(true);
                        this.dispose();

                    } else {
                        JOptionPane.showMessageDialog(null, "No hay asientos disponibles para reservar");
                        this.jTxt_Cant_boletos.setEditable(true);
                        this.jTxt_Cant_boletos.requestFocus();
                    }
                    break;
                case 2:
                    if (this.cliente.getCant_boletos() + this.cine.getCant_asientos_sala_2()
                            <= (this.cine.getCANT_FILAS() * this.cine.getCANT_COLUMNAS())) {

                        JOptionPane.showMessageDialog(null, "El monto total a pagar es: ₡" + this.cliente.getTotal_pagado());
                        this.cliente.setSala(this.sala);
                        this.cliente.setPeli(this.cine.get_pelicula()[1].getNombre_pelicula());
                        this.cliente.setFecha(this.cine.get_pelicula()[1].getFecha());
                        this.cliente.setHora(this.cine.get_pelicula()[1].getHora());
                        jFrm_D_3_Reservar_asientos ventana = new jFrm_D_3_Reservar_asientos(this.cine, this.pelicula, this.cliente, this.tipo_tarjeta, sala);
                        ventana.setLocationRelativeTo(null);
                        ventana.setVisible(true);
                        this.dispose();

                    } else {
                        JOptionPane.showMessageDialog(null, "No hay asientos disponibles para reservar");
                        this.jTxt_Cant_boletos.setEditable(true);
                        this.jTxt_Cant_boletos.requestFocus();
                    }
                    break;
                case 3:
                    if (this.cliente.getCant_boletos() + this.cine.getCant_asientos_sala_3()
                            <= (this.cine.getCANT_FILAS() * this.cine.getCANT_COLUMNAS())) {

                        JOptionPane.showMessageDialog(null, "El monto total a pagar es: ₡" + this.cliente.getTotal_pagado());
                        this.cliente.setSala(this.sala);
                        this.cliente.setPeli(this.cine.get_pelicula()[2].getNombre_pelicula());
                        this.cliente.setFecha(this.cine.get_pelicula()[2].getFecha());
                        this.cliente.setHora(this.cine.get_pelicula()[2].getHora());
                        jFrm_D_3_Reservar_asientos ventana = new jFrm_D_3_Reservar_asientos(this.cine, this.pelicula, this.cliente, this.tipo_tarjeta, sala);
                        ventana.setLocationRelativeTo(null);
                        ventana.setVisible(true);
                        this.dispose();

                    } else {
                        JOptionPane.showMessageDialog(null, "No hay asientos disponibles para reservar");
                        this.jTxt_Cant_boletos.setEditable(true);
                        this.jTxt_Cant_boletos.requestFocus();
                    }
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Los niños no pueden ir solos al cine", "Error", JOptionPane.ERROR_MESSAGE);
            this.jBtn_Confirmar_película.doClick();
        }


    }//GEN-LAST:event_jBtn_ComprarActionPerformed

    private void jBtn_Confirmar_películaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Confirmar_películaActionPerformed
        this.cliente = new D_Cliente();
        this.contador = 0;
        this.contador_adultos = 0;
        int hora = Integer.parseInt(this.hora_actual);
        if (this.jCbo_lista_peliculas.getSelectedIndex() != -1) {
            this.jTxt_Cant_boletos.setEditable(false);
            this.jCbo_tipo_cliente.setEnabled(true);
            switch (this.jCbo_lista_peliculas.getSelectedIndex()) {
                case 0:
                    if (this.cine.get_pelicula()[0].getFecha().equalsIgnoreCase(this.fecha_actual)) {
                        if (Integer.parseInt(this.cine.get_pelicula()[0].getHora().substring(0, 1)) - 6 >= hora) {
                            this.jCbo_lista_peliculas.setEnabled(false);
                            this.jCbo_tipo_cliente.setEnabled(true);
                            this.jBtn_Limpiar.setEnabled(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "Solo se puede reservar películas con 6 horas de anticipación");
                            this.jCbo_lista_peliculas.setEnabled(true);
                            this.jCbo_lista_peliculas.setSelectedIndex(-1);

                        }
                    } else {
                        this.jCbo_lista_peliculas.setEnabled(false);
                        this.jCbo_tipo_cliente.setEnabled(true);
                        this.jBtn_Limpiar.setEnabled(true);
                    }
                    break;
                case 1:
                    if (this.cine.get_pelicula()[1].getFecha().equalsIgnoreCase(this.fecha_actual)) {
                        if (Integer.parseInt(this.cine.get_pelicula()[1].getHora().substring(0, 1)) - 6 >= hora) {
                            this.jCbo_lista_peliculas.setEnabled(false);
                            this.jCbo_tipo_cliente.setEnabled(true);
                            this.jBtn_Limpiar.setEnabled(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "Solo se puede reservar películas con 6 horas de anticipación");
                            this.jCbo_lista_peliculas.setEnabled(true);
                            this.jCbo_lista_peliculas.setSelectedIndex(-1);

                        }
                    } else {
                        this.jCbo_lista_peliculas.setEnabled(false);
                        this.jCbo_tipo_cliente.setEnabled(true);
                        this.jBtn_Limpiar.setEnabled(true);
                    }
                    break;
                case 2:
                    if (this.cine.get_pelicula()[2].getFecha().equalsIgnoreCase(this.fecha_actual)) {
                        if (Integer.parseInt(this.cine.get_pelicula()[2].getHora().substring(0, 1)) - 6 >= hora) {
                            this.jCbo_lista_peliculas.setEnabled(false);
                            this.jCbo_tipo_cliente.setEnabled(true);
                            this.jBtn_Limpiar.setEnabled(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "Solo se puede reservar películas con 6 horas de anticipación");
                            this.jCbo_lista_peliculas.setEnabled(true);
                            this.jCbo_lista_peliculas.setSelectedIndex(-1);
                        }
                    } else {
                        this.jCbo_lista_peliculas.setEnabled(false);
                        this.jCbo_tipo_cliente.setEnabled(true);
                        this.jBtn_Limpiar.setEnabled(true);
                    }
                    break;
            }

        }
    }//GEN-LAST:event_jBtn_Confirmar_películaActionPerformed

    private void jBtn_Agregar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Agregar_clienteActionPerformed
        if (this.contador <= 4) {
            switch (this.jCbo_tipo_cliente.getSelectedIndex()) {
                case 0:
                    this.cliente.setTipo_cliente(this.cliente.getTipo_cliente() + this.jTxt_Cant_boletos.getText() + ": Adulto Regular, ");
                    this.cliente.setTotal_pagado(this.cliente.getTotal_pagado() + (2800 * (Integer.parseInt(this.jTxt_Cant_boletos.getText()))));
                    this.cliente.setCant_boletos(this.cliente.getCant_boletos() + (Integer.parseInt(this.jTxt_Cant_boletos.getText())));
                    this.contador_adultos++;
                    break;
                case 1:
                    this.cliente.setTipo_cliente(this.cliente.getTipo_cliente() + this.jTxt_Cant_boletos.getText() + ": Adulto Mayor, ");
                    this.cliente.setTotal_pagado(this.cliente.getTotal_pagado() + (2300 * (Integer.parseInt(this.jTxt_Cant_boletos.getText()))));
                    this.cliente.setCant_boletos(this.cliente.getCant_boletos() + (Integer.parseInt(this.jTxt_Cant_boletos.getText())));
                    this.contador_adultos++;
                    break;

                case 2:
                    this.cliente.setTipo_cliente(this.cliente.getTipo_cliente() + this.jTxt_Cant_boletos.getText() + ": Niño, ");
                    this.cliente.setTotal_pagado(this.cliente.getTotal_pagado() + (2000 * (Integer.parseInt(this.jTxt_Cant_boletos.getText()))));
                    this.cliente.setCant_boletos(this.cliente.getCant_boletos() + (Integer.parseInt(this.jTxt_Cant_boletos.getText())));
                    break;
            }
            int opc = JOptionPane.showConfirmDialog(null, "¿Desea agregar más asientos?"
                    + "\nCantidad de asientos reservados: " + this.cliente.getCant_boletos()
                    + "\nMáximo: 4", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (opc == 0 && this.contador < 4) {
                this.jCbo_tipo_cliente.setEnabled(true);
                this.jTxt_Cant_boletos.setText("");
                this.jBtn_Agregar_cliente.setEnabled(false);
                this.jCbo_tipo_cliente.setEnabled(true);
                this.jCbo_tipo_cliente.setSelectedIndex(-1);

            } else {
                int opcion = JOptionPane.showConfirmDialog(null,
                        "\n¿Desea proceder con la compra o quiere modificarla?"
                        + "\nSí: procede con la compra"
                        + "\nNo: se registra una nueva compra", "Confirmación", JOptionPane.YES_NO_OPTION);
                if (opcion == 0) {
                    this.jBtn_Comprar.setEnabled(true);
                    this.jBtn_Comprar.doClick();
                } else {
                    this.jBtn_Limpiar.doClick();
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "No puede agregar más de 4 asientos", "Error", JOptionPane.ERROR_MESSAGE);
            this.jBtn_Confirmar_película.doClick();
        }
    }//GEN-LAST:event_jBtn_Agregar_clienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_Agregar_cliente;
    private javax.swing.JButton jBtn_Comprar;
    private javax.swing.JButton jBtn_Confirmar_película;
    private javax.swing.JButton jBtn_Limpiar;
    private javax.swing.JButton jBtn_Regresar;
    private javax.swing.JComboBox<String> jCbo_lista_peliculas;
    private javax.swing.JComboBox<String> jCbo_tipo_cliente;
    private javax.swing.JLabel jLBL_Lista_Películas;
    private javax.swing.JLabel jLbl_Cant_boletos;
    private javax.swing.JLabel jLbl_Image;
    private javax.swing.JLabel jLbl_Tipo_Cliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTxt_Cant_boletos;
    // End of variables declaration//GEN-END:variables
}
