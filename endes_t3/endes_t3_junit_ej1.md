# ENDES T3 ej 1

Un banco precisa una clase `ClienteBanco` con dos atributos:
- `edad`, de tipo entero
- `sueldo`, de coma flotante.
Se precisa crear:
- Un constructor
- Un método `emitirTarjeta` que devolverá un String con el tipo de tarjeta otorgada al cliente en función de unos parámetros:
	- Edad mínima para cualquier tarjeta: 18 años.
	- Sueldo necesario para la "Tarjeta Dorada":`[800, 1500)`.
	- Sueldo necesario para la "Tarjeta Platino": `[1500, 3000)`.
	- Sueldo necesario para la "Tarjeta Negra": `[3000,  )`.
	- En caso de no cumplir requisitos, el método devuelve `null`.