package Registro;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedList;

import Libro.Libro;
import Persona.Cliente;

public class Registro implements Observador{

    private int numClientes;
    private int numLibros;
    private int numLibrosPrestamo;
    private int numSanciones;
    private int ganancias;
    private String comentarios;

    public void setNumClientes(int numClientes) {
        this.numClientes = numClientes;
    }
    public void setNumLibros(int numLibros) {
        this.numLibros = numLibros;
    }
    public void setNumLibrosPrestamo(int numLibrosPrestamo) {
        this.numLibrosPrestamo = numLibrosPrestamo;
    }
    public void setNumSanciones(int numSanciones) {
        this.numSanciones = numSanciones;
    }
    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }
    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
    @Override
    public String toString() {
        return "Numero de clientes=" + numClientes + ", numero de libros=" + numLibros + ", numero de libros en prestamos="
                + numLibrosPrestamo + ", numero de sanciones=" + numSanciones + ", ganancias=" + ganancias + ", comentarios="
                + comentarios;
    }

    public void guardarRegistro(){
        try {
            ObjectOutputStream fileOut = new ObjectOutputStream(new FileOutputStream("registro"));
            fileOut.writeObject(this);
            fileOut.close();
        } catch (Exception e) {
           
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void leerRegistro(){
        ObjectInputStream fileIn;


        try {
            fileIn = new ObjectInputStream(new FileInputStream("registro"));
            Registro temp = (Registro) fileIn.readObject();
            numClientes = temp.numClientes;
            numLibros = temp.numLibros;
            numLibrosPrestamo = temp.numLibrosPrestamo;
            numSanciones = temp.numSanciones;
            ganancias = temp.ganancias;
            comentarios= temp.comentarios;
            fileIn.close();

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }


    }
    
    
    @Override
    public void update() {
        // TODO Auto-generated method stub
        System.out.println("¿Que se actualizo?");

    }

    


}
