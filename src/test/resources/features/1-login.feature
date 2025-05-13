@Suite @Login
Feature: CP01 - Validar inicio de sesión

	Background: Validar el inicio de sesion con credenciales validas e invalidas
	
	Given El usuario navega al sitio web
	
	@ValidCredentials
	Scenario: 1 - Validar con credenciales correctas
		When  Ingresa credenciales correctas
		Then La aplicacin muestra el modulo principal de productos
		
	@InvalidCredentials	
	Scenario: 2 - Validar con credenciales incorrectas
		When Ingresa credenciales invalidas
		Then La aplicación muestra un mensaje de error
		

	