import java.util.Scanner;

public class Biblioteca{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;

        System.out.println("Bienvenido a la Biblioteca");
        System.out.println("Que tipo de usuario eres?");
        System.out.println("1. Trabajador");
        System.out.println("2. Cliente");
        opcion = input.nextInt();

        if(opcion == 1){//Trabajador
            System.out.println("------Inicio de sesion------");
            System.out.print("Usuario: ");
            System.out.print("Contraseña: ");

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