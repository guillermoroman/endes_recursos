## Recursos de aprendizaje recomendados

### Oh my Git!
Juego para practicar el uso de comandos.
https://ohmygit.org
### Learn Git Branching
Juego que cuenta con idioma español para practicar el uso de comandos y visualizar el uso de ramas.
https://learngitbranching.js.org
Para cambiar el idioma, una vez comenzado un juego, click en el icono de globo terráqueo en la esquina inferior derecha.
### Tutorial Pull Requests
Tutorial original de GitHub sobre uso básico de Pull Requests
https://docs.github.com/es/get-started/start-your-journey/hello-world
### Ejercicio interactivo pull requests
https://github.com/skills/review-pull-requests



## Software recomendado

### GitKraken
GitKraken es una herramienta gráfica (**GUI**) para el control de versiones Git, diseñada para facilitar el manejo de repositorios y flujos de trabajo en Git. Ofrece una interfaz visual intuitiva que simplifica muchas de las operaciones comunes de Git, como commit, push, pull, branch, merge, y rebase.
### Git Graph
Extensión para Visual Studio Code que permite visualizar las ramas de un proyecto.
 
## "Chuletas"
En español:
* https://training.github.com/downloads/es_ES/github-git-cheat-sheet.pdf
* https://www.developerro.com/2023/01/11/git-cheatsheet/
* https://elbauldelprogramador.com/mini-tutorial-y-chuleta-de-comandos-git/
* https://tutoriales.online/chuletas/git
En inglés:
* https://about.gitlab.com/images/press/git-cheat-sheet.pdf
Fondos de pantalla:
* https://dev.to/doabledanny/git-cheat-sheet-50-commands-free-pdf-and-poster-4gcn

## Guía de estilo para commits
https://midu.dev/buenas-practicas-escribir-commits-git/
## Flujo de GitHub
https://docs.github.com/es/get-started/using-github/github-flow

## Ramas o Branches
Las ramas (branches) en Git son increíblemente livianas. Son sólo referencias a un commit específico - nada más. Por ello tantos entusiastas de Git siguen el mantra:

```
crea ramas pronto y frecuentemente
```

Como no hay consumo extra de almacenamiento ni memoria al crear varias ramas, lógicamente es más fácil dividir tu trabajo que trabajar solamente con un par de ramas grandes.

Cuando empecemos a mezclar ramas y commits, vamos a ver cómo se combinan estas dos herramientas. Por ahora, en cambio, simplemente recuerda que una rama esencialmente dice "Quiero incluir el trabajo de este commit y todos su ancestros".

## Deshacer
Trabajar con Git implica muchas veces la necesidad de "deshacer" acciones, y las instrucciones `checkout`, `revert` y `reset` son esenciales para manejar diferentes situaciones. Aquí explicamos cómo y cuándo usar cada una:
### 1. `git checkout`
Esta instrucción se usa principalmente para cambiar de una rama a otra o revertir archivos a un estado anterior. Por ejemplo, para descartar los cambios no guardados en un archivo específico, puedes usar:

`git checkout -- <archivo>`

Esto restablecerá el archivo a su último estado guardado (commit). Sin embargo, desde la versión 2.23 de Git, se recomienda usar `git restore` para este propósito, ya que `checkout` se usa más comúnmente para cambiar entre ramas.
### 2. `git revert`
Cuando necesitas deshacer un commit público, `git revert` es la opción adecuada. Esta instrucción crea un nuevo commit que invierte los cambios introducidos por un commit anterior. Por ejemplo:

`git revert <commit>`

Es seguro para usar en entornos colaborativos, ya que no altera el historial de commits existente, lo que significa que no afectará al trabajo de otras personas que también estén trabajando en el mismo repositorio.
### 3. `git reset`
`git reset` se usa para deshacer commits en el historial local de tu repositorio. Dependiendo del modo que utilices (`--soft`, `--mixed`, `--hard`), puedes controlar exactamente qué se deshace:
- `--soft`: Los cambios de los commits deshechos permanecen en el área de staging (preparados para el próximo commit).
- `--mixed` (defecto): Los cambios vuelven al working directory, sin estar preparados.
- `--hard`: Elimina todo el historial y modificaciones al estado especificado, perdiendo todos los cambios en el working directory que no se hayan guardado.

Un ejemplo de uso podría ser:

`git reset --hard <commit>`

Este comando es poderoso y debe usarse con precaución, especialmente con `--hard`, ya que elimina los cambios de manera irreversible.
### Video explicativo (inglés)
Checkout, revert, reset 
https://youtu.be/RIYrfkZjWmA?si=LYJflGjTrrZIxUME


## Git Fork

## Git Pull Request

## Colaborar en GitHub

### Configurar un proyecto para colaborar
Configurar un repositorio para colaborar entre varios programadores en GitHub (o en plataformas similares como GitLab o Bitbucket) implica varias decisiones y configuraciones para asegurar un flujo de trabajo eficiente y seguro. Aquí te explico cómo hacerlo, quién debe crearlo, cómo gestionar el acceso, y la diferencia entre repositorios públicos y privados:

#### 1. Creación del Repositorio
Cualquiera que tenga una cuenta en la plataforma elegida (GitHub, GitLab, etc.) puede crear el repositorio. Generalmente, el administrador del proyecto o la persona a cargo de la infraestructura técnica lo hace. Esta persona también será responsable de configurar los permisos iniciales y de mantener el repositorio.

#### 2. Configuración de Acceso
El creador del repositorio puede configurar quién tiene acceso y a qué nivel. Los niveles de acceso típicos en GitHub, por ejemplo, incluyen:

- **Read**: Puede clonar el repositorio y ver el código, pero no puede hacer cambios.
- **Write**: Puede clonar, hacer push y modificar el código, pero no puede alterar la configuración principal del repositorio.
- **Admin**: Tiene control total sobre el repositorio, incluyendo la capacidad de cambiar configuraciones y gestionar permisos de seguridad.

Para agregar colaboradores:

1. Ve al repositorio en GitHub.
2. Navega a "Settings" > "Manage access".
3. Haz clic en "Invite a collaborator" e introduce el nombre de usuario o correo electrónico de la persona a la que deseas agregar. Luego selecciona el nivel de permiso apropiado.


### Pasos como programador

1. Pull para obtener la versión más actual del repositorio, por si algún compañero ha hecho cambios desde el último pull.

```bash
git pull origin main
```

2. Crear una rama y movemos nuestra cabecera a la misma para preservar la rama `main` intacta de momento.

```bash
git checkout -b nombreRama
```

3. Realizamos las modificaciones y adiciones deseadas. Podemos preparar archivos para commit, hacer commits, etc. No habrá conflictos dado que son cambios en local en una rama que de momento solo tenemos nosotros.
4. Podemos hacer un push para subir el trabajo al repositorio remoto, pero se mantendrá todavía dentro de esta nueva rama. Ahora mis colaboradores pueden ver el código y decidir si queremos hacer un merge a la rama main, tras lo cual todos deberán actualizar su rama main desde el repositorio en GitHub.

En GitHub aparecerá el botón `Compare & Pull Request`