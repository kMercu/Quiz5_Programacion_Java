/**
 * Esta clase muestra un libro con un título, un autor y un número de páginas.
 * La complejidad temporal de los métodos se especifica en cada uno.
 */
public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    /**
     * Constructor para crear un nuevo libro.
     *
     * @param titulo        El título del libro.
     * @param autor         El autor del libro.
     * @param numeroPaginas El número de páginas del libro.
     */
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    /**
     * Obtiene el título del libro.
     *
     * @return El título del libro.
     * Complejidad temporal: O(1) - Tiempo constante
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Obtiene el autor del libro.
     *
     * @return El autor del libro.
     * Complejidad temporal: O(1) - Tiempo constante
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Obtiene el número de páginas del libro.
     *
     * @return El número de páginas del libro.
     * Complejidad temporal: O(1) - Tiempo constante
     */
    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    /**
     * Establece el título del libro.
     *
     * @param titulo El nuevo título del libro.
     * Complejidad temporal: O(1) - Tiempo constante
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Establece el autor del libro.
     *
     * @param autor El nuevo autor del libro.
     * Complejidad temporal: O(1) - Tiempo constante
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Establece el número de páginas del libro.
     *
     * @param numeroPaginas El nuevo número de páginas del libro.
     * Complejidad temporal: O(1) - Tiempo constante
     */
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}
