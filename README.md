# ForoHub

## Sistema de Gestión de Comentarios

Este proyecto es una aplicación Java desarrollada con Spring Boot para gestionar comentarios en un foro. Permite crear, listar y eliminar comentarios mediante una API REST sencilla.

## Requisitos previos

- Tener Java instalado.
- Maven configurado en el sistema.
- Configuración básica del framework Spring Boot.

# Obtener todos los comentarios

**Endpoint:** `GET /api/comments`
- Devuelve una lista con todos los comentarios registrados.

# Obtener un comentario por ID

**Endpoint:** `GET /api/comments/{id}`
- Busca un comentario por su ID.
- Respuestas:
  - 200 (OK): Devuelve el comentario si existe.
  - 404 (Not Found): Si el comentario no se encuentra.

# Crear un nuevo comentario

**Endpoint:** `POST /api/comments`
- Crea un nuevo comentario.
- Entrada: Un JSON con los detalles del comentario.
- Respuesta:
  - 201 (Created): Retorna el comentario creado.

# Eliminar un comentario

**Endpoint:** `DELETE /api/comments/{id}`
- Elimina un comentario por su ID.
- Respuesta:
  - 204 (No Content): Si la operación fue exitosa.

**Requisitos:**
   - Java Development Kit (JDK) versión 8 o superior.
   - Un entorno de desarrollo (IDE) como IntelliJ IDEA o Eclipse.

## Notas

- **Validación:** Asegúrate de enviar datos válidos al crear comentarios.
- **Seguridad:** Considera agregar autenticación para entornos de producción.

¡Explora la API y gestiona comentarios fácilmente!
