public class Main {
    public static void main(String[] args) {
        // Crear algunos libros
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez");
        Libro libro2 = new Libro("El Quijote", "Miguel de Cervantes");

        // Crear un usuario
        Usuario usuario1 = new Usuario("Juan");

        // Prestar libros
        usuario1.prestarLibro(libro1); // Se presta exitosamente
        usuario1.prestarLibro(libro2); // Se presta exitosamente

        // Intentar prestar un libro no disponible
        usuario1.prestarLibro(libro1); // No está disponible

        // Listar libros prestados
        usuario1.listarLibrosPrestados(); // Muestra los libros prestados

        // Devolver un libro
        usuario1.devolverLibro(libro1); // Se devuelve el libro

        // Listar libros prestados después de devolver
        usuario1.listarLibrosPrestados(); // Muestra el libro restante

        // Intentar devolver un libro que no ha sido prestado por este usuario
        usuario1.devolverLibro(libro2); // No ha sido prestado por este usuario


    }
}