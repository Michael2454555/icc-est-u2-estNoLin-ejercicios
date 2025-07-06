# Estructuras No Lineales – Ejercicios Árboles

Este proyecto contiene la solución a cuatro ejercicios prácticos sobre estructuras de datos tipo árbol binario, como parte del aprendizaje de estructuras no lineales en Java. Cada ejercicio se encuentra organizado en su propia carpeta, siguiendo la convención de paquetes y buenas prácticas.

---

## Identificación del Estudiante (Obligatorio)

Antes de comenzar a programar o ejecutar el proyecto, **debes completar tu nombre y correo institucional en el archivo `student.env`** que se encuentra en la raíz del proyecto. Este archivo es necesario para validar tu identidad como autor del trabajo.

### ¿Por qué es obligatorio?

Este proyecto utiliza una verificación automática que valida que has ingresado tu información personal. Si no lo haces:

- Al ejecutar el proyecto (`App.java`) verás este mensaje de error:
```
❌ Debes completar STUDENT_NAME y STUDENT_EMAIL en student.env
```
- No podrás enviar tu código (`push`) al repositorio si tienes activado el sistema de validación local.
- Las pruebas automáticas en GitHub Actions también fallarán si no detectan tu nombre y correo.

### ¿Qué debo hacer?

1. Abre el archivo `student.env` que ya está creado en el proyecto.
2. Rellena tus datos:

```
STUDENT_NAME=Tu Nombre Completo
STUDENT_EMAIL=tu.correo@institucion.edu.ec
```


3. **No borres estas líneas ni cambies los nombres de las variables.**
4. Guarda los cambios y vuelve a ejecutar el programa o hacer push.

> 💡 Este mecanismo asegura la autoría del código y que cada estudiante reciba su evaluación automática de forma personalizada.

---




## Explicación para el estudiante

```
src/
│
├── Materia/
│
├── Ejercicio_01_insert/
├── Ejercicio_02_invert/
├── Ejercicio_03_listLeves/
└── Ejercicio_04_depth/
```

---

## Descripción de Ejercicios

### Ejercicio 01: Insertar en un Árbol Binario de Búsqueda (BST)

Carpeta: `Ejercicio_01_insert`
Implementa un algoritmo para insertar nodos en un Árbol Binario de Búsqueda.

 **Input de ejemplo:** `[5, 3, 7, 2, 4, 6, 8]`
 **Output esperado:**

```
    5
  3   7
 2 4 6 8
```

---

### Ejercicio 02: Invertir un Árbol Binario

📂 Carpeta: `Ejercicio_02_invert`
Dada la raíz de un árbol binario, el algoritmo devuelve su versión invertida (espejo).

 **Input de ejemplo:**

```
    4
  2   7
1  3 6  9
```

**Output esperado:**

```
    4
  7   2
9  6 3  1
```

---

### Ejercicio 03: Listar Niveles en Listas Enlazadas

📂 Carpeta: `Ejercicio_03_listLeves`
Devuelve una lista enlazada con los nodos por nivel. Si hay N niveles, se obtienen N listas.

 **Input de ejemplo:**

```
    4
  2   7
1  3 6  9
```

**Output esperado:**

```
4  
2 → 7  
1 → 3 → 6 → 9
```

---

### Ejercicio 04: Calcular la Profundidad Máxima

Carpeta: `Ejercicio_04_depth`
Calcula la profundidad máxima de un árbol binario (la longitud del camino más largo desde la raíz hasta una hoja).

**Input de ejemplo:**

```
    4
  2   7
1  3  
8
```

**Output esperado:** `4`

---

## Indicaciones Generales

* Lee cuidadosamente el enunciado de cada ejercicio.
* Cada carpeta debe contener:

  * Código fuente Java.
  * Casos de prueba.
  * Comentarios claros.
* Realiza commit y push con el mensaje:

  ```
  Estructuras No Lineales – Ejercicios Árboles
  ```
* En el AVAC, sube la **URL del repositorio** con el código.

---

## No se calificará si:

* No hay commit con los ejercicios.
* No se incluye este README explicativo.
* Las clases o métodos no siguen los nombres requeridos.

---

## Rúbrica de Calificación

