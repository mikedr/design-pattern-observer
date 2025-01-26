# Problema
Eres el encargado de desarrollar un sistema de notificaciones para un foro en línea. El sistema debe permitir que los usuarios se suscriban a diferentes temas (topics) y reciban notificaciones cada vez que se publique un nuevo mensaje en el tema al que están suscritos.

## Requisitos:
- Clase Topic: Representa un tema en el foro. Debe permitir:

  - Registrar usuarios que quieren recibir notificaciones.
  - Eliminar usuarios de la lista de notificaciones.
  - Notificar a los usuarios registrados cuando se publique un nuevo mensaje.
  - Interfaz Observer: Define el contrato que deben implementar los observadores (usuarios) para recibir notificaciones.


- Clase User: Representa a un usuario del foro. Los usuarios deben implementar la interfaz Observer para recibir notificaciones. Cuando reciben una notificación, deben imprimir en consola el mensaje recibido y el nombre del tema.

## Lógica del sistema:

Los usuarios deben poder suscribirse o desuscribirse de varios temas.
Cuando se publique un nuevo mensaje en un tema, solo los usuarios suscritos a ese tema deben ser notificados.