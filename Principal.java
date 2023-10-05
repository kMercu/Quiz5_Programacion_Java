/**
 * Este es el punto de entrada principal para el programa de gestión de una biblioteca.
 * La complejidad temporal de esta clase es principalmente O(1) para las operaciones de registro de libros.
 */
public class Principal {
    public static void main(String[] args) {
        // Crear una instancia de Biblioteca para la Biblioteca Konrad Lorenz.
        Biblioteca bibliotecaKonradLorenz = new Biblioteca();

        // Registrar libros en la biblioteca.
        Libro libro100AnosSoledad = new Libro("Cien años de Soledad", "Gabriel Garcia Marquez", 496);
        bibliotecaKonradLorenz.registrarLibro(libro100AnosSoledad);

        Libro libroElCodigoDaVinci = new Libro("El Código Da Vinci", "Dan Brown", 656);
        bibliotecaKonradLorenz.registrarLibro(libroElCodigoDaVinci);

        Libro libroMilNovecientosOchentayCuatro = new Libro("1984", "George Orwell", 326);
        bibliotecaKonradLorenz.registrarLibro(libroMilNovecientosOchentayCuatro);

        Libro libroElHobbit = new Libro("El Hobbit", "J.R.R. Tolkien", 310);
        bibliotecaKonradLorenz.registrarLibro(libroElHobbit);

        Libro libroLaOdisea = new Libro("La Odisea", "Homero", 448);
        bibliotecaKonradLorenz.registrarLibro(libroLaOdisea);
    }
}