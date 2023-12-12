## Ejercicio 1
Se quiere realizar una clase `TempConverter`que convierta grados Fahrenheit a Celsius, y viceversa. Debemos averiguar la fórmula e implementar dos métodos `fahrenheitToCelsius` y `celsiusToFahrenheit` que conviertan grados de una a otra, y viceversa.
Además, se quiere testear que convierten los métodos correctamente los valores -5, 0, 15 y 32. 

---

## Ejercicio 2
Un banco precisa una clase `ClienteBanco` con dos atributos:
- `edad`, de tipo entero.
- `sueldo`, de coma flotante.

Se precisa crear:
- Un constructor
- Un método `emitirTarjeta` que devolverá un String con el tipo de tarjeta otorgada al cliente en función de unos parámetros:
	- Edad mínima para cualquier tarjeta: 18 años.
	- Sueldo necesario para la "Tarjeta Dorada":`[800, 1500)`.
	- Sueldo necesario para la "Tarjeta Platino": `[1500, 3000)`.
	- Sueldo necesario para la "Tarjeta Negra": `[3000,  )`.
	- En caso de no cumplir requisitos, el método devuelve `null`.

Crear una clase de pruebas unitarias con métodos @Test que prueben, mediante aserciones, que el comportamiento del método es el adecuado. Pensad en Particiones de Equivalencia y Valores Límite para elegir los valores que utilizarán los test.

---
## Ejercicio 3
El objetivo de este ejercicio es tomar la clase CCuenta del repositorio y depurar el código hasta lograr que tenga el comportamiento adecuado, sirviéndonos del depurador donde sea necesario, y diseñando una batería de tests para comprobar el funcionamiento.

1. Crear tests que verifiquen el método ingresar.
2. Crear tests que verifiquen el método retirar.

### Subtarea 1:
Crear un pequeño documento donde apuntar los errores que se irán encontrando junto con su solución y un comentario explicativo muy breve.

### Subtarea 2:
Logra solucionar los errores que impiden la compilación del programa.

### Subtarea 3:
Diseña unas pruebas en JUnit teniendo en cuenta los conceptos de Clases o Particiones de Equivalencia, así como el Análisis de Valores límite.

### Subtarea 4
Usa el depurador para, durante la ejecución de las pruebas, encontrar los fallos en los métodos `ingresar` y `retirar`.

Ejecuta las pruebas mediante la ejecución paso a paso, verificando el correcto funcionamiento, indicando los valores que marca la inspección de variables en cada instrucción que consideres necesaria y comentar el resultado de las pruebas.

Debéis encontrar errores lógicos o bugs del sistema, modificarlos para su correcto funcionamiento y comentarlos en el documento que estáis creando.

Incluye en el documento recortes de capturas de pantalla del proceso de depuración donde se puedan observar los valores afectados antes y después del error.

### Subtarea 5
Sube tu proyecto junto con los tests a un repositorio público. Comparte el enlace a tu repositorio con un compañeros y comentad vuestra elección de valores para los tests.