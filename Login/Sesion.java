package Login;
import Biblioteca.User;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Sesion {
    static String nombre;
    static String contrasenia;


    public static boolean login(User usuario, File archivo){
        try{
            Scanner archivoValidacion = new Scanner(new FileReader(archivo));
            nombre = usuario.getNombre();
            contrasenia = usuario.getContrasenia();
            while (archivoValidacion.hasNextLine()) {
                String linea = archivoValidacion.nextLine();
                String[] partes = linea.split(",");

                if(partes.length == 2 && partes[0].equals(nombre) && partes[1].equals(contrasenia)){
                    return true;
                }
                
            }
            archivoValidacion.close();
        } catch(FileNotFoundException e){
            System.out.println("Error: " + e.getMessage());
        }

        return false;
    }

    public static boolean register(User usuario, File archivo){
        
        return true;
    }



    
}
