package Persona;
import java.util.List;
import Libro.Libro;
import java.util.ArrayList;

public class Trabajador extends Persona{
    private String RFC;
    private int numTrabajador;
    private List<Libro> librosPrestados;

    
    public Trabajador(String nombre, String domicilio, long telefono, String RFC, int numTrabajador) {
        super(nombre, domicilio, telefono);
        this.RFC = RFC;
        this.numTrabajador = numTrabajador;
        this.librosPrestados = new ArrayList<>();
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public int getNumTrabajador() {
        return numTrabajador;
    }

    public void setNumTrabajador(int numTrabajador) {
        this.numTrabajador = numTrabajador;
    }
    
    
    public List<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void prestarLibro(Libro libro) {
        librosPrestados.add(libro);
    }

    public void devolverLibro(Libro libro) {
        librosPrestados.remove(libro);
    }
    
    public void infoTrabajador(){
        System.out.println("Núm. de trabajador: "+numTrabajador);
    }

}
