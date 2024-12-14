import java.util.ArrayList;
import java.util.List;

public class Libreria {
    private List<Libro> coleccion;

    public Libreria() {
        this.coleccion = new ArrayList<Libro>();
    }

    public void añadirLibro(Libro libro) {
        coleccion.add(libro);
    }

    public void buscarPorAutor(String autor) {
        for (Libro libro: coleccion) {
            if (libro.getAutor().equalsIgnoreCase(autor)) {
                System.out.println(libro);
            }
        }
    }

    public void mostrarColeccion(){
        for (Libro libro: coleccion) {
            System.out.println(libro);
        }
    }
}
