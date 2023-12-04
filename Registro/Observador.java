package Registro;
import Libro.Libro;
import Persona.Cliente;

public interface Observador {

    
    public void update();
    public void setSubject(Libro libro);
    public void setSubject(Cliente cliente);

}
