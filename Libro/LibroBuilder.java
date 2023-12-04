package Libro;

public interface LibroBuilder {

    LibroBuilder construirTitulo(String titulo);
    LibroBuilder construirAutor(String autor);
    LibroBuilder construirNumCodigo();
    LibroBuilder construirEstado();
    Libro build();
    
}
