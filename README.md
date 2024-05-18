# LAB | Java JPA Intermedio

## Introducción

Acabamos de aprender cómo usar JPQL y sentencias SQL nativas con Spring JPA para consultar una base de datos, así como cómo modelar la herencia de objetos y objetos de componente con JPA, así que practiquemos un poco más.

<br>

## Requisitos

1. Haz un fork de este repositorio.
2. Clona este repositorio.
3. Añade a tu instructor y a los calificadores de la clase como colaboradores de tu repositorio. Si no estás seguro de quiénes son los calificadores de tu clase, pregunta a tu instructor o consulta la presentación del primer día.
4. En el repositorio, crea un proyecto de Java y añade el código para las siguientes tareas.

## Entrega

Una vez que termines la tarea, envía un enlace URL a tu repositorio o tu solicitud de extracción en el campo de abajo.

<br>

## Instrucciones

1. Modela las relaciones de un software de gestión de tareas utilizando Spring JPA. Supongamos que tienes los siguientes requisitos para el almacenamiento de datos:

- Las tareas tienen un `title`, `dueDate` y un `status` booleano.
- Hay 2 tipos de tareas: `BillableTask` y `InternalTask`.
- Las `BillableTask` tienen un atributo adicional de `hourlyRate`.

2. Modela las relaciones de una compañía de relaciones públicas utilizando Spring JPA. Supongamos que tienes los siguientes requisitos para el almacenamiento de datos:

- La base de datos consta de `Contacts`. Cada contacto tiene un `name`, un `title` y una `company`.
- Los nombres son objetos propios y tienen un `firstName`, `lastName`, `middleName` y `salutation`.
- Los nombres deben estar en la entidad `Contact` y no almacenarse en una tabla separada.

3. Lista 3 tareas que se pueden realizar con SQL nativo que no se pueden hacer con JPQL. Explique por qué elegiría usar SQL nativo en lugar de JPQL para estas tareas específicas.

SQL (Structured Query Language) es un lenguaje diseñado para gestionar y manipular bases de datos relacionales, mientras que JPQL (Java Persistence Query Language) es un lenguaje de consulta orientado a objetos diseñado para operar con la API de Java Persistence. Aunque ambos lenguajes están destinados a interactuar con bases de datos, existen ciertas tareas que se pueden realizar con SQL nativo que no son posibles o son difíciles de ejecutar con JPQL, aquí hay tres ejemplos:

1. **Consultas que involucran funciones específicas del SGBD**:
    - **SQL nativo**: Permite el uso completo de funciones y procedimientos almacenados específicos de un sistema de gestión de bases de datos (SGBD) como MySQL, PostgreSQL, Oracle, etc. Esto incluye funciones de agregación avanzadas, manipulaciones de tipo de datos específicos, y optimizaciones particulares de cada SGBD.
    - **JPQL**: Está diseñado para ser independiente del SGBD, lo que significa que no puede utilizar funciones específicas de la base de datos que no estén definidas en la especificación de JPA. Esto puede limitar la eficiencia y la capacidad de realizar ciertas operaciones directamente en la base de datos.
    - **Motivo para elegir SQL nativo**: Si necesitas utilizar funciones avanzadas o específicas del SGBD que no están disponibles en JPQL, como funciones geométricas en PostGIS de PostgreSQL o manipulaciones especializadas de datos en MySQL.

2. **Consultas que requieren un alto grado de optimización y ajuste fino**:
    - **SQL nativo**: Permite un control detallado sobre las cláusulas SQL, permitiendo ajustes precisos y optimizaciones como hints de optimización, uniones específicas, subconsultas complejas, entre otros.
    - **JPQL**: Si bien permite cierto grado de optimización, está más limitado debido a su abstracción de alto nivel, lo cual puede resultar en generación de consultas menos eficientes para casos complejos.
    - **Motivo para elegir SQL nativo**: En casos donde el rendimiento de la consulta es crítico y se requiere un ajuste detallado que sólo puede ser proporcionado por características específicas del SGBD.

3. **Consultas que implican operaciones de base de datos no estándar como DDL**:
    - **SQL nativo**: Puede ejecutar directamente sentencias de Data Definition Language (DDL- create, alter, drop...) para crear, alterar, o eliminar estructuras de datos en la base de datos. Esto incluye operaciones como alterar esquemas de tablas, crear índices, entre otros.
    - **JPQL**: No soporta operaciones DDL ya que está principalmente enfocado en manipular y consultar objetos de entidad en relación con el modelo de datos.
    - **Motivo para elegir SQL nativo**: Para realizar tareas de mantenimiento o modificación estructural en la base de datos que están fuera del ámbito de la manipulación de datos a través de entidades.

En resumen, el SQL nativo es preferible cuando se necesita un control total sobre las capacidades específicas de la SGDB, optimización a nivel de base de datos, o realizar operaciones DDL directas.

<br>