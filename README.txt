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
'contains(text(),<<string>>)' EJEMPLO QUE PERMITE ENCONTRAR UN TEXTO BY UN XPATH
'parent' PADRE DIRECTO DEL ELEMENTO
'sibling' AL MISMO NIVEL, HERMANO DIRECTO
'children' UN NIVEL MÁS ABAJO, HIJO DIRECTO
COMPUND CLASSES (ATRIBUTO CLASS QUE TIENE ESPACIO) NO SE PUEDEN SELECCIONAR CON BYCLASSNAME-SOLO SE PUEDE USAR XPATH
'[@atributo='nombre'][@atributo2='nombre2']' EJEMPLO PARA SELECCIONAR MÁS DE UN ATRIBUTO

CSS VS XPATH
XPATH
- Puede recorrer el DOM de hijo a padre, para arriba y para abajo
- Puede localizar elementos por texto
- Es más legible por computadoras
CSS SELECTOR
- Solo puede recorrer el DOM de padre a hijo y de derecha a izquierda
- Es más legible por seres humanos
- Los frontend devs lo entienden mejor
- MUY BUENO PARA AUTOMATIZACIÓN MOBILE, XPATH ES BASTANTE LENTO EN MOBILE , IOS NI SIQUIERA TIENE UN XML MAP, DEBE SER CREADO POR APPIUM

locators cheat sheet --> https://www.automatetheplanet.com/selenium-webdriver-locators-cheat-sheet/
