package Capa_Lógica;



public class B_Película {
   private String nombre_pelicula;
   private int num_sala;
   private double precio;
   private String fecha;
   private String hora;
   
   
   public B_Película(){
       this.nombre_pelicula = "";
       this.num_sala = 0;
       this.precio = 0;
       this.fecha = "";
       this.hora = "";
   }
   
   public B_Película (String nombre_pelicula,int num_sala, String fecha, String hora){
       this.nombre_pelicula = nombre_pelicula;
       this.num_sala = num_sala;
       this.precio = 0;
       this.fecha = fecha;
       this.hora = hora;
   }
   
   public String toString_Pelicula(){
       String hilera = "";
       hilera+= "/Nombre: "+this.getNombre_pelicula()+
               "/Fecha: "+this.getFecha()+
               "/Hora: "+this.getHora()+
               "/Sala: "+this.getNum_sala();
               
       return hilera;
   }
   

    public String getNombre_pelicula() {
        return this.nombre_pelicula;
    }

    public void setNombre_pelicula(String nombre_pelicula) {
        this.nombre_pelicula = nombre_pelicula;
    }

    public int getNum_sala() {
        return this.num_sala;
    }

    public void setNum_sala(int num_sala) {
        this.num_sala = num_sala;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
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
   
   
   
   
}
