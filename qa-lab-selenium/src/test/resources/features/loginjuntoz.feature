#language: es
@testfeature
Característica: Login
  Yo, como usuario
  Quiero, tener una opción para iniciar sesión
  Para ver todos los items

  @test
  Escenario: Iniciar sesión
    Dado que me encuentro en la página de login de juntoz
    Cuando inicio sesión con las credenciales usuario: "alonso.sotomayor.monteo@gmail.com" y contraseña: "a123456789"
    Entonces debera aparecer el nombre en la parte superior "Alonso"
