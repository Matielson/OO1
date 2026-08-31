#### **Identificacion de Clases Conceptuales**

La tarea es **identificar las clases conceptuales** vinculadas al escenario con el que se trabaja (definir las clases).

Hay varias **estrategias**:
- Identificar los **sustantivos** (que cosas son las que estan en el problema).
- Utilizar una **lista de categorias** de clases conceptuales.
- Identificar **clases nominales.**

Objetivos:
- Usar los nombres del dominio del problema, no de la solucion (describir el problema, no resolver).
- Omitir detalles irrelevantes. (Informacion no necesaria).
- No inventar nuevos conceptos.
- Descubrir conceptos del mundo real.

##### Frases nominales

Es un conjunto de palabras en una oracion que funciona como sustantivo. Permite definir correctamente las clases.

Este conjunto, puede consistir de un unico sustantivo o mas de una palabra en el que el sustantivo es el nucleo.

#### **Pasos para construir el Modelo de Dominio**

1. Listar los **conceptos** (clases y atributos) candidatos.
2. Graficarlos en Modelo de dominio.
3. Agregar atributos a los conceptos.
4. Agregar asociaciones entre los conceptos.

#### **Ejemplo: Modelo del Dominio**

Ejercicio: 

-------

Una empresa de mantenimiento de viviendas desea desarrollar una plataforma que permita manejar las contrataciones de sus servicios de limpieza y parquización. Se requiere contemplar las siguientes funcionalidades:

1. **Contratar por única vez** El cliente solicita un servicio puntual. El monto se calcula en base al tipo de servicio, la cantidad de horas trabajadas y las tarifas mínimas establecidas.
    
2. **Contratar de forma prolongada** El cliente acuerda un servicio recurrente. Se deben considerar costos de mantenimiento, posibles recargos y/o descuentos según la duración del contrato.
    
3. **Obtener el monto a pagar por un cliente** El sistema debe calcular el total considerando todos los servicios contratados.

**Cálculo de montos:**

- **Servicio de limpieza:** precio por hora × cantidad de horas, respetando una tarifa mínima.
    
- **Servicio de parquización:** precio por hora × cantidad de horas, más costos de mantenimiento.
    
- Se deben contemplar recargos o descuentos según condiciones específicas.

------

Luego de detectar posibles clases, nos quedamos con las favorables o las que creemos que son verdaderas clases, y las tachamos de nuestra"lista".

#### **Como se representa un Modelo de Dominio?**

Usamos un Diagrama de Clases UML. Que representa al modelo de dominio completo, siendo este una representacion visual de las clases conceptuales.

Son "Cajas" con los nombres de las clases separadas en 2: Atributos y Metodos

| ClassName           |
| ------------------- |
| +Field: type        |
| +Method(Type): Type |

#### **Agregar atributos**

Los **atributos** en un modelo UML deberian ser, atributos simples o tipos de datos primitivos como:

- Boolean
- String
- Int
- Double
- Temporales

#### **Relaciones entre clases conceptuales**

La manera de que las clases conceptuales se relacionen entre si, es con asociaciones.

*Cuando nos podemos dar cuenta que algo pensado como atributo debe ser una clase conceptual?*
- Esta compuesto por secciones separadas
- Tiene operaciones asociadas
- Tiene otros atributos
- Es una cantidad con una unidad
- Es una abstraccion de uno o mas tipos

##### **Deberiamos usar un atributo para representar una relacion entre clases?**

No. La mejor manera es expresar que un concepto usa a otro, es nuevamente, con una asociacion, no como claves.

