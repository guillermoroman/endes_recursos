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
Tomando la clase CCuenta del repositorio, depurar el código hasta lograr que tenga el comportamiento adecuado.

1. Crear un test que verifique el método ingresar.
2. Crear un test que verifique el método retirar.

que existe en el Realizar un programa principal llamado Main.java que cree un objeto con la clase CCuenta, y verifique el correcto funcionamiento de la clase. Para ello debéis realizar las siguientes operaciones:

- Diseñar un caso de prueba que permita verificar el método ingresar.

- Diseñar un caso de prueba que permita verificar la función retirar.
Ejecutar las pruebas mediante la ejecución paso a paso, verificando el correcto funcionamiento, indicando los valores que marca la inspección de variables en cada instrucción que consideréis necesaria y comentar el resultado de vuestras pruebas.

Debéis encontrar errores lógicos o bugs del sistema, modificarlos para su correcto funcionamiento y comentarlos en el documento que estáis creando.

Incluir pantallazos de los resultados de netbeans, de donde poneis los puntos de interrupción y por que, de como accedéis a los métodos o como los saltais, explicar como arrancais la aplicación para iniciar la depuración, o como salta la depuración de un método a otro, etc.