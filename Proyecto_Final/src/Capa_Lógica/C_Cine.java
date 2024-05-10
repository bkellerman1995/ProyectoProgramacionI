package Capa_Lógica;

public class C_Cine {

    D_Cliente cliente = null;
    private B_Película[] pelicula;
    private D_Cliente[][] sala1;
    private D_Cliente[][] sala2;
    private D_Cliente[][] sala3;
    private final int CANT_PELICULAS = 3;
    private final int CANT_FILAS = 10;
    private final int CANT_COLUMNAS = 8;
    private final double CLIENTE_REGULAR = 2800;
    private final double ADULTO_MAYOR = 2300;
    private final double NINNO = 2000;
    private int contador_pelis;
    private int cant_asientos_sala_1;
    private int cant_asientos_sala_2;
    private int cant_asientos_sala_3;
    String alfabeto = "ABCDEFGHIJ";
    int c = 0;

    public C_Cine() {
        this.sala1 = new D_Cliente[CANT_FILAS][CANT_COLUMNAS];
        this.sala2 = new D_Cliente[CANT_FILAS][CANT_COLUMNAS];
        this.sala3 = new D_Cliente[CANT_FILAS][CANT_COLUMNAS];
        this.pelicula = new B_Película[CANT_PELICULAS];
        this.contador_pelis = 0;
        this.cant_asientos_sala_1 = 0;
        this.cant_asientos_sala_2 = 0;
        this.cant_asientos_sala_3 = 0;
    }
    
