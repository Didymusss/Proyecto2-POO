package Biblioteca;


import Libro.Libro;

public class FachadaPrestamo {
    Inventario inventario;



    public void eliminarLibroInventario(Libro libro){
        inventario.eliminarLibro(libro);
    }

    public void mostrarInventario(){
        inventario.mostrarInventario();
    }

    public void aniadirLibro(Libro libro){
        inventario.aniadirLibro(libro);
    }

    public Libro buscarLibro(String titulo){
        return inventario.buscarLibro(titulo);
    }

    public Libro buscarLibro(int numCodigo){
        return inventario.buscarLibro(numCodigo);
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    
    
}