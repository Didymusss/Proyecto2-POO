package Persona;
import java.util.List;

import Libro.Libro;


public class PersonaFacade {
    private Trabajador trabajador;
    private Cliente cliente;

    public PersonaFacade(Trabajador trabajador, Cliente cliente) {
        this.trabajador = trabajador;
        this.cliente = cliente;
    }

    public void tomarLibro(Libro libro) {
        cliente.tomarLibro(libro);
    }

    public void realizarPrestamo(List<Libro> libro) {
        trabajador.prestamoLibro(libro, cliente);
    }

    public void devolverLibro(Libro libro) {
        trabajador.devolverLibro(libro);
        cliente.devolverLibro(libro);
    }

    public void infoTrabajador() {
        trabajador.infoTrabajador();
    }

    public void infoCliente() {
        cliente.infoCliente();
    }
}
