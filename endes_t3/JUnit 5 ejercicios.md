## Ejercicio 1
Se quiere realizar una clase `TempConverter`que convierta grados Fahrenheit a Celsius, y viceversa. Debemos averiguar la fórmula e implementar dos métodos `fahrenheitToCelsius` y `celsiusToFahrenheit` que conviertan grados de una a otra, y viceversa.
Además, se quiere testear que convierten los métodos correctamente los valores -5, 0, 15 y 32. 

---

## Ejercicio 2
Un banco precisa una clase `Gestor de Tarjetas` que contenga el método estático `emitirTarjeta`

`emitirTarjeta` admite dos argumentos (`edad` y `sueldo`) y devuelve un String con el tipo de tarjeta otorgada al cliente en función de unos parámetros:
- Edad mínima para cualquier tarjeta: 18 años.
- Sueldo necesario para la "Tarjeta Dorada":`[800, 1500)`.
- Sueldo necesario para la "Tarjeta Platino": `[1500, 3000)`.
- Sueldo necesario para la "Tarjeta Negra": `[3000,  )`.
- En caso de no cumplir requisitos, el método devuelve `null`.

Crear una clase de pruebas unitarias con métodos @Test que prueben, mediante aserciones, que el comportamiento del método es el adecuado. Pensad en Particiones de Equivalencia y Valores Límite para elegir los valores que utilizarán los test.

