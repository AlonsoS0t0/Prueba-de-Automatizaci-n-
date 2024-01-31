#language: es
@testfeature
Característica: Bottom
  Precionar bottom gratis
  y precionar el primer producto

  Escenario: Bottom de envio gratis
    Dado dado Que Me Encuentro En La Pagina Https Juntoz Com
    Y Ingresar la categoría "Envio Gratis"
    Y hago click en el primer producto
    Y luego agrego al Carrito
    Entonces valido los resultados
