package Capa_Lógica;

import Capa_Grafica.jFrm_A_Menu_Inicial;

public class A_Main_Proyecto {

    public static void main(String[] args) {
        C_Cine cine = new C_Cine();
        B_Película pelicula = null;
        D_Cliente cliente = null;
        Tipo_Tarjeta tipo_tarjeta = null;

        jFrm_A_Menu_Inicial ventana = new jFrm_A_Menu_Inicial(cine, pelicula, cliente,tipo_tarjeta);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);

    }

}
