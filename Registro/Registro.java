package Registro;

public class Registro {
    private int numClientes;
    private int numLibros;
    private int numLibrosPrestamo;
    private int numSanciones;
    private int ganancias;
    private String comentarios;

    public void setNumClientes(int numClientes) {
        this.numClientes = numClientes;
    }
    public void setNumLibros(int numLibros) {
        this.numLibros = numLibros;
    }
    public void setNumLibrosPrestamo(int numLibrosPrestamo) {
        this.numLibrosPrestamo = numLibrosPrestamo;
    }
    public void setNumSanciones(int numSanciones) {
        this.numSanciones = numSanciones;
    }
    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }
    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
    @Override
    public String toString() {
        return "Numero de clientes=" + numClientes + ", numero de libros=" + numLibros + ", numero de libros en prestamos="
                + numLibrosPrestamo + ", numero de sanciones=" + numSanciones + ", ganancias=" + ganancias + ", comentarios="
                + comentarios;
    }

    


}