    public boolean agregar_pelicula_arreglo(B_Película pel) {
        if (this.getContador_pelis() < this.pelicula.length) {
            if (this.pelicula[0] == null) {
                this.pelicula[0] = pel;
                this.contador_pelis++;
                return true;
            } else {
                if (this.pelicula[1] == null) {
                    if (this.pelicula[0].getNum_sala() == pel.getNum_sala()) {
                        return false;
                    } else {
                        this.pelicula[1] = pel;
                        this.contador_pelis++;
                        return true;
                    }
                } else {
                    if (this.pelicula[2] == null) {
                        if (this.pelicula[1].getNum_sala() == pel.getNum_sala()) {
                            return false;
                        } else {
                            this.pelicula[2] = pel;
                            this.contador_pelis++;
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            }
        } else {
            return false;
        }
    }
                    
    public boolean quitar_película(int num_película) {

        if (this.contador_pelis > 0) {
            if (num_película <= this.pelicula.length
                    && this.pelicula[num_película - 1]!=null) {
                this.pelicula[num_película - 1] = null;
                this.setContador_pelis(this.getContador_pelis()-1);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
                

    public String toString_arreglo() {
        String hilera = "";
        for (int i = 0; i < this.get_pelicula().length; i++) {
            if (this.get_pelicula()[i] != null) {
                hilera += "\n" + this.get_pelicula()[i].toString_Pelicula();
            } else {
                hilera += "\n" + null;
            }
        }
        return hilera;
    }

    public double ingresos_Sala_1() {
        double suma = 0;
        for (int i = 0; i < this.get_sala_1().length; i++) {
            for (int j = 0; j < this.get_sala_1()[i].length; j++) {
                if (this.get_sala_1()[i][j] != null) {
                    suma += (this.get_sala_1()[i][j].getTotal_pagado()
                            /this.get_sala_1()[i][j].getCant_boletos());
                }
            }
        }
        return suma;
    }

    public double ingresos_Sala_2() {
        double suma = 0;
        for (int i = 0; i < this.sala2.length; i++) {
            for (int j = 0; j < this.sala2[i].length; j++) {
                if (this.sala2[i][j] != null) {
                    suma += (this.get_sala_2()[i][j].getTotal_pagado()
                            /this.get_sala_2()[i][j].getCant_boletos());
                }
            }
        }
        return suma;
    }

    public double ingresos_Sala_3() {
        double suma = 0;
        for (int i = 0; i < this.sala3.length; i++) {
            for (int j = 0; j < this.sala3[i].length; j++) {
                if (this.sala3[i][j] != null) {
                    suma += (this.get_sala_3()[i][j].getTotal_pagado()
                            /this.get_sala_3()[i][j].getCant_boletos());
                }
            }
        }
        return suma;
    }
    
    public boolean agregar_asientos_Sala_1(char filas, int columnas, D_Cliente cliente) {
        switch (filas) {
            case 'A':
                c = 0;
                break;
            case 'B':
                c = 1;
                break;
            case 'C':
                c = 2;
                break;
            case 'D':
                c = 3;
                break;
            case 'E':
                c = 4;
                break;
            case 'F':
                c = 5;
                break;
            case 'G':
                c = 6;
                break;
            case 'H':
                c = 7;
                break;
            case 'I':
                c = 8;
                break;
            case 'J':
                c = 9;
                break;
        }

        if (this.get_sala_1()[c][columnas - 1] == null) {
            this.get_sala_1()[c][columnas - 1] = cliente;
            this.cant_asientos_sala_1++;
            return true;
        } else {
            return false;

        }
    }

    public boolean agregar_asientos_Sala_2(char filas, int columnas, D_Cliente cliente) {
         switch (filas) {
            case 'A':
                c = 0;
                break;
            case 'B':
                c = 1;
                break;
            case 'C':
                c = 2;
                break;
            case 'D':
                c = 3;
                break;
            case 'E':
                c = 4;
                break;
            case 'F':
                c = 5;
                break;
            case 'G':
                c = 6;
                break;
            case 'H':
                c = 7;
                break;
            case 'I':
                c = 8;
                break;
            case 'J':
                c = 9;
                break;
        }

        if (this.get_sala_2()[c][columnas - 1] == null) {
            this.get_sala_2()[c][columnas - 1] = cliente;
            this.cant_asientos_sala_2++;
            return true;
           

        } else {
            return false;

        }

    }

    public boolean agregar_asientos_Sala_3(char filas, int columnas, D_Cliente cliente) {
            switch (filas) {
            case 'A':
                c = 0;
                break;
            case 'B':
                c = 1;
                break;
            case 'C':
                c = 2;
                break;
            case 'D':
                c = 3;
                break;
            case 'E':
                c = 4;
                break;
            case 'F':
                c = 5;
                break;
            case 'G':
                c = 6;
                break;
            case 'H':
                c = 7;
                break;
            case 'I':
                c = 8;
                break;
            case 'J':
                c = 9;
                break;
        }

        if (this.get_sala_3()[c][columnas - 1] == null) {
            this.get_sala_3()[c][columnas - 1] = cliente;
            this.cant_asientos_sala_3++;
            return true;

        } else {
            return false;

        }
    }

    public void quitar_asiento_sala_1(D_Cliente cliente) {
        for (int i = 0; i < this.get_sala_1().length; i++) {
            for (int j = 0; j < this.get_sala_1()[i].length; j++) {
                if (this.get_sala_1()[i][j] == cliente);
                this.get_sala_1()[i][j] = null;
                this.cant_asientos_sala_1--;
            }
        }
    }

    public void quitar_asiento_sala_2(D_Cliente cliente) {
        for (int i = 0; i < this.get_sala_2().length; i++) {
            for (int j = 0; j < this.get_sala_2()[i].length; j++) {
                if (this.get_sala_2()[i][j] == cliente);
                this.get_sala_2()[i][j] = null;
                this.cant_asientos_sala_2--;
            }
        }
    }

    public void quitar_asiento_sala_3(D_Cliente cliente) {
        for (int i = 0; i < this.get_sala_3().length; i++) {
            for (int j = 0; j < this.get_sala_3()[i].length; j++) {
                if (this.get_sala_3()[i][j] == cliente);
                this.get_sala_3()[i][j] = null;
                this.cant_asientos_sala_3--;
            }
        }
    }

    public String toString_sala_1() {
        String hilera = "";
        char a = 'A';
        for (int i = 0; i < this.get_sala_1().length; i++) {
            hilera += "\n Fila: " + a + " ";
            a++;
            for (int j = 0; j < this.get_sala_1()[i].length; j++) {
                if (this.get_sala_1()[i][j] != null) {
                    hilera += " O " + "[" + (j + 1) + "] " + this.get_sala_1()[i][j]+ " ";
                } else {
                    hilera += " D " + "[" + (j + 1) + "] " + null;
                }
            }

        }
        return hilera;
    }

    public String toString_sala_2() {
        String hilera = "";
        char a = 'A';
        for (int i = 0; i < this.get_sala_2().length; i++) {
            hilera += "\n Fila: " + a + " ";
            a++;
            for (int j = 0; j < this.get_sala_2()[i].length; j++) {
                if (this.get_sala_2()[i][j] != null) {
                    hilera += " O " + "[" + (j + 1) + "] " + this.get_sala_2()[i][j]+" ";
                } else {
                    hilera += " D " + "[" + (j + 1) + "] " + null;
                }
            }

        }
        return hilera;
    }

    public String toString_sala_3() {
        String hilera = "";
        char a = 'A';
        for (int i = 0; i < this.get_sala_3().length; i++) {
            hilera += "\n Fila: " + a + " ";
            a++;
            for (int j = 0; j < this.get_sala_3()[i].length; j++) {
                if (this.get_sala_3()[i][j] != null) {
                    hilera += " O " + "[" + (j + 1) + "] " + this.get_sala_3()[i][j]+ " ";
                } else {
                    hilera += " D " + "[" + (j + 1) + "] " + null;
                }
            }

        }
        return hilera;
    }

    public B_Película[] get_pelicula() {
        return this.pelicula;
    }

    public D_Cliente[][] get_sala_1() {
        return this.sala1;
    }

    public D_Cliente[][] get_sala_2() {
        return this.sala2;
    }

    public D_Cliente[][] get_sala_3() {
        return this.sala3;
    }

    public void setPelicula(B_Película[] pelicula) {
        this.pelicula = pelicula;
    }

    public void setSala1(D_Cliente[][] sala1) {
        this.sala1 = sala1;
    }

    public void setSala2(D_Cliente[][] sala2) {
        this.sala2 = sala2;
    }

    public void setSala3(D_Cliente[][] sala3) {
        this.sala3 = sala3;
    }

    public int getContador_pelis() {
        return contador_pelis;
    }

    public void setContador_pelis(int contador_pelis) {
        this.contador_pelis = contador_pelis;
    }

    public double getCLIENTE_REGULAR() {
        return CLIENTE_REGULAR;
    }

    public double getADULTO_MAYOR() {
        return ADULTO_MAYOR;
    }

    public double getNINNO() {
        return NINNO;
    }

    public int getCANT_FILAS() {
        return CANT_FILAS;
    }

    public int getCANT_COLUMNAS() {
        return CANT_COLUMNAS;
    }

    public int getCant_asientos_sala_1() {
        return cant_asientos_sala_1;
    }

    public void setCant_asientos_sala_1(int cant_asientos_sala_1) {
        this.cant_asientos_sala_1 = cant_asientos_sala_1;
    }

    public int getCant_asientos_sala_2() {
        return cant_asientos_sala_2;
    }

    public void setCant_asientos_sala_2(int cant_asientos_sala_2) {
        this.cant_asientos_sala_2 = cant_asientos_sala_2;
    }

    public int getCant_asientos_sala_3() {
        return cant_asientos_sala_3;
    }

    public void setCant_asientos_sala_3(int cant_asientos_sala_3) {
        this.cant_asientos_sala_3 = cant_asientos_sala_3;
    }

}
