@Suite @ShoppingCart
Feature: CP02 - Validar carrito de compras

  Background: Realizar validacion en el carrito de compras

  Given El usuario navega al sitio web
  When Ingresa credenciales correctas
  
  
  @ShoppinCartlist
  Scenario: 1 - Listar los productos en el carrito de compras
    And agrega productos al carrito de compras
    And da click en el icono del carrito
    Then el sistema deberia listar los productos agregados en el carrito de compras

  @ShoppinCartProcess
  Scenario: 2 - Cuando quiera procesar la compra, se mostrara un mensaje de compra exitosa
    And agrega productos al carrito de compras
    And da click en el icono del carrito
    When completa todo el registro de la orden
    Then El sistema deberia procesar la compra
