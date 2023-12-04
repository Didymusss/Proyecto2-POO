package Persona;

public class Persona {

    private String nombre;
    private String domicilio;
    private String correo;

    public Persona(String nombre, String domicilio, String correo) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.correo = correo;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Persona: " +
                "nombre=" + nombre +
                ", domicilio=" + domicilio +
                ", correo=" + correo;
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Domicilio: "+domicilio);
        System.out.println("Correo: "+correo);
    }
}
