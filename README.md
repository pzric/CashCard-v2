# Cash Card Application v2 - Securing Spring Boot API

## Descripción

Este proyecto tiene como objetivo asegurar una API desarrollada con Spring Boot utilizando Spring Security, OAuth 2.0 y autenticación JWT. La aplicación demuestra cómo proteger los puntos finales de una API REST, gestionar la autenticación y autorización de usuarios, y garantizar la seguridad de la aplicación. Además, se han implementado pruebas automatizadas para validar la seguridad y funcionalidad de la API.

## Uso
Una vez que la aplicación esté en funcionamiento, puedes interactuar con la API segura para realizar operaciones autenticadas y autorizadas. La aplicación utiliza tokens JWT para gestionar la autenticación de los usuarios, y se puede integrar con un servidor de autorización para manejar OAuth 2.0.

## Tecnologías Utilizadas

- **Spring Boot:** Framework para crear aplicaciones basadas en Java, simplificando la configuración y el desarrollo.
- **Spring Security:** Framework de seguridad potente y altamente personalizable para la autenticación y autorización en aplicaciones Java.
- **OAuth 2.0:** Protocolo para la autorización segura que permite a los usuarios compartir recursos sin compartir credenciales.
- **JWT (JSON Web Token):** Estándar abierto para la autenticación basada en tokens que se utiliza para representar de forma segura las declaraciones entre dos partes.
- **Gradle:** Herramienta de automatización de la construcción que gestiona dependencias y el ciclo de vida del proyecto.
- **H2 Database:** Base de datos en memoria utilizada para pruebas y desarrollo.
- **Spring Test:** Framework para realizar pruebas unitarias e integradas en aplicaciones Spring.

## Prerrequisitos

Antes de comenzar, asegúrate de tener instaladas las siguientes herramientas:

- Java 17+
- Gradle 7+
- Un IDE como IntelliJ IDEA o Eclipse


## Pruebas
El proyecto incluye una suite de pruebas automatizadas utilizando Spring Test para garantizar que la seguridad de la aplicación funciona como se espera.
###  Tipos de pruebas implementadas:
- **Pruebas de autenticación:** Validan que solo los usuarios autenticados con un token JWT válido pueden acceder a los recursos protegidos.
- **Pruebas de autorización:** Aseguran que los usuarios solo puedan acceder a los recursos permitidos según sus roles y permisos.
- **Pruebas de configuración de seguridad:** Verifican que las configuraciones de Spring Security, como filtros y políticas de seguridad, estén correctamente aplicadas.

## Instalación

   **Para configurar y ejecutar el proyecto localmente, sigue estos pasos**:

1. **Clona el repositorio**:
   ```bash
   git clone https://github.com/pzric/CashCard-v2.git

2. **Navegar al directorio del proyecto**:
   ```bash
   cd CashCard-v2

3. **Construir el proyecto usando Gradle**:
   ```bash
   ./gradlew build

4. **Construir el proyecto usando Gradle**:
   ```bash
   ./gradlew bootRun
   
## Ejecución de las pruebas:
Para ejecutar las pruebas, utiliza el siguiente comando:
   ```console
   ./gradlew test
   ```

## Licencia
Este proyecto está licenciado bajo la Licencia MIT.

## Author ✒️

* **Ricardo Zamora Picazo** - [Ricardo ZP](https://github.com/pzric)
* **Spring Academy** - [Spring Academy](https://spring.academy/)

###  Reconocimientos
  Agradecimientos a la comunidad de Spring y a los recursos educativos que ayudaron a hacer posible este proyecto.



