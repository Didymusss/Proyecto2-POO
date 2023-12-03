package Persona;
import java.util.List;
import Libro.Libro;
import java.util.ArrayList;

public class Cliente extends Persona {

    private int numCliente;
    private List<Libro> librosTomados;
    
    public Cliente(String nombre, String domicilio, long telefono, int numCliente) {
        super(nombre, domicilio, telefono);
        this.numCliente = numCliente;
        this.librosTomados = new ArrayList<>();
    }

    public int getNumeroCliente() {
        return numCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numCliente = numeroCliente;
    }

    public List<Libro> getLibrosTomados() {
        return librosTomados;
    }

    public void tomarLibro(Libro libro) {
        librosTomados.add(libro);
    }

    public void devolverLibro(Libro libro) {
        librosTomados.remove(libro);
    }
    
    public void infoCliente(){
        System.out.println("Núm. de cliente: "+numCliente);
    }
}
