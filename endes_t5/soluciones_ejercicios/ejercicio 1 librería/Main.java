public class Main {

    public static void main(String[] args) {
        Libreria miLibreria = new Libreria();

        Libro libro1 = new Libro("El Hobbit", "Tolkien", "Fantasía", 1965);

        miLibreria.añadirLibro(libro1);

        miLibreria.mostrarColeccion();

        miLibreria.buscarPorAutor("Tolki");
    }

}
