#language: es
@testStore
  Característica: : Product - Store
Escenario: Validación del precio de un producto

  Dado estoy en la página de la tienda
  Y me logueo con mi usuario "HCC_05@hotmail.com" y clave "contraseña123"
  Cuando navego a la categoria "Clothes" y subcategoria "Men"
  Y agrego 2 unidades del primer producto al carrito
  Entonces valido en el popup la confirmación del "producto agregado"
  Y valido en el popup que el monto total sea calculado correctamente
  Cuando finalizo la compra
  Entonces valido el titulo de la pagina del "CARRITO"
  Y vuelvo a validar el calculo de "precios" en el carrito