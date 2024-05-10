package Capa_Lógica;


public class D_Cliente {

    private String nombre_cliente;
    private int num_reservacion;
    private Tipo_Tarjeta tipo;
    private String numero_Tarjeta;
    private int fecha_vencimiento;//CHEQUEAR SI SE PUEDE CON CALENDAR
    private int codigo_seguridad;
    private double total_pagado;
    private int cant_boletos;
    private int sala;
    private String peli;
    private String fecha;
    private String hora;
    private String tipo_cliente;
    private String asiento;
    


    
    public D_Cliente(){
        this.nombre_cliente = "//N";
        this.num_reservacion = (int)Math.random() * (9999 - 1000 + 1) +1000;
        this.tipo = null;
        this.numero_Tarjeta = "";
        this.fecha_vencimiento = 0;
        this.codigo_seguridad = 0;
        this.total_pagado = 0;
        this.cant_boletos = 0;
        this.sala = 0;
        this.peli = "";
        this.fecha = "";
        this.hora = "";
        this.tipo_cliente = "";
        this.asiento = "";
        
    }
    
    public boolean algoritmo_luhn(D_Cliente cliente) {
       int [] card_number = new int [cliente.numero_Tarjeta.length()];
       
       for (int i = 0; i < cliente.numero_Tarjeta.length();i++){
           card_number[i] = Integer.parseInt(cliente.numero_Tarjeta
           .substring(i, i+1));
       }
       
       for (int i = card_number.length -2; i >=0; i = i-2){
           int auxiliar = card_number[i];
           auxiliar = auxiliar *2;
           if (auxiliar >9){
               auxiliar = auxiliar % 10 +1;
           }
           card_number[i] = auxiliar;
       }
       
       int total = 0;
       for (int i = 0; i < card_number.length; i++){
           total += card_number[i];
       }
       
       if (total % 10 == 0){
           return true;
       } else{
           return false;
       }
    }
    
    
    public String toString(){
        String hilera = " "+this.getNombre_cliente();
        return hilera;
    }
    
    public String toString_2() {
        String tarjeta_oculta = "xxxx-xxxx-xxxx"+this.getNumero_Tarjeta()
                .substring(12,16);
        String hilera = " ";
        hilera += "                 CINE NEW CINEMAS S.A       "
                + "\n"
                + "\n"
                +"Número de reservación: " + this.getNum_reservacion()
                + "\nFecha: "+this.getFecha()
                + "\nNombre del cliente: " + this.getNombre_cliente()
                + "\nTarjeta: "+this.getTipo()+" "+tarjeta_oculta
                + "\n"
                + "\nSala No. "+this.getSala()
                + "\nPelícula: "+this.getPeli()
                + "\nHorario: "+this.getHora()
                + "\nTiquetes comprados: " +this.getTipo_cliente()
                + "\nAsientos seleccionados: "+this.getAsiento()              
                + "\nTotal Pagado: ₡"+this.getTotal_pagado()
                + "\n"
                + "\n"
                + "\n"
                + "\n"
                + "\n             ¡Que disfruten su película!";

                
        return hilera;
    }
    
    public String hilera_tipo_cliente(String cant_asientos_y_tipo_cliente){
        String hilera = "";
        hilera += "\n"+cant_asientos_y_tipo_cliente;
        return hilera;
    }
    
    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public int getNum_reservacion() {
        return num_reservacion;
    }

    public void setNum_reservacion(int num_reservacion) {
        this.num_reservacion = num_reservacion;
    }

    public Tipo_Tarjeta getTipo() {
        return tipo;
    }

    public void setTipo(Tipo_Tarjeta tipo) {
        this.tipo = tipo;
    }

    public String getNumero_Tarjeta() {
        return numero_Tarjeta;
    }

    public void setNumero_Tarjeta(String numero_Tarjeta) {
        this.numero_Tarjeta = numero_Tarjeta;
    }

    public int getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(int fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public int getCodigo_seguridad() {
        return codigo_seguridad;
    }

    public void setCodigo_seguridad(int codigo_seguridad) {
        this.codigo_seguridad = codigo_seguridad;
    }

    public double getTotal_pagado() {
        return total_pagado;
    }
    
    public void setTotal_pagado(double total_pagado) {
        this.total_pagado = total_pagado;
    }

    public int getCant_boletos() {
        return cant_boletos;
    }

    public void setCant_boletos(int cant_boletos) {
        this.cant_boletos = cant_boletos;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public String getPeli() {
        return peli;
    }

    public void setPeli(String peli) {
        this.peli = peli;
    }

    public String getFecha() {
        return fecha;
    }
 
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getTipo_cliente() {
        return tipo_cliente;
    }

    public void setTipo_cliente(String tipo_cliente) {
        this.tipo_cliente = tipo_cliente;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }



    
    
    
}
