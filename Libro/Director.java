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

        scanner.close();


        return libroBuilder
                .construirTitulo(titulo)
                .construirAutor(autor)
                .construirNumCodigo()
                .construirEstado()
                .build();
    }
}
