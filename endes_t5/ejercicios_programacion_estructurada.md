#### Enfoque Estructurado

En el enfoque estructurado, el problema se abordaría mediante la definición de estructuras de datos y funciones que operan sobre estas estructuras. Por ejemplo, podríamos tener una estructura para los libros y funciones para cada operación.

### Ejercicio 1

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


### Ejercicio 2

```c
#include <stdio.h>
#include <string.h>

#define MAX_ESTUDIANTES 100

// Estructura para un estudiante
struct Estudiante {
    int matricula;
    char nombre[50];
    char carrera[50];
};

// Array de estudiantes para almacenar la colección de estudiantes
struct Estudiante universidad[MAX_ESTUDIANTES];
int contadorEstudiantes = 0;

// Función para añadir un estudiante
void añadirEstudiante(struct Estudiante estudiante) {
    if (contadorEstudiantes < MAX_ESTUDIANTES) {
        universidad[contadorEstudiantes++] = estudiante;
    }
}

// Función para buscar un estudiante por matrícula
void buscarPorMatricula(int matricula) {
    for (int i = 0; i < contadorEstudiantes; i++) {
        if (universidad[i].matricula == matricula) {
            printf("Estudiante encontrado: %s\n", universidad[i].nombre);
            return;
        }
    }
    printf("Estudiante no encontrado.\n");
}

int main() {
    // Añadir estudiantes y buscar por matrícula como demostración
    struct Estudiante estudiante1 = {123, "Juan Pérez", "Ingeniería"};
    añadirEstudiante(estudiante1);
    
    struct Estudiante estudiante2 = {456, "Ana Gómez", "Matemáticas"};
    añadirEstudiante(estudiante2);
    
    buscarPorMatricula(123);
    buscarPorMatricula(999); // No encontrado
    
    return 0;
}

```