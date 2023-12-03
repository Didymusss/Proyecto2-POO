package Libro;

public class Director {

    private LibroBuilder libroBuilder;

    public Director(LibroBuilder libroBuilder) {
        this.libroBuilder = libroBuilder;
    }

    public Libro construirLibro(String titulo, String autor, int numCodigo, boolean estado) {
        return libroBuilder
                .construirTitulo(titulo)
                .construirAutor(autor)
                .construirNumCodigo(numCodigo)
                .construirEstado(estado)
                .build();
    }
    
}
