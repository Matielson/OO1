#### **El sistema orientado a objetos**

- Es una **red** (grafo) de objetos.
- Cada objeto encapsula:
	- *Propiedades:* (atributos, variables de instancia).
	- *Operaciones* (metodos)
- Todo computo ocurre en algun objeto.
- No hay un objeto "*main*".
- Computo y datos ya no se piensan por separado.


#### **Objeto: Definicion**

Un objeto es la **abstraccion de una entidad del dominio del problema**. Por ej: Persona, Producto, Cuenta Bancaria, Auto, Plan de Estudios...

- Puede representar tambien conceptos del espacio de la solucion (estructuras de datos, tipos "basicos", archivos, ventanas, etc).

**Que contiene un objeto?:**

- **Conocimiento (estado interno)** en base a sus relaciones con otros objetos y su estado.
- **Comportamiento:** conjunto de mensajes que un objeto sabe responder.
- **Identidad:** para distinguir un objeto de otro (independientemente de sus propiedades).

##### **UN OBJETO NO ES UNA CLASE**
---------------

#### **Instancias vs. Clases**

Cuando diseñamos o programamos el problema, describimos clases.
Cuando se ejecuta el programa, tenemos objetos.

**Una clase compone aquellos atributos y metodos que es comun para algo comun en un problema.**

UML: Es una notacion grafica inspirada en objetos. Hay 2 vistas, estatica (previa a ejecucion) y dinamica (post-ejecucion).


#### **Formas de conocimiento**

- Un objeto **solo puede enviar mensajes a otros que conoce.**
- Las variables establecen ligaduras d

Hay 3 formas en las que un objeto puede conocer a otro:

- **Variables de Instancia (el estado interno del objeto)**: Aparece cuando se crea el objeto y cuando se muere, todos esos punteros (variables) se van.
- **Parametros:** Cuando le pedimos algo, le mandamos un puntero, no una copia del valor. Es decir, si le pasamos un objeto como parametro y lo modificamos, modificamos directamente ese objeto.
- **Variables temporales:** Solo existen como punteros mientras se ejecuta el metodo, despues se va. Hay punteros (variables) para que el objeto se conozca a si mismo.

**TODAS LAS VARIABLES DE INSTANCIA TIENEN QUE SER PRIVADAS, Por lo tanto, solo se pueden usar en metodos dentro de esa clase. (clave para reducir el acoplamiento)**.

-------
#### **Comportamiento de un objeto**

Las operaciones que define una clase (cosas que pueden ejecutar las instancias) son los **metodos**.

Cuando le queremos decir "hace esto", enviamos un mensaje. 

- El comportamiento de un objeto esta dado por **el conjunto de mensajes que entiende.**
- Otros objetos le envian mensajes para que haga algo (ejecutando un metodo) o obtener algo.
- Siempre que un objeto recibe un mensaje, ejecuta un metodo.

**Todas las instancias (objetos) de una clase, entienden los mismos mensajes**

**Todas las instancias (objetos) de una clase, ejecutan un mismo metodo para un mismo mensaje.**

-----

#### **Metodo (unidad minima de comportamiento)**

Un metodo es una **operacion definida en el contexto de una clase.** Siempre lo ejecuta un objeto (instancia de una clase).

- Puede recibir parametros (otros objetos).
- Puede devolver algo (un objeto) o nada.
- Puede hacer uso de las variables del objeto receptor.
- Puede modificar al objeto que lo ejecuta.
- Puede enviar mensajes (incluso al mismo objeto).

Ejemplo:

public boolean transferir(Cuenta d, double m) {
    if (saldo >= m) {
        this.extraer(m); /// Modifica la variable de instancia del metodo donde se lo llamo
        d.depositar(m);
        return true;
    } else {
        return false;
    }
}

cuentaA.transferir(cuentaB, 200);



------

#### **Busqueda de metodos:**

Cuando un objeto recibe un mensaje, se busca un metodo con la firma correspondiente (nombre y parametros) en la clase de ESE objeto. Si se lo encuentra, lo ejecuta "**en el contexto del objeto receptor**". Si no lo encuentra, tira error.

- Permite desacoplar "lo que quiero hacer" (invocaciones) de las "formas de hacerlo" (implementaciones).

-- 

------

#### **Instanciacion (creacion de objetos)**

Es el **mecanismo de creacion de objetos**. El objeto cuando se instancia, le queda guardado de que clase es. El objeto NUNCA cambia de clase.

- Todas las instancias de la misma clase tiene la misma estructura (mismas variables de instancia).
- Entienden los mismos mensajes de la misma manera (ejecutan los mismos metodos).
- Se utiliza el **new**, junto al nombre del constructor y los parametros.

#### **Instanciacion (constructures)**

Para que un objeto este listo para recibir mensajes, tenemos que inicializarlo. Para eso usamos los constructures.

- Crea el objeto en memoria y devuelve el PUNTERO.
- Los valores iniciales pueden asumirse o recibirse como parametros.

-----

#### **Encapsulamiento y ocultamiento**

- **Encapsulamiento:** Inplica agregar en un mismo objeto, los datos y el comportamiento que opera en esos datos. (**El objeto es ese "envoltorio" que asegura el encapsulamiento).

- **Ocultamiento de informacion:** Es un aspecto del encapsulamiento, las decisiones de diseño pueden cambiar, estan protegidas tras interfaces estables. Asi logramos bajo *acoplamiento*.





