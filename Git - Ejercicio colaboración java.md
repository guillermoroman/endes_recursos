
**Título del Proyecto:** Sistema de Gestión de Tareas

**Descripción:** 
Desarrollar un sistema básico de gestión de tareas en Java. El sistema permitirá a los usuarios agregar, eliminar, listar y marcar tareas como completadas. El proyecto se dividirá en varias partes que serán asignadas a cada miembro del equipo.

### Estructura del Proyecto

1. **Clase Principal (`TaskManager`)**: Contendrá el método `main` y se encargará de la interfaz de usuario (interacción por consola).
2. **Clase `Task`**: Representará una tarea individual con atributos como `id`, `nombre`, `descripción`, y `estado` (completada o no).
3. **Clase `TaskList`**: Administrará una lista de tareas, permitiendo agregar, eliminar, listar y marcar tareas como completadas.
4. **Pruebas Unitarias**: Cada clase deberá tener pruebas unitarias utilizando JUnit para asegurar que el código funciona correctamente.

### Reparto del Trabajo

- **Persona 1:** Implementar la clase `Task`.
- **Persona 2:** Implementar la clase `TaskList`.
- **Persona 3:** Implementar la clase `TaskManager`.
- **Persona 4:** Crear y ejecutar las pruebas unitarias para cada clase (puede combinarse con otro rol si solo hay 3 personas).

### Pasos para Colaborar en GitHub

1. **Crear el Repositorio en GitHub**: Un miembro del equipo crea el repositorio
2. **Agregar colaboradores**: Añade a los demás miembros como colaboradores.
   1. Pestaña Settings
   2. Collaborators
3. **Aceptar invitación de colaboración**: Encontrar la invitación en bandeja de entrada de GitHub.
4. **Clonar el Repositorio**: Cada miembro clona el repositorio en su máquina local.
5. **Crear Ramas**: Cada miembro crea una rama para trabajar en su parte del proyecto.
   - `git checkout -b feature/clase-task`
   - `git checkout -b feature/clase-tasklist`
   - `git checkout -b feature/clase-taskmanager`
   - `git checkout -b feature/tests`
6. **Desarrollar y Hacer Commits**: Cada miembro desarrolla su parte del código y hace commits regularmente.
7. **Pull Requests**: Una vez que un miembro ha terminado su parte, abre una pull request (PR) para que los demás revisen su código.
   1. Pestaña Pull Requests.
   2. New Pull Request.
   3. base: main. compare: *rama a incluir*
   4. Create pull request.
   5. Añadir titulo y comentarios. Continuar.
   6. Añadir reviewers (o asignees si se necesitan colaboradores).

8. **Revisar y Fusionar PRs**: Todos los miembros revisan las PRs. Se pueden hacer comentarios y modificar el código fuente. Una vez aprobadas, se fusionan en la rama `main`.
9.  **Integración Continua**: Configurar GitHub Actions para ejecutar las pruebas automáticamente al hacer commits.

### Código de Ejemplo

#### `Task.java`
```java
public class Task {
    private int id;
    private String name;
    private String description;
    private boolean isCompleted;

    public Task(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.isCompleted = false;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void markAsCompleted() {
        this.isCompleted = true;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", isCompleted=" + isCompleted +
                '}';
    }
}
```

#### `TaskList.java`
```java
import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<Task> tasks;
    private int nextId;

    public TaskList() {
        this.tasks = new ArrayList<>();
        this.nextId = 1;
    }

    public void addTask(String name, String description) {
        Task task = new Task(nextId++, name, description);
        tasks.add(task);
    }

    public void removeTask(int id) {
        tasks.removeIf(task -> task.getId() == id);
    }

    public void markTaskAsCompleted(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.markAsCompleted();
                break;
            }
        }
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void listTasks() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }
}
```

#### `TaskManager.java`
```java
import java.util.Scanner;

public class TaskManager {
    private static TaskList taskList = new TaskList();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    removeTask();
                    break;
                case 3:
                    markTaskAsCompleted();
                    break;
                case 4:
                    listTasks();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }

    private static void showMenu() {
        System.out.println("\nGestor de Tareas");
        System.out.println("1. Añadir Tarea");
        System.out.println("2. Eliminar Tarea");
        System.out.println("3. Marcar Tarea como Completada");
        System.out.println("4. Listar Tareas");
        System.out.println("5. Salir");
        System.out.print("Selecciona una opción: ");
    }

    private static void addTask() {
        System.out.print("Nombre de la tarea: ");
        String name = scanner.nextLine();
        System.out.print("Descripción de la tarea: ");
        String description = scanner.nextLine();
        taskList.addTask(name, description);
    }

    private static void removeTask() {
        System.out.print("ID de la tarea a eliminar: ");
        int id = scanner.nextInt();
        taskList.removeTask(id);
    }

    private static void markTaskAsCompleted() {
        System.out.print("ID de la tarea a marcar como completada: ");
        int id = scanner.nextInt();
        taskList.markTaskAsCompleted(id);
    }

    private static void listTasks() {
        taskList.listTasks();
    }
}
```

#### Pruebas Unitarias (Ejemplo con JUnit)

**Dependencia en `pom.xml` para Maven:**
```xml
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.12</version>
    <scope>test</scope>
</dependency>
```

#### `TaskTest.java`
```java
import org.junit.Test;
import static org.junit.Assert.*;

public class TaskTest {
    @Test
    public void testTaskCreation() {
        Task task = new Task(1, "Test Task", "This is a test task");
        assertEquals(1, task.getId());
        assertEquals("Test Task", task.getName());
        assertEquals("This is a test task", task.getDescription());
        assertFalse(task.isCompleted());
    }

    @Test
    public void testMarkAsCompleted() {
        Task task = new Task(1, "Test Task", "This is a test task");
        task.markAsCompleted();
        assertTrue(task.isCompleted());
    }
}
```

#### `TaskListTest.java`
```java
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class TaskListTest {
    private TaskList taskList;

    @Before
    public void setUp() {
        taskList = new TaskList();
    }

    @Test
    public void testAddTask() {
        taskList.addTask("Test Task", "This is a test task");
        List<Task> tasks = taskList.getTasks();
        assertEquals(1, tasks.size());
        Task task = tasks.get(0);
        assertEquals("Test Task", task.getName());
        assertEquals("This is a test task", task.getDescription());
    }

    @Test
    public void testRemoveTask() {
        taskList.addTask("Test Task", "This is a test task");
        taskList.removeTask(1);
        List<Task> tasks = taskList.getTasks();
        assertEquals(0, tasks.size());
    }

    @Test
    public void testMarkTaskAsCompleted() {
        taskList.addTask("Test Task", "This is a test task");
        taskList.markTaskAsCompleted(1);
        List<Task> tasks = taskList.getTasks();
        assertTrue(tasks.get(0).isCompleted());
    }
}
```

