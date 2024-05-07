# Ejercicios Diagramas de Secuencia - Pasarela de Pago

En este ejercicio, se te pide que diseñes un diagrama UML de secuencia para simular el proceso de compra en un sitio web de comercio electrónico, concretamente la parte correspondiente al pago de los contenidos de carrito.

El caso de uso comienza con el usuario en la página de visualización de carrito. El usuario deberá confirmar su pedido, lo cual disparará el proceso de pago.

El cliente pude elegir el sistema de pago (tarjeta, transferencia, paypal, por ejemplo), y el sistema deberá verificar la validez del sistema elegido

**Nota**: Podríamos mostrar caminos alternativos para distintos tipos de pago, pero solo vamos a mostrar el camino para el pago con tarjeta para simplificar el diagrama en este caso.

Para la solución del ejercicio se considerarán como entidades, además del usuario:
* Tienda Web. Se ha aunado aquí toda la lógica de la misma; desde la interfaz a nuestra base de datos.
* Pasarela de pago
* Banco
* Proveedor de correo
* Almacén. Se ocupa solo del envío del producto.


## Notas sobre la solución:

Nótese que en este caso existen mensajes asíncronos, como actualizar inventario, envío de correo de confirmación y odenar envío, que no requieren respuesta para poder avanzar en la secuencia.

El mensaje de actualización de inventario es reflexivo en este caso: va de la tienda a la propia tienda. Si se hubiera decidido desglosar la entidad `Tienda Web` en varias partes, como `Interfaz web` y `Base de datos` o `Controlador de stock`, etc., este mensaje iría entre la interfaz y quien se ocupe de actualizar el stock.

