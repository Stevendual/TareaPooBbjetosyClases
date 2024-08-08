import java.util.ArrayList;
import java.util.List;

public class Usuario {
    // Atributos privados
    private String nombre;
    private List<Libro> librosPrestados;

    // Constructor
    public Usuario(String nombre) {
        this.nombre = nombre;
        this.librosPrestados = new ArrayList<>();
    }

    public void prestarLibro(Libro libro) {
        if (libro.estaDisponible()) {
            libro.prestar();
            librosPrestados.add(libro);
        } else {
            System.out.println("El libro '" + libro.getTitulo() + "' no está disponible para ser prestado.");
        }
    }

    public void devolverLibro(Libro libro) {
        if (librosPrestados.contains(libro)) {
            libro.devolver();
            librosPrestados.remove(libro);
        } else {
            System.out.println("El libro '" + libro.getTitulo() + "' no ha sido prestado por este usuario.");
        }
    }

    public void listarLibrosPrestados() {
        if (librosPrestados.isEmpty()) {
            System.out.println("El usuario '" + nombre + "' no tiene libros prestados.");
        } else {
            System.out.println("Libros prestados por el usuario '" + nombre + "':");
            for (Libro libro : librosPrestados) {
                System.out.println("- " + libro.getTitulo() + " de " + libro.getAutor());
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
