<style>body {text-align: justify}</style>

# Trabajo Práctico N.º 2 - Programación Orientada a Objetos (11076) - UNLu

## Parte uno: Referencias e Instancias

> **Fecha de entrega**: 27 de septiembre de 2023
> 
> **Forma de entrega**: Link a repositorio git personal desde la Plataforma Digital

### Ejercicio 1: Club de Futbol

Un club deportivo de la ciudad de San Carlos de Bariloche nos contrata para realizar un sistema de información para la gestión de su institución. 

El sistema pretende llevar un registro de socios del club. Al momento de la inscripción, el personal a cargo solicita los datos personales y de contacto, dirección y e-mail de cada socio; generando una credencial con la cual deberá presentarse cuando quiera ingresar a las distintas instalaciones del complejo. 

A principio de mes cada socio debe abonar una cuota cuyo valor depende de la suscripción que haya elegido: básica, intermedia y destacada. Dependiendo de la suscripción adquirida tendrá acceso a solo ciertas actividades para el caso de la suscripción básica, se añaden algunas más para la suscripción intermedia, y en el caso de la destacada tiene libre acceso a cualquier actividad que quiera realizar.

El sistema debe facilitar los siguientes reportes:

1. Reporte mensual de nuevos socios inscriptos
2. Listado de actividades clasificadas por suscripción (actividades accesibles con la suscripción básica, actividades accesibles con la suscripción intermedia y aquellas que solo puede accederse con la suscripción destacada).
3. Listado de socios clasificados por suscripción adquirida

**Objetivo**:

1. Encontrar los objetos que participan del problema.
2. Definir asociaciones entre los objetos, comportamiento y estructura de cada uno.
3. Validar el modelo construido para garantizar que responde a los requisitos del problema.

> ***Créditos**: Programación I - UTN-FRC. Ing. Alexis Massón*

### Ejercicio 2: Agencia de Turismo

La agencia SunBeach decide contratar un equipo de profesionales en sistemas para encarar una solución a sus problemas de gestión a través del desarrollo de un software a medida.

SunBeach tiene proveedores en todo el mundo (compañías aéreas, marítimas y terrestres (medios de transporte), cadenas de hoteles, hosterías, búngalos (hospedajes), y guías de turismo que ofrecen distintas excursiones). Continuamente se comunica con los mismos y de acuerdo a las distintas ofertas disponibles diseña y arma paquetes de turismo.

Cada paquete de turismo está compuesto por 1 (un) destino, 1 (un) medio de transporte, 1 (un) hospedaje y varias (1 o más) excursiones.

Los clientes que se acercan a la agencia pueden elegir entre los distintos paquetes de turismo vigentes, los cuales abonan en efectivo.

El sistema debe permitir llevar un registro de los distintos proveedores y su clasificación (medios de transporte, hospedajes o excursiones), los paquetes de turismo y cómo están compuestos, los clientes de la agencia y las compras que realiza cada cliente.

A fin de mes el administrador de SunBeach necesita un informe que contenga un listado de todas las ventas realizadas, organizadas por destino. También quiere conocer cuál es el destino favorito por sus clientes.

**Objetivo**:

1. Encontrar los objetos que participan del problema.
2. Definir asociaciones entre los objetos, comportamiento y estructura de cada uno.
3. Validar el modelo construido para garantizar que responde a los requisitos del problema.

> ***Créditos**: Programación I - UTN-FRC. Ing. Alexis Massón*

### Ejercicio 3: Academia de Danzas

Una famosa academia de Capital Federal decide contratar a una consultora informática para desarrollar un
sistema de información que le permita llevar un control de su gestión administrativa.

La academia dicta distintas disciplinas, de las cuales pueden existir una o más diagramaciones o comisiones. Por ejemplo, para la disciplina "Tango" existe una diagramación que se dicta los días lunes y viernes, siendo de un nivel inicial o para principiantes. A su vez, existe otra diagramación para la disciplina "Tango" que se dicta los martes y sábados, y el nivel es intermedio. Por tanto, una diagramación deberá contar con los siguientes datos: día y horario, nivel (inicial, intermedio o avanzado), disciplina (ej. Tango, Salsa, Bachata, Clásico, Stretching, Contemporáneo, Árabe, etc.) y un profesor encargado de dictar la clase.

