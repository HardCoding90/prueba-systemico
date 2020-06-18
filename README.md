# prueba-systemico
Prueba técnica Systemico

Recursos Técnicos:
- Desarrollado en un pc portátil lenovo intel i5 de 7th generación, utilizando el IDE Intellij Ultimate 
  con licencia estudiantil.
- Lenguaje: Java 
- Version: Openjdk 1.8.0_232 
- Framework: Spring implementado con Spring Boot

La prueba presentada consta de 4 módulos:
- Gateway-Server: Puerta de entrada para las peticiones.
- Eureka-Server: Balanceador de cargas y registro de servicios.
- Models-Factory: Contiene los modelos utilizados en el sistema.
- Personas: Módulo que contiene la funcionalidad requerida en la prueba.

API:
La prueba técnica ha sido presentada utilizando un proyecto con gestión de dependencias mediante el uso de Maven,
donde la petición es realizada a través del puerto 9094 el cual está configurado por defecto para el gateway, quien 
por medio de los servicios registrados en el discovery, busca y encuentra la ruta correspondiente para 
su ejecución. El siguiente ejemplo es el API Rest correspondiente ejecutando de manera local los servicios:

GET:
http://localhost:9094/personas/personas/obtenerPersonas

Si se requiere desplegar en un servidor remoto se reemplaza el localhost por la ip pública del equipo, siempre y cuando 
la configuración del equipo permita realizar esta prueba.

Según los requerimientos establecidos se retorna un objeto del tipo HashMap<String, List<Person>>().
- El objeto agrupa dos listados de personas en un HashMap con la llave "male" para el listado de hombres y 
"female" para el listado de mujeres. 
- El listado de hombres ha sido ordenado por la edad de menor a mayor, mientras que el listado de las mujeres,
ha sido ordenado de manera descendente usando el correo electrónico como referencia para el ordenado de la lista.

---------------###################################################----------------

¡Hola!

De antemano me permito agradecer por la oportunidad brindada, ya que esta ha sido una prueba que me he tomado muy personal,
y parte de mí está en esta pequeña lógica que he tenido la oportunidad de compartir con ustedes.

Les doy muchas gracias por la atención prestada, y esperando crecer cada día profesionalmente para brindar lo mejor de mí, y 
aprender lo mejor de todos.

Muchas gracias!!!!!!
