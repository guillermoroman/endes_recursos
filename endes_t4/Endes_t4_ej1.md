

### Ejercicio 1: Renombrado de Variables
- **Código Original**:
    ```java
    class Rectangle {
        int w;
        int h;

        int area() {
            return w * h;
        }
    }
    ```
    **Tarea**: Renombrar `w` y `h` a nombres más descriptivos.

### Ejercicio 2: Extracción de Métodos
- **Código Original**:
    ```java
    class Invoice {
        void printInvoice() {
            // imprimir encabezado
            System.out.println("Encabezado de la Factura");

            // detalles de la factura
            System.out.println("Detalle 1...");
            System.out.println("Detalle 2...");
            // más detalles...

            // imprimir pie de página
            System.out.println("Pie de página de la Factura");
        }
    }
    ```
    **Tarea**: Extraer la impresión del encabezado y pie de página en sus propios métodos.

### Ejercicio 3: Encapsulación de Campos
- **Código Original**:
    ```java
    class Employee {
        public String name;
        public int age;
    }
    ```
    **Tarea**: Cambiar `name` y `age` a privados y crear getters y setters.

### Ejercicio 4: Eliminación de Código Muerto
- **Código Original**:
    ```java
    class Calculator {
        int add(int a, int b) {
            return a + b;
        }

        void unusedMethod() {
            // método sin usar
        }
    }
    ```
    **Tarea**: Identificar y eliminar `unusedMethod`.

### Ejercicio 5: Uso de Constantes
- **Código Original**:
    ```java
    class Circle {
        double calculateArea(double radius) {
            return 3.14159 * radius * radius;
        }
    }
    ```
    **Tarea**: Reemplazar `3.14159` con una constante `PI`.

### Ejercicio 6: Simplificación de Condiciones
- **Código Original**:
    ```java
    class User {
        boolean checkAccess() {
            if (userType == "ADMIN" || userType == "MODERATOR" || userType == "SUPERUSER") {
                return true;
            } else {
                return false;
            }
        }

        String userType;
    }
    ```
    **Tarea**: Simplificar el método `checkAccess`.

### Ejercicio 7: Eliminar Código Duplicado
- **Código Original**:
    ```java
    class ReportGenerator {
        void generateReportA() {
            // configuración común
            System.out.println("Configuración A");
            // reporte específico A
        }

        void generateReportB() {
            // configuración común
            System.out.println("Configuración B");
            // reporte específico B
        }
    }
    ```
    **Tarea**: Eliminar la duplicación en la configuración de los reportes.

### Ejercicio 8: Sustitución de Algoritmos
- **Código Original**:
    ```java
    class StringReplacer {
        String replaceSpaces(String str) {
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    result += "%20";
                } else {
                    result += str.charAt(i);
                }
            }
            return result;
        }
    }
    ```
    **Tarea**: Simplificar `replaceSpaces` utilizando métodos incorporados de `String`.

### Ejercicio 9: Organización de Clases
- **Código Original**:
    ```java
    class User {
        // ...
        void logUserActivity() {
            // logica de registro de actividad
        }
    }

    class ActivityLogger {
        // ...
    }
    ```
    **Tarea**: Mover `logUserActivity` a la clase `ActivityLogger`.

### Ejercicio 10: Refactorización de Bucles
- **Código Original**:
    ```java
    class NumberProcessor {
        void processNumbers(List<Integer> numbers) {
            for (int i = 0; i < numbers.size(); i++) {
                System.out.println(numbers.get(i));
            }
        }
    }
    ```
    **Tarea**: Cambiar el bucle `for` por un bucle `for-each`.

Estos ejemplos te proporcionarán una buena base para practicar las diferentes técnicas de refactorización en Java.
