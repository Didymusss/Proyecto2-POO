package Libro;
import java.util.Scanner;

public class Director {

    private LibroBuilder libroBuilder;
    Scanner scanner = new Scanner(System.in);

    public Director(LibroBuilder libroBuilder) {
        this.libroBuilder = libroBuilder;
    }

    public Libro construirLibro() {
        // Solicitar datos al usuario
        System.out.println("Ingresa el titulo:");
        String titulo = scanner.nextLine();

        System.out.println("Ingresa el autor:");
        String autor = scanner.nextLine();

        System.out.println("Ingrese el codigo:");
        int numCodigo = scanner.nextInt();

        System.out.println("Si el libro esta en buen estado ingresa true, si no, ingresa false:");
        boolean estado = scanner.nextBoolean();

        return libroBuilder
                .construirTitulo(titulo)
                .construirAutor(autor)
                .construirNumCodigo(numCodigo)
                .construirEstado(estado)
                .build();
    }
}
