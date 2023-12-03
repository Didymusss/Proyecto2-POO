package Libro;

public class Director {

    private LibroBuilder libroBuilder;

    public Libro getLibro(){
        return this.libroBuilder.getLibro();
    }

    public void crearLibro(){
        this.libroBuilder.crearTitulo();
        this.libroBuilder.crearAutor();
        this.libroBuilder.crearGenero();
        this.libroBuilder.crearNumCodigo();
    }

    public void setLibroBuilder(LibroBuilder libroBuilder){
        this.libroBuilder= libroBuilder;
    }
    
}
