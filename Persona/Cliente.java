package Persona;
import java.util.List;
import Libro.Libro;
import java.util.ArrayList;

public class Cliente extends Persona {

    private int numCliente;
    private boolean ine;
    private List<Libro> librosTomados;
    
    public Cliente(String nombre, String domicilio, String correo, int numCliente, boolean ine) {
        super(nombre, domicilio, correo);
        this.numCliente = numCliente;
        this.ine= ine;
        this.librosTomados = new ArrayList<>();
    }

    public int getNumeroCliente() {
        return numCliente;
    }
    public boolean getIne() {
        return ine;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numCliente = numeroCliente;
    }
    public void setIne(boolean ine) {
        this.ine = ine;
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
        System.out.println("Núm. de cliente: "+numCliente+ "Ine: "+ ine);
    }
}
