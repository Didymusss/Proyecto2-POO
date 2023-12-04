package Biblioteca;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

import Libro.Libro;

public class Inventario {
    private List<Libro> inventarioLibros = new LinkedList<>();

    public LinkedList<Libro> leerInventario(){
        ObjectInputStream fileIn;
        LinkedList<Libro> inventarioLibros;

        try {
            fileIn = new ObjectInputStream(new FileInputStream("inventarioLibros"));
            inventarioLibros = (LinkedList<Libro>) fileIn.readObject();
            fileIn.close();
            return inventarioLibros;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }

        return new LinkedList<Libro>();
        

    }

    public void guardarInventario(LinkedList<Libro> inventario){
        try {
            ObjectOutputStream fileOut = new ObjectOutputStream(new FileOutputStream("inventarioLibros"));
            fileOut.writeObject(inventario);
            fileOut.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }
    }

    boolean buscarLibro(String titulo){
        for(Libro libro: inventarioLibros){
            if(libro.getTitulo().equals(titulo)){
                return true;
            }
        }
        return false;
    }

    boolean buscarLibro(int numCodigo){
        for(Libro libro: inventarioLibros){
            if(libro.getNumCodigo() == numCodigo){
                return true;
            }
        }
        return false;
    }
    
    void aniadirLibro(Libro libro){
        inventarioLibros.add(libro);
    }

    
}
