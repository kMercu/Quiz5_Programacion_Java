import java.util.ArrayList;
import java.util.List;

/**
 * Esta es una clase que muestra una Biblioteca con una lista de libros disponibles.
 * La complejidad temporal de los métodos se especifica en cada uno.
 */
public class Biblioteca {
    // Cambiamos el tipo de la lista para que sea más "simple".
    private List<Libro> listaLibrosDisponibles = new ArrayList<>();

    /**
     * Registra un libro en la biblioteca.
     *
     * @param libro El libro que se va a registrar.
     * Complejidad temporal: O(1) - Tiempo constante
     */
    public void registrarLibro(Libro libro) {
        listaLibrosDisponibles.add(libro);
    }

    /**
     * Busca un libro por título en la biblioteca.
     *
     * @param titulo El título del libro a buscar.
     * @return El libro encontrado o null si no se encuentra.
     * Complejidad temporal: O(N) - Tiempo lineal
     */
    public Libro buscarLibro(String titulo) {
        for (Libro libro : listaLibrosDisponibles) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * Devuelve la lista de libros disponibles en la biblioteca.
     *
     * @return Una lista de libros disponibles.
     * Complejidad temporal: O(1) - Tiempo constante
     */
    public List<Libro> mostrarLibrosDisponibles() {
        return listaLibrosDisponibles;
    }
}