Las clases o diagramaciones tienen lugar en alguno de los distintos salones que tiene la academia.

La academia cuenta con más de 500 alumnos, los cuales se inscriben a distintas clases o diagramaciones.

Cuando una persona se presenta por primera vez la secretaria toma sus datos personales y de contacto y lo inscribe a una determina diagramación y le entrega una credencial personal que deberá traer al momento de asistir a clases.

En cada clase, los alumnos deben presentar su credencial en la secretaría, donde la secretaria procede registrar su asistencia.

Mes a mes la academia debe entregar a los profesores un listado de todos los alumnos que asistieron a sus clases a fin de calcular el importe que se le pagará al profesor (cada profesor cobra $10 por cada día que un alumno asiste a su clase).

La academia necesita contar con un reporte que indique cuál es la disciplina que le reditúa mayor ingreso a fin de planificar más diagramaciones de dicha disciplina.

**Objetivo**:

1. Encontrar los objetos que participan del problema.
2. Definir asociaciones entre los objetos, comportamiento y estructura de cada uno.
3. Validar el modelo construido para garantizar que responde a los requisitos del problema.

> ***Créditos**: Programación I - UTN-FRC. Ing. Alexis Massón*

### Ejercicio 4

Se requiere implementar un sistema que administre cuentas de billeteras virtuales. Cada cliente tiene una cuenta normal y puede tener una cuenta crédito. Las cuentas normales tienen un límite de giro en descubierto. Con este tipo de cuentas se puede invertir parte del dinero del saldo que pasado N días nos dará un interés del 40%. Solo se puede realizar una inversión a la vez. El monto total que puede gastar un usuario es la suma del saldo disponible y el límite de giro en descubierto. Los giros en descubierto se cubren a medida que el usuario va agregando saldo a la cuenta.

Las cuentas de tipo crédito funcionan de la siguiente manera:

1. Las compras no se dividen en cuotas, solo tienen un recargo fijo del 5% sobre el monto total de la compra. El valor final a pagar de una compra es el monto + el 5%. El usuario paga a medida que puede el monto que quiere.
2. Existe un límite de gasto que se irá decrementando según la cantidad de compras realizadas. El valor que se decrementa es el monto de la compra.
3. Cada vez que se realiza el pago se aumenta el límite de compra disponible. El pago de intereses no debería aumentar el límite de compra.

El sistema debe poder mostrarle al usuario:

1. Saldo de la cuenta, límite de giro en descubierto, monto invertido (si existe inversión), monto disponible para compras a crédito y saldo deudor teniendo en cuenta todas las compras a crédito realizadas.
2. Debe poder avisarle al usuario cuando un gasto que intenta realizar lo va a hacer girar en descubierto.

**Objetivo**:

