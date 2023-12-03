package Persona;

public class Persona {

    private String nombre;
    private String domicilio;
    private long telefono;

    public Persona(String nombre, String domicilio, long telefono) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }
    
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Domicilio: "+domicilio);
        System.out.println("Teléfono: "+telefono);
    }
}
