import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import Biblioteca.Inventario;
import Libro.CienciaFiccionBuilder;
import Libro.Comedia;
import Libro.Director;
import Libro.Libro;
import Libro.RomanceBuilder;
import Libro.TerrorBuilder;
import Login.Sesion;
import Persona.*;

public class Biblioteca{

    public static void main(String[] args) {
        List <Cliente> listaClientes = new LinkedList<>();//Lista de clientes
        List <Trabajador> listaTrabajadores = new LinkedList<>();//Lista de trabajadores
        List<Libro> listaRomance = new ArrayList<>();
        List<Libro> listaCienciaFiccion = new ArrayList<>();
        List<Libro> listaComedia = new ArrayList<>();
        List<Libro> listaTerror = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        int opcion;
        File usuariosString = new File("usuarios.txt");

        System.out.println("Bienvenido a la Biblioteca");
        System.out.println("Que tipo de usuario eres?");
        System.out.println("1. Trabajador");
        System.out.println("2. Cliente");
        opcion = input.nextInt();
        

        if(opcion == 1){//Trabajador
            Trabajador trabajador = new Trabajador();
            Cliente cliente = new Cliente();

            System.out.println("Iniciar sesion o crear usuario?");
            System.out.println("1. Iniciar sesion");
            System.out.println("2. Crear usuario");
            opcion = input.nextInt();

            if(opcion == 1){
                System.out.println("------Inicio de sesion------");
                System.out.print("Usuario: ");
                input.nextLine();
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


                System.out.println("Ingresa tu núnero de trabajador: ");
                int numTrabajador = input.nextInt();
         

                for(Trabajador tempTrabajador: listaTrabajadores){
                    if(tempTrabajador.getNumTrabajador() == numTrabajador){
                        trabajador = tempTrabajador;
                        break;
                    }
                }
            } else {
                System.out.print("Usuario: ");
                input.nextLine();
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
                Sesion.register(userName, password, usuariosString);

                //Guardar trabajador
                System.out.print("Nombre del trabajador: ");
                String nombre = input.nextLine();

                System.out.print("Domicilio del trabajador: ");
                String domicilio = input.nextLine();

                System.out.print("Correo del trabajador: ");
                String correo = input.nextLine();

                System.out.print("RFC del trabajador: ");
                String rfc = input.nextLine();

                System.out.print("Número de trabajador: ");
                int numTrabajador = input.nextInt();

                trabajador = new Trabajador(nombre, domicilio, correo, rfc, numTrabajador);

                listaTrabajadores.add(trabajador);
                                            

            }

            do{
            System.out.print("*****MENU*****");
            System.out.print("1. Añadir cliente");
            System.out.print("2. Eliminar cliente ");
            System.out.print("3. Prestamos ");
            System.out.print("4. Ver registro ");
            System.out.println("5. Registrar libro");
            System.out.println("6. Eliminar libro");
            System.out.println("7. Devoluciones");
            System.out.print("8. Salir ");

            System.out.print("Elige una opcion: ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:

                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Ingresa el nombre del cliente: ");
                    String nombreCliente = input.nextLine();
            
                    System.out.print("Ingresa el domicilio del cliente: ");
                    String domicilioCliente = input.nextLine();
            
                    System.out.print("Ingresa el correo del cliente: ");
                    String correoCliente = input.nextLine();
            
                    System.out.print("Ingresa el numero de cliente: ");
                    int numCliente = input.nextInt();
            
                    cliente = new Cliente(nombreCliente, domicilioCliente, correoCliente, numCliente, true);

                    listaClientes.add(cliente);//El cliente se guarda en la lista y ya esta registrado 


                break;

                case 2:

                    System.out.print("\nIngresa el numero de cliente a eliminar: ");
                    int numEliminar = input.nextInt();

                    for (Cliente clienteEmilinar : listaClientes) {
                        if (clienteEmilinar.getNumeroCliente() == numEliminar) {
                            listaClientes.remove(clienteEmilinar);
                            System.out.println("Cliente eliminado exitosamente.");
                            break; 
                        }
                    }
  

                break;
                case 3:

                
                 
                    System.out.println("****Prestamos****");

                    System.out.print("\nIngresa el numero del cliente que requiere el prestamo: ");
                    int numPrestamo = input.nextInt();

                    System.out.print("\nIngrese su numero de trabajador: ");
                    int numTrabajador = input.nextInt();

                    for (Cliente clientePrestamo : listaClientes) {
                        if (clientePrestamo.getNumeroCliente() == numPrestamo) {

                            PersonaFacade personaFacade = new PersonaFacade(trabajador, clientePrestamo);

                            System.out.println("Pidele que llene un formulario");
                            //El trabajdaor recibe los libros y hace el prestamo
                            personaFacade.realizarPrestamo(cliente.getLibrosTomados());
                            
                        }else{
                            System.out.println("No se encontro al cliente en la lista, registralo antes");
                        }
                    } 
                    

                break;
                case 4:

                    break;
                case 5:

                    System.out.println("Eligue que genero de libro vas a registrar: ");
                    System.out.println("1. Romance");
                    System.out.println("2. Ciencia Ficcion");
                    System.out.println("3. Comedia ");
                    System.out.println("4. Terror"); 
                    System.out.print("Elige una opcion: ");
                    opcion = input.nextInt();

                    switch (opcion) {
                        case 1:

                            RomanceBuilder romanceBuilder = new RomanceBuilder();
                            Director director = new Director(romanceBuilder);

                            Libro libroR = director.construirLibro();
                            System.out.println("Libro: " + libroR); 
                            listaRomance.add(libroR);                      

                           break;
                        case 2:

                            CienciaFiccionBuilder cienciaBuilder = new CienciaFiccionBuilder();
                            Director director2 = new Director(cienciaBuilder);

                            Libro libroC = director2.construirLibro();
                            System.out.println("Libro: " + libroC);
                            listaCienciaFiccion.add(libroC);

                            break;
                        case 3:

                            Comedia comediaBuilder = new Comedia();
                            Director director3 = new Director(comediaBuilder);

                            Libro libroCo = director3.construirLibro();
                            System.out.println("Libro: " + libroCo);
                            listaComedia.add(libroCo);

                            break;
                        case 4:
                            TerrorBuilder terrorBuilder = new TerrorBuilder();
                            Director director4 = new Director(terrorBuilder);

                            Libro libroT = director4.construirLibro();
                            System.out.println("Libro: " + libroT);
                            listaTerror.add(libroT);

                            break;

                        default:
                            System.out.println("Opción no válida");
                            break;
                    }    
                        
                break;

                case 6:

                    System.out.println("Ingrese el codigo del libro que desea eliminar:");
                    int codigoEliminar = input.nextInt();

                    System.out.println("Eligue el genero de libro a eliminar: ");
                    System.out.println("1. Romance");
                    System.out.println("2. Ciencia Ficcion");
                    System.out.println("3. Comedia ");
                    System.out.println("4. Terror"); 
                    System.out.print("Elige una opcion: ");
                    opcion = input.nextInt();

                    switch (opcion) {
                        case 1:

                            for (Libro Rlibro : listaRomance ) {
                                if (Rlibro.getNumCodigo() == codigoEliminar) {
                                    listaRomance.remove(Rlibro);
                                    System.out.println("Libro eliminado: " + Rlibro);
                                }
                            }                     

                        break;
                        case 2:

                            for (Libro Clibro : listaCienciaFiccion ) {
                                if (Clibro.getNumCodigo() == codigoEliminar) {
                                    listaCienciaFiccion.remove(Clibro);
                                    System.out.println("Libro eliminado: " + Clibro);
                                }
                            } 
                            break;
                        case 3:

                            for (Libro Colibro : listaComedia  ) {
                                if (Colibro.getNumCodigo() == codigoEliminar) {
                                    listaComedia.remove(Colibro);
                                    System.out.println("Libro eliminado: " + Colibro);
                                }
                            } 

                            break;
                        case 4:
                            for (Libro Tlibro : listaTerror   ) {
                                if (Tlibro.getNumCodigo() == codigoEliminar) {
                                    listaTerror.remove(Tlibro);
                                    System.out.println("Libro eliminado: " + Tlibro);
                                }
                            } 

                            break;

                        default:
                            System.out.println("Opción no válida");
                            break;
                    }    
                        
                break;

                case 7: //Devoluciones
                    
                    System.out.print("\nIngresa el numero del cliente que requiere la devolucion: ");
                    int clienteDevo= input.nextInt();
                    
                    System.out.print("\nIngresa tu numero de trabajador: ");
                    int trabajadorUsuario = input.nextInt();

                    System.out.println("Ingrese el numero de libro a devolver: ");
                    int numDevolver = input.nextInt();

                    Libro devolucion = cliente.buscarLibro(numDevolver);

                    for (Trabajador trabajdorD : listaTrabajadores) {
                        if (trabajdorD.getNumTrabajador() == trabajadorUsuario) {

                            for (Cliente Dcliente : listaClientes) {
                                if (Dcliente.getNumeroCliente() == clienteDevo) {

                                    PersonaFacade personaFacade = new PersonaFacade(trabajdorD, Dcliente);
                                    personaFacade.devolverLibro(devolucion);
                                    
                                }else{
                                    System.out.println("No se encontro al cliente en la lista, registralo antes");
                                }
                            }

                        }
                    }
                

                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
                }

                }while(opcion!=8);
            



        }else{//Cliente

            System.out.println("------Inicio de sesion------");
            System.out.print("Usuario: ");
            System.out.print("Contraseña: ");

            System.out.print("\nIngresa tu numero de cliente: ");
            int clienteUsuario = input.nextInt();

            for (Cliente clientePrestamo : listaClientes) {
                if (clientePrestamo.getNumeroCliente() == clienteUsuario) {
                    
        
            

            do{
            System.out.println("*****MENU*****");
            System.out.println("1. Agregar libro a tu lista ");
            System.out.println("2. Buscar libro");
            System.out.println("3. Catalogo");
            System.out.println("4. Salir");

            System.out.print("Elige una opcion: ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el codigo del libro que desea agregar a su lista:");
                    int codigoAgregarLista = input.nextInt();

                    System.out.println("Eligue el genero del libro que quieres agregar: ");
                    System.out.println("1. Romance");
                    System.out.println("2. Ciencia Ficcion");
                    System.out.println("3. Comedia ");
                    System.out.println("4. Terror"); 
                    System.out.print("Elige una opcion: ");
                    opcion = input.nextInt();

                    switch (opcion) {
                        case 1:

                            for (Libro Rlibro : listaRomance ) {
                                if (Rlibro.getNumCodigo() == codigoAgregarLista) {
                                    clientePrestamo.tomarLibro(Rlibro);
                                    System.out.println("Libro agregado: " + Rlibro);
                                }
                            }                     

                        break;
                        case 2:

                            for (Libro Clibro : listaCienciaFiccion ) {
                                if (Clibro.getNumCodigo() == codigoAgregarLista) {
                                    clientePrestamo.tomarLibro(Clibro);
                                    System.out.println("Libro agregado: " + Clibro);
                                }
                            } 
                            break;
                        case 3:

                            for (Libro Colibro : listaComedia  ) {
                                if (Colibro.getNumCodigo() == codigoAgregarLista) {
                                    clientePrestamo.tomarLibro(Colibro);
                                    System.out.println("Libro agregado: " + Colibro);
                                }
                            } 

                            break;
                        case 4:
                            for (Libro Tlibro : listaTerror   ) {
                                if (Tlibro.getNumCodigo() == codigoAgregarLista) {
                                    clientePrestamo.tomarLibro(Tlibro);
                                    System.out.println("Libro agregado: " + Tlibro);
                                }
                            } 

                        break;

                        default:
                            System.out.println("Opción no válida");
                        break;
                    }

                break;

                case 2:

                    System.out.println("Ingrese el codigo del libro que desea buscar:");
                    int codigoBuscar = input.nextInt();

                    System.out.println("Eligue el genero del libro a buscar: ");
                    System.out.println("1. Romance");
                    System.out.println("2. Ciencia Ficcion");
                    System.out.println("3. Comedia ");
                    System.out.println("4. Terror"); 
                    System.out.print("Elige una opcion: ");
                    opcion = input.nextInt();

                    switch (opcion) {
                        case 1:

                            for (Libro Rlibro : listaRomance ) {
                                if (Rlibro.getNumCodigo() == codigoBuscar) {
                                    
                                    System.out.println("Libro encontrado: " + Rlibro);
                                }
                            }                     

                        break;
                        case 2:

                            for (Libro Clibro : listaCienciaFiccion ) {
                                if (Clibro.getNumCodigo() == codigoBuscar) {
                                    
                                    System.out.println("Libro encontrado: " + Clibro);
                                }
                            } 
                            break;
                        case 3:

                            for (Libro Colibro : listaComedia  ) {
                                if (Colibro.getNumCodigo() == codigoBuscar) {
                                    
                                    System.out.println("Libro encontrado: " + Colibro);
                                }
                            } 

                            break;
                        case 4:
                            for (Libro Tlibro : listaTerror   ) {
                                if (Tlibro.getNumCodigo() == codigoBuscar) {
                                    
                                    System.out.println("Libro encontrado: " + Tlibro);
                                }
                            } 

                            break;

                        default:
                            System.out.println("Opción no válida");
                            break;
                    }
                
                break;
                case 3:
                
                
                
                    break;
            
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }

            }while(opcion !=4);

            }else{
                    System.out.println("No se encontro al cliente en la lista");
                }
            }
            
            input.close();


        }


    }


}