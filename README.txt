<!-- Esto basicamente es lo que sirve para correr desde consola y el include te cambia dependiendo de la nomenclatura que tu le des a tus clases test -->
<artifactId>maven-surefire-plugin</artifactId>
<version>2.22.2</version>
<configuration>
<includes>
<include>**/*Test.java</include>
</includes>
<systemPropertyVariables>
<application.properties>/application.properties</application.properties>
</systemPropertyVariables>
</configuration>
</plugin>
//Plugin para poder correr todos los archivos que sean del tipo ...Test.java desde consola


Selenium, que es?

Version 1-> Javascript interactions to actually talk to the browser
Version 2-> JSON Wire protocol
Version 4 -> Soon W3C support

Para saber si las interacciones sirven para determinado navegador -> webdriver-herald.herokuapp.com

ExplicitWait -> Se asegura que el browser esté en determinado estado al encontrar un elemento

XPATH - IMPORTANTE

'/' SELECCIONA DEL NODO RAIZ
'//' SELECCCIONA NODOS EN EL DOCUMENTO DEL NODO ACTUAL, QUE COINCIDAN CON LA SELECCION, NO IMPORTA DONDE ESTÉN
'.' O TAMBIEN LLAMADO PERIOD, SELECCIONA EL NODO ACTUAL
'..' DOUBLE PERIOD, SELECCIONA EL PADRE DEL NODO ACTUAL
'@' PERMITE SELECCIONAR ATRIBUTOS
'*' COINCIDE CON CUALQUIER ELEMENTO NODO

locators cheat sheet --> https://www.automatetheplanet.com/selenium-webdriver-locators-cheat-sheet/
