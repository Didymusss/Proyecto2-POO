package Libro;

public interface LibroBuilder {

    LibroBuilder construirTitulo(String titulo);
    LibroBuilder construirAutor(String autor);
    LibroBuilder construirNumCodigo(int numCodigo);
    LibroBuilder construirEstado(boolean estado);
    Libro build();
    
}
