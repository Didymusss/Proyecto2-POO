package Persona;
import Libro.Libro;

import java.text.SimpleDateFormat;
import java.util.*;

public class Trabajador extends Persona{
    private String RFC;
    private int numTrabajador;
    private List<Libro> librosPrestados; //Arreglo de los libros prestados 

    
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

    //Prestamo 
    public void prestamoLibro(Libro libro, Cliente cliente){

        Scanner scanner = new Scanner(System.in);

        //LLenar formulario
        System.out.println("Completa el formulario:");
        System.out.print("Nombre del cliente: ");
        String nombreCliente = scanner.nextLine();

        System.out.print("Domicilio del cliente: ");
        String domicilioCliente = scanner.nextLine();

        System.out.print("Telefono del cliente: ");
        long telefonoCliente = scanner.nextLong();
        scanner.nextLine(); 

        System.out.print("Numero de cliente: ");
        int numCliente = scanner.nextInt();
        scanner.nextLine(); 

        //Calculo para saber la fecha de devolucion
        Date fechaPrestamo = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        //Una semana despues
        String fechaDevolucion = dateFormat.format(new Date(fechaPrestamo.getTime() + 7 * 24 * 60 * 60 * 1000));

        //Informacion
        System.out.println("\nInformación del préstamo:");
        System.out.println("Libro prestado: " + libro.getTitulo());
        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("Domicilio del cliente: " + domicilioCliente);
        System.out.println("Teléfono del cliente: " + telefonoCliente);
        System.out.println("Número de cliente: " + numCliente);
        System.out.println("Fecha de préstamo: " + dateFormat.format(fechaPrestamo));
        System.out.println("Fecha de devolución: " + fechaDevolucion);

        librosPrestados.add(libro);
        cliente.tomarLibro(libro);

        scanner.close();
    }

}



