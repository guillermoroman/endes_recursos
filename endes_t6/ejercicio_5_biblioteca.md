## Descripción del problema

Se desea desarrollar una aplicación para la gestión de una biblioteca.
- La bilbioteca será utilizada por diferentes actores: alumnos, bibliotecarios y la base de datos de la biblioteca.
- El bibliotecario puede añadir, borrar y editar los libros que existen en el catálogo. Cada una de estas acciones hace uso de la acción "Actualizar catálogo".
- La base de datos podrá, de forma autónoma, mandar una notificación de retraso y enviar un mensaje para notificar de que un libro está disponible.
- Los usuarios pueden ser de tipo estudiante o profesorado. Todos pueden realizar las mismas acciones, pero los diferenciaremos porque tendrán distintos límites de plazo y cantidad en los préstamos.
- Los usuarios pueden realizar numerosas acciones:
  - Entrar en el sistema con usuario y contraseña. Recibirán un mensaje de error si no se encuentran los datos.
  - Reservar un libro
  - Iniciar un préstamo
  - Renovar un préstamo
  - Pagar una multa
  - Dar feedback, que genera un formulario de feedback.
  - Registrarse, lo cual genera un formulario de registro, y se otorga una tarjeta de biblioteca.