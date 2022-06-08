#Autor: Elvia Gacha
#language: es

  @HU
  Característica: Ingreso a opencart verificaion de datos
    yo como usuario quiero ingresar a opencart para verificar datos

    Antecedentes:
      Dado que Elvia ingresa a la pagina de Opencart
      Y digito los datos correctos de inicio

    @CasoPrueba1
    Escenario: Inicio de sesion exitoso
    Cuando cierro la notificacion de alerta
    Entonces verifico pagina principal "Dashboard"

    @CasoPrueba2
    Escenario: Agregar un producto a una orden nueva
      Y que estamos en la opcion ordenes de la categoria Ventas
      Cuando agrego un producto a la nueva orden
      Entonces verifico mensaje de exito "Success: You have modified your shopping cart!"


    @CasoPrueba3
    Escenario: eliminar un cupon en la funcuionalidad Marketing
      Y que estamoe en la opcion cupones de la funcionalidad Maketing
      Cuando selecciono y elimino el cupon que se desee eliminar
      Entonces "verifico mensaje de confimacion "Are you sure?"

