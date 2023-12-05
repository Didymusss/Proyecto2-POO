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

    public void leerInventario(){
        ObjectInputStream fileIn;


        try {
            fileIn = new ObjectInputStream(new FileInputStream("inventarioLibros"));
            this.inventarioLibros = (LinkedList<Libro>) fileIn.readObject();
            fileIn.close();

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }


    }

    public void guardarInventario(){
        try {
            ObjectOutputStream fileOut = new ObjectOutputStream(new FileOutputStream("inventarioLibros"));
            fileOut.writeObject(this.inventarioLibros);
            fileOut.close();
        } catch (Exception e) {
           
            System.out.println("Error: " + e.getMessage());
        }
    }

    Libro buscarLibro(String titulo){
        for(Libro libro: inventarioLibros){
            if(libro.getTitulo().equals(titulo)){
                return libro;
            }
        }
        return null;
    }

    Libro buscarLibro(int numCodigo){
        for(Libro libro: inventarioLibros){
            if(libro.getNumCodigo() == numCodigo){
                return libro;
            }
        }
        return null;
    }
    
    void aniadirLibro(Libro libro){
        inventarioLibros.add(libro);
    }

    void eliminarLibro(Libro libro){
        inventarioLibros.remove(libro);
    }

    void mostrarInventario(){
        for(Libro libro: inventarioLibros){
            System.out.println(libro);
        }
    }

    
}
