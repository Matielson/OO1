#### **Abstraccion:** 

Es el **proceso de identificar y representar los conceptos relevantes de un problema**, conservando las propiedades y comportamientos escenciales para nuestro proposito.

Es decidir que queremos ver como una unidad y que detalles podemos dejar afuera:

- Nos ayuda a encontrar conceptos relevantes del dominio.
- Nos permite pensar en que pertenece junto dentro de cada concepto.
- Nos deja ignorar detalles que no son importantes en ese nivel.

**Dominio:** Es el conjunto de Objetos, reglas, comportamientos, etc.

**En lugar de leer el problema y descomponerlo en subproblemas, empiezo a notar COSAS de las que habla ese problema, esas "cosas" son las que llamamos objetos.**


#### **Cohesion** (Adentro de un modulo)

Es el grado en que los elementos agrupados dentro de un modulo estan relacionados entre si y contribuyen a un proposito comun.

- Mide que tan justificada esta la decision de colocar ciertos elementos juntos dentro de un mismo modulo.
- **Alta cohesion**: Sus partes (datos, operaciones, decisiones, responsabilidades) estan estrechamente relacionados.
- **Baja cohesion**: Cuando reune elementos que tienen poco que ver entre si.

**Queremos modulos pequeños, que las cosas dentro, esten lo mas relacionadas posibles entre si.**

#### **Acoplamiento** (Afuera de un modulo)

Es el grado de dependencia existente entre modulos.

- Mide cuanto necesita conocer, utilizar o asumir un modulo acerca de otros modulos para poder cumplir su responsabilidad.

Lo ideal es que un modulo solo depende en cosas que los otros modulos permitan conocer (es decir, solo dependemos de lo que los otros modulos digan "yo permito que esto lo conozcas", no COMO lo hace).

El acoplamiento es **malo**. 


**Acoplamiento y Cohesion son caracteristicas de modularizacion**