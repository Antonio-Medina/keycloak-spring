# Keycloak-Spring
Esta aplicación es un microservicio demo que ejemplifica la seguridad de endpoints mediante token jwt tipo Bearer y roles de acceso usando Keycloak y Spring Boot 3.

## Requerimientos
* Keycloak debe estar corriendo en el puerto 9090.
* Se necesita el JDK 17 para ejecutar esta app.

## Ejecución y configuración de Keycloak
1. **Crear y levantar el contenedor de Keycloak:**

    Ejecutar el siguiente comando: `docker run --name keycloak -p 9090:9090 -e KEYCLOAK_ADMIN=admin -e   KEYCLOAK_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:24.0.1 start-dev`

2. **Configurar el puerto 9090 para Keycloak:**

    * Entrar al file system del contenedor de Keycloak.
    * Abrir el archivo `/opt/keycloak/conf/keycloak.conf`
    * Al final del archivo agregar la linea `http-port=9090` y guardar el archivo.
    * Reiniciar Keycloak.
    * Entrar al `localhost:9090` desde el navegador, si no puede acceder significa que Keycloak no se configuró correctamente o no está en ejecución.
    * Configurar los realms, clientes, usuarios y roles en Keycloak, me apoyé del siguiente video: https://www.youtube.com/watch?v=zR3igUft1KA&list=LL&index=2&t=5810s&ab_channel=UnProgramadorNace