1. Evaluar calidad de [la solución planteada](https://gitlab.com/programacionoounlu/clases-2023/trabajos-practicos/-/tree/main/billetera-virtual) según los 3 conceptos: cohesión, encapsulamiento/contrato y ocultamiento de la información. Determinar si se cumplen o no. En la solución se provee el código documentado (sin implementar) y un diagrama de clases.
2. Si creen que no se cumple, pensar un nuevo diseño que respete los 3 conceptos antes de avanzar. En cualquier caso, justificar la respuesta.
3. Implementar la solución.

### Ejercicio 5

Ahora queremos agregar una nueva *feature* a las cuentas. La inversión realizada se puede cancelar en cualquier momento, pero el interés devuelto no va a ser del 40%, sino solo del 5% si al menos pasaron 30 días. Además, se puede activar la opción de precancelar automáticamente: cuando un usuario realiza un gasto mayor a su saldo, la inversión se precancela para que no gire en descubierto (o para que lo haga pero por un monto mucho menor).

**Objetivos**:

1. Evaluar si el diseño actual me permite de manera sencilla introducir este cambio, ¿Se podría mejorar el diseño en términos de encapsulamiento/contrato? ¿Qué pasa con la cohesión y el acoplamiento?
2. Diseñar e implementar, si lo creen necesario, modificaciones que mejoren la cohesión, encapsulamiento/contrato, etc.
3. Implementar los nuevos requisitos pedidos para el sistema.

### Ejercicio 6: Estación de Servicio

Una estación de servicio ubicada en la ruta nacional N.°9 está diseñando un sistema de información para llevar un control de sus ventas.

La estación cuenta con varios expendedores de combustible, cada uno expende un determinado combustible (nafta, gasoil o kerosene).

Los playeros cumplen turnos de 8 hs, habiendo en todo momento personal al servicio de los clientes, ya que se trabaja 24 hs.

Cuando un cliente se presenta para cargar combustible se estaciona frente a algún expendedor, un playero lo atiende y se realiza la venta. Al momento de cobrar el playero se dirige a alguna de las PC disponibles
dentro de la playa y registra el número de patente, el tipo de combustible, el total de la venta y quién es el
vendedor o playero afectado.

El sistema debe permitir generar los siguientes informes mensuales: 
1. Listado de la proporción de ventas efectuadas para cada tipo de combustible.
2. Listado de surtidores ordenados por monto total de ventas.
3. Listado de surtidores ordenados por cantidad de litros expendidos.
4. Listado de empleados ordenado por monto total de ventas.
5. Top 10 de clientes según monto total de compras.

**Solución propuesta:**

![Solución propuesta - Ejercicio 7](images/solucion-estacion-servicio.png)

**Objetivo**:

1. Evaluar si el diseño de la solución propuesta permite cumplir con los requisitos del sistema y si respeta los conceptos de cohesión, encapsulamiento/contrato y ocultamiento de la información. Si la respuesta es no, proponer un nuevo diseño. Justificar.
2. Implementar la solución.

> **Créditos**: Programación I - UTN-FRC. Ing. Alexis Massón.*
>
> **Aclaración**: El ejercicio fue modificado por la cátedra de POO de la Universidad Nacional de Luján con el fin de darle un enfoque de identificación de problemas de diseño y refactorización.*


### Ejercicio 7

El dueño de la estación de servicio tiene nuevos requisitos:

1. Si un cliente realiza una compra y fué parte del top 10 de clientes del mes anterior, entonces se le realiza un descuento del 5%.
2. Si un empleado se encuentra en el top 10 de ventas realizadas en el mes anterior, se le permite hacer un descuento del 10% (por única vez) al cliente que elija.

**Objetivo:**
1. Extender el diseño del ejercicio anterior e implementar nuevos requisitos.
2. ¿Qué pasa si los combustibles cambian de precio con el tiempo? En caso de que el diseño no lo soporte, proponer una solución e implementarla.  

**Pensando en el tema que sigue:** ¿Qué pasa si el dueño decide vender otros productos además de combustible? Como pueden ser: servicios de boxes, productos de limpieza para el auto, etc.
## Parte dos: Herencia y polimorfismo

### Ejercicio 8

Del [Ejercicio 6](https://programacionoounlu.gitlab.io/clases-2023/trabajos-practicos/tp1.html#ejercicio-6) de la [guía anterior](https://programacionoounlu.gitlab.io/clases-2023/trabajos-practicos/tp1.html), donde se implementó la clase Libro para un sistema de administración de bibliotecas, ahora nos llega un nuevo requerimiento: En realidad un Libro es un caso particular de una Publicación, dado que además la biblioteca maneja ahora Revistas, Tesis y Diarios. Los 4 tipos de publicaciones comparten un nombre, un editor y un teléfono de contacto con el proveedor que los distribuye. Sin embargo, los libros tienen ISBN, pero las revistas tienen ISSN. Por otro lado, las revistas tienen además un número y año de publicación (los libros solo tienen año de publicación); las Tesis tienen un Autor y un mes y año de publicación (los Libros pueden tener varios autores, siempre al menos uno); y los diarios tienen una fecha de publicación (que además del año, incluye mes y día).

Para el caso particular de los Libros, se desea tener un seguimiento de los préstamos. Para ello, el sistema debe entonces incorporar el concepto de Socio de la Biblioteca y establecer un diseño que permita prestar un ejemplar a un socio. En este caso, es requisito disponer de un método que sepa mostrar los ejemplares en préstamo actualmente. Además, es necesario disponer de otro método que permita contabilizar la cantidad de ejemplares disponibles por cada libro.

Para el relato anterior se precisa:

1. Definir una jerarquía de tipos aplicando herencia. En la misma debe definirse claramente qué atributos van en el supertipo y cuáles en los tipos específicos.
2. Para el caso de la clase Libro, debe mantenerse toda la lógica del Ejercicio 6 de la guía anterior. Sin embargo, es importante tener en cuenta que las revistas cuentan con la misma lógica (incluyendo lo de cantidad de ejemplares).
3. Generar un Diagrama de Clases UML simple de la versión final.
4. Generar una clase que utilice este modelo y realice algunos préstamos.
5. Generar un Diagrama de Secuencias UML que permita visualizar la implementación del método que contabiliza la cantidad de ejemplares disponibles por libro.

### Ejercicio 9

Estamos desarrollando un módulo de un software de matemática donde debemos modelar figuras geométricas en 2 y 3 dimensiones. Toda figura geométrica tiene que saber calcular su área y debe retornarla mediante la invocación del método getArea(). Además, solo para el caso de las figuras en 3 dimensiones, tiene sentido solicitar también el volumen de la figura.

El cálculo de área para cada caso es:

1. Dos dimensiones
    1. Área del círculo: `Pi * radio ^ 2`
    2. Área del rectángulo: `base * altura`
    3. Área del cuadrado: `lado * lado`
    4. Área del triángulo: `base * altura / 2`
2. Tres dimensiones
    1. Área de la esfera: `4 * Pi * radio ^ 2`
    2. Volumen de la esfera: `(4/3) * Pi * radio ^ 3`
    3. Área del paralelepipedo: `2 * (arista1 * arista2 + arista1 * arista3 + arista2 * arista3)`
    4. Volumen del paralelepipedo: `arista1 * arista2 * arista3`
    5. Área del cubo: `6 * arista^2`
    6. Volumen del cubo: `arista^3`
    7. Área del tetraedro: `(regular): arista^2 * raíz(3)`
    8. Volumen del tetraedro: `(regular): arista^3 * raíz(2)/12`

En todos los casos, se pide:
1. Generar un diagrama de clases que represente adecuadamente la jerarquía planteada.
2. Implementar los métodos de área y volumen donde corresponda y aplicar las fórmulas planteadas. Debo poder tener una lista de Formas y pedirles el área a todas sin importar el Subtipo. Además, de un listado de Formas en 3D tengo que poder pedirles el volumen.
3. Generar una clase que utilice varias de las clases construidas para mostrar su funcionamiento.

### Ejercicio 10

Una organización mantiene su lista de empleados, donde tiene los siguientes tipos identificados:

* **Empleado asalariado o full-time**: Empleado que tiene una relación laboral de tiempo completo con la organización
* **Empleado por comisión**: Son empleados que trabajan y cobran porcentaje por el bruto de las ventas. Se estipula de antemano, pero su sueldo se calcula según el monto total de ventas y el porcentaje estipulado.
* **Empleados por comisión con salario base**: son empleados que tienen trabajo por comisión, pero su salario tiene una suma fija.
* **Empleados por hora**: Cobran un monto fijo por hora que se multiplica a la cantidad de horas que tienen estipulada por contrato.

Todo empleado tiene un nombre, apellido, teléfono y CUIT.

Cada empleado debe responder al mensaje de `calcularSueldo`, teniendo en cuenta las siguientes reglas:

* Los empleados asalariados tienen una suma fija mensual.
* Los empleados por comisión tienen una cantidad de ventas que realizaron y un porcentaje fijo por el bruto de esas ventas.
* Los empleados por comisión con salario base, son similares a los empleados por comisión, pero además tienen un monto fijo de base.
* Los empleados por hora cobran por una cantidad de horas fijas de antemano, una suma estipulada por hora.

Se tiene un proceso que desea obtener, para cada tipo de empleado, el sueldo correspondiente al mes en curso a partir de los atributos mencionados.

Se le solicita:

1. Generar un diagrama de clases UML con la jerarquía de clases, haciendo uso de herencia de forma conveniente.
2. Desarrollar el cálculo de sueldo para todos los tipos de empleados.
3. Desarrollar una aplicación que calcule el sueldo para ejemplos de al menos uno de cada tipo de empleado.
4. Existe un tipo de empleado que es pasante, y cuyo sueldo no depende de la organización. En dichos casos, el cálculo de sueldo debe dar cero. Agregar este tipo a la jerarquía y, desarrolle el cálculo de sueldo.
5. En el caso de empleado por hora, aparece un nuevo convenio que estipula que en caso de trabajar más de 40 horas en ese mes, el sueldo se calcula igual pero con un extra a favor del empleado del 20 por ciento. Agregar esta lógica al desarrollo que haya realizado.
6. La organización decide darle un premio por cumpleaños a cada empleado. Entonces le solicita que se pueda registrar dicho dato en el sistema, y que para el mes del cumpleaños se le agregue el bono correspondiente. Se le solicita desarrollar la funcionalidad teniendo en cuenta que los extras por cumpleaños se manejan de la manera que se explica a continuación:

    1. Cualquier empleado cobra $2000 por su cumpleaños.
    2. Si es empleado asalariado, además, cobrará $1000 extra por cumpleaños.
    3. Si es empleado por comisión, cobrará el 0.5 % del bruto de ventas.
    4. Si es empleado por comisión con salario base, cobrará $1000 extra más el 0.5 % del bruto de ventas.
    5. Los empleados por hora no cobran nada extra sobre los $2000.

### Ejercicio 11

Una empresa de renta de automóviles necesita un sistema para realizar presupuestos de alquiler a clientes de forma rápida. Las reglas para calcular el costo de alquilar un vehículo varían según diversas características. Los vehículos se identifican unívocamente por su patente (El sistema no puede tener una misma patente en más de un vehículo).

Al momento, los tipos de vehículos que se alquilan son autos de pasajeros, combis, camionetas de tipo “flete” y camión de carga.

Todo vehículo tiene un precio base de alquiler diario de $3000 pesos. Luego, existen algunas particularidades que se adicionan al precio base según algunas reglas:

* En cada auto de pasajero, se suman $300 pesos por cada asiento por día. Ejemplo, existen autos de 4 asientos, pero hay otros de 2 y otros de 5.
* En el caso de autos de tipo VIP, la plaza es de $500 pesos.
* Para el caso de las combis, el precio base se modifica en $4500.
* Para las camionetas tipo flete, se adicionan $600 pesos por un valor conocido como * Peso Autorizado Total (PAT). Este adicional es entonces $600 * PAT de cada camioneta.
* Los camiones no tienen el precio base, sino que tienen un costo fijo de alquiler de $100000 (cien mil), salvo que se alquilen más de 30 días, cuyo precio base diario es de $75000.

Además, se quiere modelar los clientes. Un cliente es alguien que solicita un presupuesto, pero que finalmente puede realizar un alquiler. Un alquiler vincula un presupuesto con un cliente. Además, el alquiler puede establecer fechas de inicio y fin y generar el saldo a pagar. Por otro lado, el sistema NO DEBE realizar gestión de pagos.

Dado todo esto, el sistema de la agencia debe poder:

1. Registrar los vehículos y poder prestarlos. No debe permitirse que dos vehículos se registren con la misma patente.
2. Emitir un presupuesto. Un presupuesto consta de un vehículo específico y una cantidad de días de alquiler. Debe valorarse el monto final.
3. De un presupuesto debe poder generarse un alquiler. 
4. De un cliente, mostrar el monto total de todos los alquileres realizados.
5. El monto total de todos los alquileres generados por el sistema.

### Ejercicio 12

Refactorizar el Ejercicio 5 de la Parte 1 de esta guía para modelar las cuentas en base un tipo base llamado “Cuenta”. Decida responsabilidades de las nuevas tres clases. Además, incorpore el concepto de Caja de Ahorro. Una caja de ahorro funciona de manera similar a una CuentaNormal, pero no permite giro en descubierto.

Se solicita:
1. Modificar el diagrama de clases UML del ejercicio 10 de la guía anterior, para reflejar el nuevo diseño.
2. Modificar el código para implementar los nuevos requisitos. 
3. Consulte la bibliografía sobre Clases Abstractas y Métodos Abstractos. Piense qué clases del diseño actual pueden corresponder a esta descripción e implementelo. 
4. Evalue otras abstracciones que admitan herencia y clases abstractas. Modelar el diagrama de clases y evaluar ventajas e inconvenientes.

### Ejercicio 13

Se dispone del siguiente diagrama de clases UML, que representa una parte de un sistema de gestión de una empresa de vuelos comerciales.

![Diagrama de sistema de vuelos](images/uml-sistema-vuelos.png)

Luego de varios meses de uso, un analista detecta que si un miembro de la Tripulación desea subir a un vuelo como pasajero, entonces debe ser dado de alta 2 veces en el sistema (una como Pasajero y otra como Tripulante).

Reflexiones acerca de lo anterior:

1. ¿Por qué ocurre esto?
2. ¿Este problema se debe a un diseño mal realizado o es una limitación del mecanismo de herencia?
3. ¿Existe un modelo alternativo que permita superar la limitación planteada en el modelo actual?

Actividades:

1. Implemente mínimamente las clases del modelo original e intente reproducir el escenario planteado.
2. Genere un modelo alternativo, planteando el diagrama de clases UML modificado.
3. Implementar el nuevo modelo a partir del anterior y verificar que se resuelve el problema.

### Ejercicio 14

La agencia de turismo SunBeach decide contratar un equipo de profesionales en sistemas para encarar una solución a sus problemas de gestión a través del desarrollo de un software a medida.

SunBeach tiene 3 tipos de proveedores: de transporte, guías turísticos y hospedaje. Continuamente se comunica con los mismos y de acuerdo a las distintas ofertas disponibles diseña y arma paquetes de turismo.

Cada paquete de turismo requiere de 3 proveedores de los cuales solo resulta interesante obtener el dinero a pagarles por el paquete, ya que ese dato es necesario para calcular el precio final por persona (no es necesario saber de qué tipo son los proveedores), además el paquete debe contener un destino.

Cada proveedor cobra un importe base por sus servicios. Además, según el tipo de proveedor se le agrega un importe extra al valor total que cobra el proveedor por sus servicios según la cantidad de clientes máxima que tenga el paquete, entonces:

1. El proveedor de hospedaje calcula el valor extra de la siguiente manera:

    * Si la cantidad de clientes máxima del paquete supera la cantidad mínima de clientes que acepta el proveedor (MaxPaq > MinProv), este último hace una rebaja del 0.5% del valor total del servicio base por cada cliente que supere la cantidad mínima de clientes que acepte el proveedor.
    * Si la cantidad máxima del paquete es igual a la mínima del proveedor (MaxPaq = MinProv), el valor extra es $0.
    * Si la cantidad máxima del paquete es menor (MaxPaq < MinProv) a la mínima del proveedor, el valor extra es $0.

2. El de transporte lo calcula así: Por cada cliente, se agrega un precio extra de 0.3% del precio base por los servicios de catering durante el viaje.
3. El guía turístico nunca agrega valor extra, salvo que la cantidad de clientes sea mayor a 200, en ese caso solo aumenta $90 el servicio.

Los clientes que se acercan a la agencia pueden elegir entre los distintos paquetes de turismo vigentes, los cuales abonan en efectivo.

El sistema debe permitir llevar un registro de los distintos proveedores y su clasificación (medios de transporte, hospedajes o guías turísticos), los paquetes de turismo y cómo están compuestos, los clientes de la agencia y las compras que realiza cada cliente.

A fin de mes el administrador de SunBeach necesita un informe que contenga un listado de todas las ventas realizadas, organizadas por destino.

También quiere conocer cuál es el destino favorito por sus clientes. SunBeach también requiere de un informe que contenga los datos de todos los proveedores para poder ubicarlos al momento de realizar los paquetes.

**Nota:** SunBeach siempre espera a completar con la cantidad de clientes máxima el paquete turístico.

Actividades

1. Dada la especificación funcional anterior, construir un diagrama de clases donde quede claro que clases componen el sistema, asociaciones, herencia, atributos y métodos que hagan posible cumplir con los requisitos del sistema.
2. Una vez armado el diagrama de clases, implemente su solución y genere código para probar que se cumplen las reglas de la especificación funcional.
