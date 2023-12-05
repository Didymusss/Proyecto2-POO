package Persona;
import java.util.ArrayList;
import java.util.List;

import Registro.Observador;
import Registro.Registro;
import Registro.Sujeto;

public class Persona implements Sujeto{

    private String nombre;
    private String domicilio;
    private String correo;
    private Observador observador = new Registro();
    };

    public Persona(String nombre, String domicilio, String correo) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.correo = correo;
    }

    public Persona(){}

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

    

    @Override
    public void notificar() {
        // TODO Auto-generated method stub
        for(Observador obs: obsevadores){
            obs.update();
        }
    }



    
}
