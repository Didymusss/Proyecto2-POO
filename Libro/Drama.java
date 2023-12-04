package Libro;

public class Drama implements LibroBuilder{

    private Libro libro;

    public Drama() {
        this.libro = new Libro();
        this.libro.setGenero("Drama");
    }

    @Override
    public LibroBuilder construirTitulo(String titulo) {
        this.libro.setTitulo(titulo);
        return this;
    }

    @Override
    public LibroBuilder construirAutor(String autor) {
        this.libro.setAutor(autor);
        return this;
    }

    @Override
    public LibroBuilder construirNumCodigo() {
        this.libro.setNumCodigo(Libro.numLibros);
        return this;
    }

    @Override
    public LibroBuilder construirEstado() {
        this.libro.setEstado(true);
        return this;
    }

    @Override
    public Libro build() {
        return this.libro;
    }
    
}

