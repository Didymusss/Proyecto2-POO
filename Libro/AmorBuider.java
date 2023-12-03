package Libro;

public class AmorBuider implements LibroBuilder{

    private Libro libro;

    public AmorBuider(){
        this.libro= new Libro();
    }

    @Override
    public void crearTitulo() {
        // TODO Auto-generated method stub
        libro.setTitulo("Orgullo y Prejuicio");
    }

    @Override
    public void crearAutor() {
        // TODO Auto-generated method stub
        libro.setAutor("Jane Austin");
    }

    @Override
    public void crearGenero() {
        // TODO Auto-generated method stub
        libro.setGenero("Romance");
    }

    @Override
    public void crearNumCodigo() {
        // TODO Auto-generated method stub
        libro.setNumCodigo(0);
    }

    @Override
    public Libro getLibro() {
        // TODO Auto-generated method stub
        return this.libro;
    }

    
    
}
