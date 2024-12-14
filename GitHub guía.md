![[Pasted image 20231107050406.png]]

# Configuración inicial
https://kbroman.org/github_tutorial/pages/first_time.html

## 1.Crear cuenta en GitHub
https://github.com/
## 2. Descargar e instalar Git
### 2.1. Descargar:
https://git-scm.com/
### 2.2. Guía de instalación:
https://git-scm.com/book/es/v2/Inicio---Sobre-el-Control-de-Versiones-Instalaci%C3%B3n-de-Git

## 3. Setup username y email
```
git config --global user.name "Your name here"
```
```
git config --global user.email "your_email@example.com"
```

## 4. Personalización
```
git config --global color.ui true
```
```
git config --global core.editor "code --wait"
```

## 5. Configurar SSH
### 5.1. Configurar claves públicas
```
ssh-keygen -t rsa -C "your_email@example.com"
```

### 5.2. Copiar a portapapeles
```
pbcopy < ~/.ssh/id_rsa.pub
```
En Windows, utilizar el comando
```
clip < ~/.ssh/id_rsa.pub
```


## 6. Cambiar rama local por defecto de master a main.
`git config --global init.defaultBranch main`

# Bash - Comandos básicos

### Navegación entre Directorios:

- `pwd`: Muestra la ruta del directorio actual.
- `ls`: Lista el contenido del directorio actual.
- `ls -l`: Lista el contenido en formato largo.
- `ls -a`: Lista todos los archivos, incluyendo los ocultos.
- `cd nombre_directorio`: Cambia al directorio especificado.
- `cd ..`: Sube un nivel de directorio.
- `cd`: Cambia al directorio personal del usuario.

### Manipulación de Archivos y Directorios:

- `touch nombre_archivo`: Crea un nuevo archivo vacío o actualiza la marca de tiempo de un archivo existente.
- `mkdir nombre_directorio`: Crea un nuevo directorio.
- `cp origen destino`: Copia archivos o directorios.
- `mv origen destino`: Mueve o renombra archivos o directorios.
- `rm nombre_archivo`: Elimina un archivo.
- `rm -r nombre_directorio`: Elimina de manera recursiva un directorio y su contenido.
- `cat nombre_archivo`: Muestra el contenido de un archivo.
- `more nombre_archivo` o `less nombre_archivo`: Visualiza el contenido de un archivo página por página.
- `code nombre_archivo`: Edita un archivo usando el editor de texto `VSCode`.
- `echo "texto" > nombre_archivo`: Escribe texto en un archivo (sobrescribe el contenido existente).
- `echo "texto" >> nombre_archivo`: Añade texto al final de un archivo.

# Git - comandos básicos
- `git --version` Nos indica la versión en la que nos encontramos.
- `git clone "URL"` Acepta una URL SSH o HTTPS para clonar un repositorio.
- `git remote -v` muestra la URL SSH del repositorio en GitHub
- `add hello_world.txt` Añade el archivo `helloworld.txt`a la fase de preparación (stage) (lo prepara para el commit).
- `git add .` añade todos los archivos que han sufrido cambios a la fase de preparación (stage).
- `git status`Nos indica qué archivos han cambiado pero no se han preparado, cuales están preparados per no se han enviado, etc.
- `git commit -m "Añadir hello_world.txt"` Hace un commit (guarda) todos los archivos preparados (staged) y adjunta el mensaje "Añadir hello_world.txt".
- `git push origin main`  o `git push origin master`envía nuestros cambios; sincroniza nuestro git con el repositorio en GitHub.  Origin es el nombre de nuestra conexión remota. Por defecto y como costumbre, su nombre es origin pero se puede cambiar. Se podría ejecutar solo `git push`ya que no trabajamos con otra rama.
- `git log` Ver el historial de cambios realizados.
- `git init` Crea un nuevo repositorio git en el directorio actual.

# Git - Crear un repositorio localmente
Elegimos una carpeta, que puede estar vacía o no.
- `git init` Para crearlo. Aparece una carpeta oculta; podemos cambiar la configuración en el explorador de archivos para verla.

# Git - Volver a un commit anterior:
- `git log`para ver el historial de commits
- `git checkout código`para volver a una versión anterior.
- Si ejecutamos `git log` Veremos que sigue trayendo `HEAD`, pero no `master` o `main`.
- `git branch`nos muestra las ramas actuales.
- `git switch master` para volver atrás, al commit más reciente.
- `git switch -c "rama2"` si queremos crear una rama desde el commit en que nos encontramos, tras haber hecho un `git checkout`.
- `git log`de nuevo para ver que nuestra `HEAD`está en rama2.
- si tecleamos `git branch`veremos que estamos en la rama2.

Podemos ver los cambios que aparecen en el archivo modificado cada vez que pedimos a Git cambiar de master a rama y viceversa.

# Atomic comments
Cada commit se debería centrar en la adición de cambios relacionados con una sola característica del programa. Así es más fácil deshacer si es preciso, y los mensajes son más descriptivos.
- En inglés se utiliza el imperativo:
`git commit -m "Add new method to print on screen"
- En español se utiliza el infinitivo:
`git commit -m "Añadir nuevo método para imprimir por pantalla"

# Guía Markdown
https://docs.github.com/es/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax

# Guías en inglés
https://www.theodinproject.com/lessons/foundations-git-basics
https://kbroman.org/github_tutorial/
