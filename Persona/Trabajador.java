package Persona;
import Libro.Libro;

import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;

public class Trabajador extends Persona{
    private String RFC;
    private int numTrabajador;
    private List<Libro> librosPrestados; //Arreglo de los libros prestados 

    
    public Trabajador(String nombre, String domicilio, String correo, String RFC, int numTrabajador) {
        super(nombre, domicilio, correo);
        this.RFC = RFC;
        this.numTrabajador = numTrabajador;
        this.librosPrestados = new ArrayList<>();
    }

    public Trabajador(){}
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
    public void prestamoLibro(List<Libro> libros, Cliente cliente){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Copia de credencial INE (true/false): ");
        boolean ine = scanner.nextBoolean();
        scanner.nextLine(); 

        if (ine == true){
            //LLenar formulario
            System.out.println("Completa el formulario:");
            System.out.print("Nombre del cliente: ");
            String nombreCliente = scanner.nextLine();

            System.out.print("Domicilio del cliente: ");
            String domicilioCliente = scanner.nextLine();

            System.out.print("Correo del cliente: ");
            String correo = scanner.nextLine();
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
            System.out.println("\nInformacion del prestamo:");
            for (Libro libro : libros) {
                System.out.println("Libro prestado: " + libro.getTitulo());
            }
            System.out.println("Nombre del cliente: " + nombreCliente);
            System.out.println("Domicilio del cliente: " + domicilioCliente);
            System.out.println("Correo del cliente: " + correo);
            System.out.println("Numero de cliente: " + numCliente);
            System.out.println("Fecha de prestamo: " + dateFormat.format(fechaPrestamo));
            System.out.println("Fecha de la devolucion: " + fechaDevolucion);

            //Mostrar Reglas
            String rutaArchivo = "reglas.txt";

            try {
                FileReader fileReader = new FileReader(rutaArchivo);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String linea;
                while ((linea = bufferedReader.readLine()) != null) {
                    System.out.println(linea);
                }

                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            librosPrestados.addAll(libros);

        } else{
            System.out.println("Regrese mas tarde con su INE para poder procesar su prestamo");
        }

        scanner.close();
    }

    public void devolverLibros(List<Libro> libros) {
        for (Libro libro : libros) {
            if (librosPrestados.contains(libro)) {
                librosPrestados.remove(libro);
                System.out.println("Libro devuelto: " + libro.getTitulo());
            } else {
                System.out.println("El libro " + libro.getTitulo() + " no está en la lista de libros prestados.");
            }
        }
    }

}



