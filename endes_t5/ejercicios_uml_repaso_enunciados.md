# Ejercicio repaso 1 - Aplicación de música

### Objetivo:
Desarrollar un diagrama de clases que represente el modelo de datos para una aplicación de música.

### Descripción:
Se requiere diseñar un sistema para una aplicación de música que permita a los usuarios explorar y reproducir canciones. El sistema debe tener las siguientes entidades y relaciones:

### Clases:

* **Canción**: Representa cada pieza musical disponible en la aplicación. Debe incluir atributos como título, duración y género.

* **Artista**: Representa a los creadores de las canciones. Cada artista tiene un nombre, una lista de géneros en los que se especializa y una lista de canciones que ha producido.

* **Álbum**: Agrupa varias canciones en una colección. Cada álbum está asociado a un artista específico y contiene una lista de canciones. Además, debe tener atributos como el nombre del álbum y el año de lanzamiento.

* **Reproductor**: Es la interfaz a través de la cual los usuarios interactúan con la música. No necesariamente se refiere a un objeto físico, sino a un componente del sistema que gestiona la reproducción de las canciones. Cada reproductor contará con una canción actual y una cola (lsita) de reproduccion con distintas canciones.

### Relaciones:

* Un álbum está compuesto por varias canciones. Si se elimina el álbum, las canciones asociadas a este también deberán eliminarse.

* Una canción puede estar asociada con uno o más artistas, pero debe existir al menos un artista principal para cada canción.

* El reproductor permite seleccionar y reproducir canciones. Considera si cada usuario tiene su propio reproductor o si es un componente compartido en la aplicación.

### Tarea:
Diseña un diagrama de clases que incluya todas estas entidades y sus relaciones. Asegúrate de especificar claramente los tipos de relaciones (asociación, agregación, composición, herencia...) y de incluir atributos relevantes para cada clase.

# Ejercicio repaso 2: Sistema de Reservas para Hoteles

### Objetivo:
Diseñar un diagrama de clases para un sistema de reservas de hoteles que gestione la información de hoteles, habitaciones, clientes y reservas.

### Descripción:
Se solicita el diseño de un sistema que permita a los usuarios realizar y gestionar reservas de habitaciones en diferentes hoteles. El sistema debe tener las siguientes entidades y relaciones:

### Clases:

1. **Hotel:** Representa un hotel en el sistema. Debe incluir atributos como nombre del hotel, dirección y lista de habitaciones disponibles.
   
2. **Habitación:** Representa una habitación individual dentro de un hotel. Cada habitación tiene un tipo que será necesariamente uno de los tres siguientes: suite, doble, individual. También tendrá un precio por noche.
   
3. **Cliente:** Representa a los usuarios del sistema que pueden realizar reservas. Debe incluir detalles como nombre, dirección de correo electrónico y historial de reservas.
   
 4. **Reserva:** Encapsula la información de una reserva realizada por un cliente. Debe incluir un id, el cliente, la habitación reservada, la fecha de check-in, la fecha de check-out y el estado de la reserva (activa o no).

**Relaciones:**

- Un hotel está compuesto por varias habitaciones. Si se elimina el hotel, las habitaciones asociadas también deben eliminarse.
  
- Una reserva está vinculada al cliente que la realizó. Cada reserva se vinculará solo con una habitación, pero un cliente puede realizar varias reservas.
  
- Una reserva debe estar vinculada a una habitación específica dentro de un hotel.

- El hotel guarda información de sus clientes en su base de datos.

- El sistema de gestiones está diseñado para un hotel. El hotel guardará información sobre sus reservas en la base de datos.

**Tarea:**
Crea un diagrama de clases que refleje todas estas clases, sus atributos y relaciones. Asegúrate de especificar los tipos de relaciones (asociación, agregación, composición) y de incluir atributos adecuados para cada clase.
