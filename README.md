 🌀 NarutoAPI
EN LA CARPETA DEL PROYECTO ENCONTRARAN EL ARCHIVO DE SENTENCIAS SQL PARA CREAR LA BASE DE DATOS CON IMAGENES.

Description

NarutoAPI is a RESTful web service developed in Java using Spring Boot. It connects to a SQL database and provides HTTP endpoints to manage and retrieve information about characters from the Naruto universe.

 Features

- RESTful API with Spring Boot
- SQL database integration via Spring Data JPA
- CRUD operations for Naruto characters
- Clean and modular MVC architecture
- Easily extendable for other anime data

Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- H2 / MySQL (configurable)
- Maven



CONSIGNAS PARA EL PROFE
Explicación de la API NarutoAPI

¿Qué es una API REST?
Una API REST (Application Programming Interface) es como un menú digital que otros programas pueden usar para pedir datos o enviar información.
En este caso, la API está hecha para que otros puedan pedir información sobre personajes del universo Naruto.

¿Qué tecnologías se usan?
Java: el lenguaje de programación.
Spring Boot: un framework (conjunto de herramientas) que facilita crear aplicaciones web.
Spring Data JPA: se encarga de guardar y leer datos de una base de datos sin tener que escribir muchas consultas SQL.
H2 o MySQL: bases de datos donde se guardan los personajes.
Maven: una herramienta que organiza y construye el proyecto.


Estructura del Proyecto (Carpetas y Archivos)
Tu proyecto sigue una estructura típica de Spring Boot. Vamos parte por parte:

1. NarutoApiApplication.java
Es el archivo principal. Acá arranca todo cuando ejecutás la aplicación. Tiene una única línea importante:

2. modelo/Personaje.java
Esta clase representa a un personaje de Naruto. Es una clase llamada “Entidad” o “Modelo”, y se traduce directamente en una tabla de base de datos.

@Entity: le dice a Spring que esta clase se convierte en una tabla de la base de datos.
@Id y @GeneratedValue: crean un campo único (id) que se genera automáticamente.
Cada atributo será una columna en la tabla.

3. repositorio/PersonajeRepository.java
Esta interfaz permite acceder a la base de datos sin escribir SQL.
Es como un “puente” entre tu aplicación y la base de datos.

4. controlador/PersonajeController.java
Esta clase es el “puente” entre internet y tu código. Si alguien visita /personajes, esta clase responde.

¿Qué hace cada parte?
@RestController: esta clase responderá peticiones web.
@RequestMapping("/personajes"): define que todas las rutas comienzan con /personajes.
@GetMapping: devuelve todos los personajes.
@PostMapping: guarda un nuevo personaje (enviado como JSON).
@PutMapping: actualiza uno existente.
@DeleteMapping: elimina un personaje por ID.

¿Cómo probar la API?
Podés usar herramientas como Postman o curl, o incluso una app web para probar APIs.

Ver todos los personajes:
GET http://localhost:8080/

¿Qué hace Spring Boot?
Crea un servidor web automáticamente.
Conecta tu app con la base de datos.
Genera las rutas para los endpoints automáticamente.
Te permite trabajar sin tener que hacer todo “a mano”.

