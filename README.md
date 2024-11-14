Desarrolla una aplicación Android que muestre un listado de personajes de Super Mario Bros y que, al seleccionar uno, se abra una segunda pantalla que muestre los detalles completos del personaje.

##    Apartado A: Creación del listado de personajes con RecyclerView.
        Objetivo: Implementar un listado de personajes que muestre una imagen y una breve descripción de cada personaje.
        Componentes gráficos:
            RecyclerView para mostrar la lista.
            CardView para cada elemento del RecyclerView. Dentro de cada CardView, añade:
                ImageView para la imagen del personaje.
                TextView para el nombre del personaje (Texto: "Mario", "Luigi", "Peach", "Toad").
        Detalles importantes:
            Implementa un Adapter para gestionar los datos y enlazar la lista con el RecyclerView.
            Cada tarjeta debe ser clicable para llevar al usuario a la pantalla de detalles (Apartado B).

##    Apartado B: Pantalla de detalles del personaje
        Objetivo: Al seleccionar un personaje del listado, abrir una nueva pantalla que muestre información detallada del personaje seleccionado.
        Componentes gráficos:
            ImageView: Imagen grande del personaje seleccionado.
            TextView: Nombre del personaje (Texto: "Mario", "Luigi", "Peach", "Toad").
            TextView: Breve descripción del personaje (por ejemplo: "Héroe del Reino Champiñón", "Hermano de Mario", etc.).
            TextView: Habilidades o características del personaje (por ejemplo, para Mario: "Salta alto", "Héroe del Reino Champiñón").
        Detalles importantes:
            Esta segunda pantalla debe abrirse cuando el usuario toque un personaje en el RecyclerView.
            El botón de retroceso debe devolver al listado de personajes.

##    Apartado C: Aplicación de temas y estilos
        Objetivo: Aplicar un diseño personalizado a la aplicación utilizando un archivo de estilos.
        Tareas:
            Crear un estilo con colores, tamaño de fuente, fuente de texto, etc.
            Aplica el estilo a los diferentes elementos de la interfaz (RecyclerView, TextViews, buttons).
        Detalles importantes:
            Utiliza el archivo de estilos creado (styles.xml) para dar estilo a los componentes gráficos.

##    Apartado D: Menú contextual con "Acerca de..."
        Objetivo: Añadir un menú contextual con una opción "Acerca de..." que muestre información sobre la aplicación.
        Componentes gráficos:
            Icono de menú en la barra superior (AppBar).
            Menu (menu.xml) con un ítem llamado "Acerca de...".
            Dialog o AlertDialog que se mostrará al seleccionar "Acerca de..." en el menú, con el icono de la APP y el siguiente texto: "Aplicación desarrollada por [tu nombre]. Versión 1.0."
        Detalles importantes:
            El menú debe aparecer como ícono en la esquina superior derecha de la pantalla principal (RecyclerView).
            Al seleccionar "Acerca de...", se debe abrir un Dialog con la información mencionada.

##    Apartado E: Soporte multiidioma (Español/Inglés)
        Objetivo: Hacer que la aplicación soporte múltiples idiomas, inglés y español, basándose en el idioma local del dispositivo.
        Componentes gráficos:
            Strings.xml en dos versiones:
                values/strings.xml para el idioma español.
                values-en/strings.xml para el idioma inglés.
        Detalles importantes:
            Todos los textos de las app deben estar en estos archivos. No puede haber ningún texto literal de la app en el código.

##    Apartado F: Documentación del código (Clases y funciones)
        Objetivo: Documentar el código para que sea fácil de entender por otros desarrolladores.
        Detalles importantes:
            Asegúrate de comentar las clases, métodos y funciones utilizando el formato JavaDocs, explicando:
                Propósito de la clase.
                Explicación de los parámetros de las funciones.
                Lo que devuelve cada método, si aplica.

##    Apartado G: Mensajes al usuario
        Objetivo: Añadir mensajes al usuario para mejorar la experiencia del usuario.
        Tareas:
            Añadir un mensaje de Snackbar al cargar la lista de elementos que diga "Bienvenidos al mundo de Mario".
            Añadir un Toast al abrir la pantalla de detalles, diciendo "Se ha seleccionado el personaje Nombre_personaje".

##    Apartado H: Pantalla Splash e icono de la App
        Objetivo: Crear una pantalla de inicio que se muestre al abrir la aplicación y añade un icono personalizado a la App.
        Componentes gráficos Splash:
            ImageView con el logo de la aplicación (puedes usar el logo de Super Mario Bros o uno personalizado).
        Detalles importantes:
            La pantalla de Splash debe mostrarse durante al menos 2-3 segundos al iniciar la aplicación y luego debe redirigir automáticamente al RecyclerView del listado de personajes.

##    Apartado I: Menú lateral
        Objetivo: Crear un menú lateral "Navigation drawer" con diferentes opciones.
        Opciones del menú:
            Home: Pantalla con la lista de personajes de Super Mario ya creada.
            Ajustes: Listado de ajustes de la app con SharedPreferences.
                Idioma: Switch que permita cambiar de inglés a español.
        Ejemplo:
            En mi cuenta de GitHub podéis encontrar un ejemplo de código.

Para realizar esta entrega utilizaremos Git y GitHub, un control de versiones y un repositorio de código online. Visita la información de interés y verás un tutorial de como publicar y compartir código en GitHub.

Se entregará:

    Un video enseñando la ejecución de la App en un emulador o dispositivo Android.
    Un enlace al código de GitHub.

Recuerda pulsar sobre el menú "Build" la opción "Clean Project", para que el proyecto sea más ligero. 