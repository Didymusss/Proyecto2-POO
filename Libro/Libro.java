package Libro;
public class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private int numCodigo;
    private boolean estado;
    public static int numLibros; //Contador de libros

    public Libro() {
        numLibros++;
    }

    //Getters y setters
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public String getGenero() {
        return genero;
    }
    public int getNumCodigo() {
        return numCodigo;
    }
    public boolean getEstado(){
        return estado;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setNumCodigo(int numCodigo) {
        this.numCodigo = numCodigo;
    }
    public void setEstado(boolean estado){
        this.estado= estado;
    }


    @Override
    public String toString() {
        return "Libro: " +
                "titulo=" + titulo +
                ", autor=" + autor +
                ", genero=" + genero +
                ", numCodigo=" + numCodigo +
                ", estado=" + estado;
    }

    
}
