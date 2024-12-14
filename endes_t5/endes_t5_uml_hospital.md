
Imagina que necesitas diseñar un sistema para un hospital que maneje la información de sus estructuras internas y procesos. El hospital está dividido en distintas secciones, cada una con una capacidad limitada de pacientes. El hospital cuenta con equipos de doctores, y cada doctor puede ser parte de un equipo o trabajar individualmente. Además, cada doctor tiene una especialidad y puede atender a varios pacientes.

Cada paciente en el hospital tiene un historial médico único que incluye información sobre enfermedades previas, recetas y alergias. Este historial es vital y debe ser accesible solo a través del paciente al que pertenece.

Para representar esta estructura, necesitarás un diagrama de clases UML que incluya las siguientes entidades:

- **Hospital**: Tiene un nombre, dirección y teléfono. Además, puede añadir o quitar secciones según sea necesario.
- **Sección**: Cada sección tiene un nombre y una capacidad máxima de pacientes. Debe poder agregar y eliminar pacientes.
- **Equipo**: Un equipo está compuesto por varios doctores y puede obtener la lista de sus miembros.
- **Doctor**: Cada doctor tiene un ID, nombre y especialidad, y puede atender a pacientes. Además, hay dos tipos de doctores: titulares y en prácticas. Los doctores titulares pueden emitir recetas, mientras que los doctores en prácticas todavía están aprendiendo.
- **Paciente**: Tiene un ID, nombre, fecha de nacimiento y teléfono, y está asociado con una sección y un historial médico.
- **Historial Médico**: Contiene detalles como enfermedades, recetas y alergias del paciente.

Tu tarea es crear un diagrama de clases UML para este sistema de hospital, mostrando las relaciones entre estas entidades, como asociaciones y composiciones, e incluyendo atributos y métodos relevantes para cada clase.