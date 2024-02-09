#### Enfoque Estructurado

En el enfoque estructurado, el problema se abordaría mediante la definición de estructuras de datos y funciones que operan sobre estas estructuras. Por ejemplo, podríamos tener una estructura para los libros y funciones para cada operación.

```c
#include <stdio.h>
#include <string.h>

#define MAX_LIBROS 100

// Estructura para un libro
struct Libro {
    char titulo[50];
    char autor[50];
    char genero[20];
    int año;
};

// Array de libros para almacenar la colección de la librería
struct Libro libreria[MAX_LIBROS];
int contadorLibros = 0;

// Función para añadir un libro
void añadirLibro(struct Libro libro) {
    if (contadorLibros < MAX_LIBROS) {
        libreria[contadorLibros++] = libro;
    }
}

// Función para buscar un libro por autor
void buscarPorAutor(char* autor) {
    for (int i = 0; i < contadorLibros; i++) {
        if (strcmp(libreria[i].autor, autor) == 0) {
            printf("Libro encontrado: %s\n", libreria[i].titulo);
        }
    }
}

// Y así sucesivamente para otras operaciones...
```
