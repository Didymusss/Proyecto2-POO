package Login;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Sesion {
    static String nombre;
    static String contrasenia;


    public static boolean userExists(String nombre, String pass, File archivo){
        try{
            Scanner archivoValidacion = new Scanner(new FileReader(archivo));
       
            while (archivoValidacion.hasNextLine()) {
                String linea = archivoValidacion.nextLine();
                String[] partes = linea.split(",");

                if(partes.length == 2 && partes[0].equals(nombre) && partes[1].equals(pass)){
                    return true;
                }
                
            }
            archivoValidacion.close();
        } catch(FileNotFoundException e){
            System.out.println("Error: " + e.getMessage());
        }

        return false;
    }

    public static boolean userExists(String nombre, File archivo){
        try{
            Scanner archivoValidacion = new Scanner(new FileReader(archivo));
       
            while (archivoValidacion.hasNextLine()) {
                String linea = archivoValidacion.nextLine();
                String[] partes = linea.split(",");

                if(partes.length == 2 && partes[0].equals(nombre)){
                    return true;
                }
                
            }
            archivoValidacion.close();
        } catch(FileNotFoundException e){
            System.out.println("Error: " + e.getMessage());
        }

        return false;
    }

    

    public static void register(String nombre, String pass, File archivo){
        try{
            PrintWriter fileOut = new PrintWriter(new FileWriter(archivo, true));
            fileOut.println(nombre + "," + pass); 
            fileOut.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            
        }

    }



    
}
