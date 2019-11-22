#language:es
#autor: Ivan Ramiro Jimenez
@Tag0
Característica: Registro Automation Demo Site
  como usuario quiero ingresar a la web Automation Demo Site
  a realizar el registro

  @Tag1
  Escenario: Registrarse en la página web
    Dado que Ivan quiere acceder a la Web Automation Demo Site
    Cuando el realiza el registro en la página
      | first_name | last_name | address         | email           | phone      | gender | Hobbies               | skills | languages    | country     | select_country | year | month    | day | password | confirm_password |
      | paco       | alberto   | calle falsa 123 | paco007@correo.com | 9919353 | Male   | Movies,Cricket,Hockey | Java   | Czech,Arabic | Afghanistan | India          | 2000 | December | 1   | Abc123   | Abc123           |

    Entonces el verifica que se carga la pantalla con el - Double Click on Edit Icon to EDIT the Table Row.
