# 📘 Ejercicios de Herencia en Java

## 📌 Descripción

Este proyecto contiene 10 ejercicios prácticos enfocados en el uso de **herencia**, **sobrescritura de métodos (@Override)** y **polimorfismo** en Java.

Cada ejercicio está organizado en su propio package y demuestra cómo una clase hija puede extender el comportamiento de una clase padre.

---

## 🧱 Estructura del Proyecto

Cada ejercicio está separado en packages:

```
ejercicio1/
ejercicio2/
ejercicio3/
...
ejercicio10/
```

---

## 🧠 Conceptos Aplicados

### 🔹 Herencia

Se utilizó la palabra clave `extends` para permitir que una clase hija herede atributos y métodos de una clase padre.

Ejemplo:

```java
class Perro extends Animal
```

---

### 🔹 Sobrescritura de métodos

Se utilizó `@Override` para redefinir métodos de la clase base y adaptar su comportamiento.

Ejemplo:

```java
@Override
public void hacerSonido() {
    System.out.println("El perro ladra");
}
```

---

### 🔹 Polimorfismo

En todos los ejercicios se usa una referencia del tipo base apuntando a un objeto del subtipo.

Ejemplo:

```java
Animal a = new Perro();
```

Esto permite que Java ejecute el método sobrescrito de la clase hija.

---

## 🧪 Ejercicios Incluidos

### 1. Animal y Perro

* Se sobrescribe el método `hacerSonido()`

### 2. Figura y Rectángulo

* Se sobrescribe `area()` para calcular base * altura

### 3. Empleado y Vendedor

* Se agrega `comision` y se sobrescribe `resumen()`

### 4. Cuenta y CuentaAhorro

* Se sobrescribe `depositar()` agregando interés

### 5. Transporte y Avión

* Se sobrescribe `moverse()`

### 6. Persona y Estudiante

* Se sobrescribe `presentarse()` agregando datos

### 7. Vehículo y Motocicleta

* Se sobrescribe `encender()`

### 8. Producto y ProductoDigital

* Se sobrescribe `mostrarDescripcion()`

### 9. Instrumento y Guitarra

* Se sobrescribe `tocar()`

### 10. Trabajador y TrabajadorPorHora

* Se sobrescribe `calcularPago()`

---

## 🎯 Conclusión

Estos ejercicios permiten comprender cómo:

* Reutilizar código con herencia
* Personalizar comportamientos con sobrescritura
* Aplicar polimorfismo en tiempo de ejecución

Son la base para desarrollar sistemas más complejos en Java usando Programación Orientada a Objetos.

---