import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import Persona.Cliente;

import Login.Sesion;

public class Biblioteca{

    public static void main(String[] args) {
        List <Cliente> listaClientes = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        int opcion;
        File usuariosString = new File("usuarios.txt");

        System.out.println("Bienvenido a la Biblioteca");
        System.out.println("Que tipo de usuario eres?");
        System.out.println("1. Trabajador");
        System.out.println("2. Cliente");
        opcion = input.nextInt();

        if(opcion == 1){//Trabajador

            System.out.println("Iniciar sesion o crear usuario?");
            System.out.println("1. Iniciar sesion");
            System.out.println("2. Crear usuario");
            opcion = input.nextInt();

            if(opcion == 1){
                System.out.println("------Inicio de sesion------");
                System.out.print("Usuario: ");
                String userName = input.nextLine();
                System.out.print("Contraseña: ");
                String password = input.nextLine();
                while (!Sesion.userExists(userName, password, usuariosString)) {
                    System.out.println(("Ingreso inválido, prueba otra vez"));
                    System.out.print("Usuario: ");
                    userName = input.nextLine();
                    System.out.print("Contraseña: ");
                    password = input.nextLine();
                }
            } else {
                System.out.print("Usuario: ");
                String userName = input.nextLine();
                System.out.print("Contraseña: ");
                String password = input.nextLine();
                while(Sesion.userExists(userName, usuariosString)){
                    System.out.println(("Usuario ya existe, prueba otra vez"));
                    System.out.print("Usuario: ");
                    userName = input.nextLine();
                    System.out.print("Contraseña: ");
                    password = input.nextLine();
                };
                Sesion.register(userName, password, usuariosString);;
            }

            do{
            System.out.print("*****MENU*****");
            System.out.print("1. Añadir cliente");
            System.out.print("2. Eliminar cliente ");
            System.out.print("3. Prestamos ");
            System.out.print("4. Ver registro ");
            System.out.print("5. Salir ");

            System.out.print("Elige una opcion: ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }

            }while(opcion!=5);
            



        }else{//Cliente

            System.out.println("------Inicio de sesion------");
            System.out.print("Usuario: ");
            System.out.print("Contraseña: ");

            do{
            System.out.println("*****MENU*****");
            System.out.println("1. Agregar libro");
            System.out.println("2. Eliminar libro");
            System.out.println("3. Buscar libro");
            System.out.println("4. Devoluciones");
            System.out.println("5. Catalogo");
            System.out.println("6. Salir");

            System.out.print("Elige una opcion: ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;

                case 5:

                    break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }

            }while(opcion !=6);
            input.close();


        }


    }


}