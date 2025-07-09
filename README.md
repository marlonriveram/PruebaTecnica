# 📌 Prueba Técnica - Cargo: Analista en Formación (Sura)

Este proyecto consiste en una API REST desarrollada con **Java y Spring Boot**, orientada a la gestión y análisis de gastos de viaje de empleados.

> 🗒️ **Nota:**  
> Para esta prueba técnica se simuló una base de datos con información **quemada** en la carpeta `db/fakeDB`.  
> Sin embargo, la implementación está preparada para conectarse a una base de datos real fácilmente, modificando una sola línea de código.

---

## 📁 Estructura del Proyecto

- `src/main/java/com.example.prueba.analista.en.formacion/controladores` → Controladores REST.
- `src/main/java/com.example.prueba.analista.en.formacion/modelos` → Modelos de datos.
- `src/main/java/com.example.prueba.analista.en.formacion/servicios` → Lógica de negocio.
- `src/main/java/com.example.prueba.analista.en.formacion/db/fakeDB` → Lógica de negocio.
- `src/main/java/com.example.prueba.analista.en.formacion/PruebaAnalistaEnFormacionAplicicon` → Main de la aplicacion.
  Nota
  Para correr el proyecto se debe estar en la ruta main de la aplicación y darle en el botón de run.


---

## 🚀 Endpoints Disponibles

Todos los endpoints están bajo la ruta raíz:

```
/api/gastos
```

---

### 1️⃣ **GET** `/empleados`

Obtiene la lista completa de gastos de todos los empleados, **sin agrupar por mes**.  
Este endpoint permite a Sura ver cuánto gastó cada empleado y en qué mes.

📌 **URL de ejemplo:**
```
http://localhost:8080/api/gastos/empleados
```

📥 **Respuesta esperada:**
```json
[
  {
    "id": 1,
    "nombreEmpleado": "Adam",
    "totalGasto": 2000000,
    "fechaGasto": "2021-01-01",
    "quienAsume": ""
  },
  {...}
]
```

---

### 2️⃣ **GET** `/total`

Devuelve una lista que muestra la **suma total de los gastos por empleado**, considerando todos los meses en que tuvo gastos.

📌 **URL de ejemplo:**
```
http://localhost:8080/api/gastos/total
```

📥 **Respuesta esperada:**
```json
[
  {
    "nombreEmpleado": "Adam",
    "totalGasto": 3500000
  },
  {...}
]
```

---

### 3️⃣ **GET** `/iva`

Este endpoint devuelve la **suma total de los gastos por mes y empleado**, calcula el **IVA**, y determina **quién asume el gasto** según una regla de negocio:

> Si el gasto total con IVA **supera $1.000.000**, lo asume el **empleado**.  
> Si no, lo asume **Sura**.

📌 **URL de ejemplo:**
```
http://localhost:8080/api/gastos/iva
```

📥 **Respuesta esperada:**
```json
[
  {
    "nombreEmpleado": "Adam",
    "mes": 1,
    "totalGastoMes": 3000000,
    "iva": 570000,
    "totalGastoMasIva": 3570000,
    "quienAsume": "Empleado"
  },
 {...}
]
```

---

## 🛠️ Tecnologías Utilizadas

- ⚙️ **Java** con OpenJDK 24.0.1
- 🌱 **Spring Boot** 3.5.3
- 📦 **Maven** como gestor de dependencias
- 🎯 Empaquetado en formato `JAR`
- 🧩 Arquitectura basada en MVC

---

## ✅ Cómo Ejecutar el Proyecto

### Prerrequisitos
- Java 17 o superior
- (Opcional) IntelliJ IDEA para facilitar el manejo del proyecto

### Clonar
```

```
https://github.com/marlonriveram/PruebaTecnica.git
---