| **Criterio**       | **Descripción**                                                                       | **Puntaje** |
| ------------------ | ------------------------------------------------------------------------------------- | ----------- |
| **Informe**        | No hay informe                                                                        | 0 pts       |
|                    | Informe parcial **sin explicación** de cada método                                    | 1 pt        |
|                    | Informe parcial **con explicación** de cada método                                    | 2 pts       |
|                    | Informe completo                                                                      | 3 pts       |
| **Funcionamiento** | No implementado                                                                       | 0 pts       |
|                    | Implementado parcialmente: <br>• Ejercicio 1 y 4 → 2 pts<br>• Ejercicio 2 y 3 → 4 pts | 2–4 pts     |
|                    | Código funcional pero **no pasa todas las pruebas**                                   | 6 pts       |
|                    | Código funcional y **pasa todas las pruebas correctamente**                           | 7 pts       |



## Contribuir

Para contribuir a este proyecto, por favor crea un fork y envía una solicitud de extracción, o simplemente abre un issue con tus comentarios y sugerencias.

## Autores

- [PABLO TORRES] - Desarrollo inicial


# 🌳 Informe: Árboles Binarios en Java

Este proyecto contiene 4 ejercicios sobre árboles binarios, implementados y visualizados desde una clase principal `App.java`. Cada ejercicio trabaja con una operación distinta sobre un árbol binario.

---

## ⚙️ Ejercicio 1: Insertar en un Árbol Binario de Búsqueda (BST)

### 📌 ¿Qué hace?
Inserta valores en un árbol binario de búsqueda (BST), respetando su propiedad:  
todos los valores menores van a la izquierda, y los mayores a la derecha.

### 🔧 Cómo funciona
- Se usa la clase `InsertBST`.
- Se construye el árbol desde la raíz con los valores: `[5, 3, 7, 2, 4, 6, 8]`.
- Se imprime en consola visualmente usando `printTreeNode2()`.

### 🧩 Clase usada
- `InsertBST.java`  
- Modelo de nodo: `Node.java`

### ▶️ Ejemplo en consola:
```
ÁRBOL 1 - InsertBST:
├── 5
│   ├── 3
│   │   ├── 2
│   │   └── 4
│   └── 7
│       ├── 6
│       └── 8
```


---

## 🔁 Ejercicio 2: Invertir un Árbol Binario

### 📌 ¿Qué hace?
Invierte un árbol binario, intercambiando todos los subárboles izquierdos y derechos.

### 🔧 Cómo funciona
- Se usa la clase `InvertBinaryTree`.
- Se construye un árbol manualmente con valores:  
  `4 → 2 y 7 → (1,3,6,9)`
- Luego se invierte usando `invertTree()` y se imprime.

### 🧩 Clase usada
- `InvertBinaryTree.java`

### ▶️ Ejemplo en consola:
```
ÁRBOL 2 - InvertBinaryTree:
├── 4
│   ├── 7
│   │   ├── 9
│   │   └── 6
│   └── 2
│       ├── 3
│       └── 1
```

---

## 📚 Ejercicio 3: Listar Niveles del Árbol (Recorrido BFS)

### 📌 ¿Qué hace?
Recorre el árbol nivel por nivel (por anchura) y devuelve los nodos en una lista de niveles.

### 🔧 Cómo funciona
- Se usa la clase `ListLevels`.
- Se construye el árbol igual al ejercicio 2 (sin invertir).
- Se imprime visualmente el árbol.
- Luego se imprime cada nivel como una lista.

### 🧩 Clase usada
- `ListLevels.java`

### ▶️ Ejemplo en consola:

```
ÁRBOL 3 - ListLevels:
├── 4
│   ├── 2
│   │   ├── 1
│   │   └── 3
│   └── 7
│       ├── 6
│       └── 9
Niveles:
[ 4 ]
[ 2 7 ]
[ 1 3 6 9 ]
```

---

## 📏 Ejercicio 4: Calcular Profundidad Máxima del Árbol

### 📌 ¿Qué hace?
Calcula la profundidad máxima del árbol binario (la rama más larga desde la raíz hasta una hoja).

### 🔧 Cómo funciona
- Se usa la clase `Depth`.
- Se construye el árbol manualmente con una rama extra para aumentar la profundidad.
- Se imprime el árbol y luego la profundidad con `maxDepth()`.

### 🧩 Clase usada
- `Depth.java`

### ▶️ Ejemplo en consola:

```
ÁRBOL 4 - Depth:
├── 4
│   ├── 2
│   │   ├── 1
│   │   ├── 1
│   │   ├── 1
│   │   │   ├── 8
│   │   │   └── null
│   │   └── 3
│   └── 7
Profundidad máxima: 4


```


---

## 🧠 Requisitos

- Java 8 o superior
- IDE o terminal para ejecutar `App.java`

---

## 👨‍💻 Autor

Michael Yumbla




