import Libro.Libro;
import Persona.Cliente;

public interface Observer {

    
    public void update();
    public void setSubject(Libro libro);
    public void setSubject(Cliente cliente);

}
