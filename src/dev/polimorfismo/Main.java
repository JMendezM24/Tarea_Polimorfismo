package dev.polimorfismo;
import dev.polimorfismo.ejercicio1.*;
import dev.polimorfismo.ejercicio2.*;
import dev.polimorfismo.ejercicio3.*;
import dev.polimorfismo.ejercicio4.*;
import dev.polimorfismo.ejercicio5.*;
import dev.polimorfismo.ejercicio6.*;
import dev.polimorfismo.ejercicio7.*;
import dev.polimorfismo.ejercicio8.*;
import dev.polimorfismo.ejercicio9.*;
import dev.polimorfismo.ejercicio10.*;



public class Main {
	public static void main(String[] args) {
        System.out.println("===== EJERCICIO 1 =====");
        Animal animal = new Perro();
        animal.hacerSonido();
        
        System.out.println("\n===== EJERCICIO 2 =====");
        Figura figura = new Rectangulo(5, 3);
        System.out.println("Área: " + figura.area());
        
        System.out.println("\n===== EJERCICIO 3 =====");
        Empleado empleado = new Vendedor("Juan", 1500);
        System.out.println(empleado.resumen());
        
        System.out.println("\n===== EJERCICIO 4 =====");
        Cuenta cuenta = new CuentaAhorro(1000);
        cuenta.depositar(500);
        System.out.println("Saldo final: " + cuenta.getSaldo());
        
        System.out.println("\n===== EJERCICIO 5 =====");
        Transporte transporte = new Avion();
        transporte.moverse();
        
        System.out.println("\n===== EJERCICIO 6 =====");
        Persona persona = new Estudiante("2026001", "Ingeniería en Sistemas");
        persona.presentarse();
        
        System.out.println("\n===== EJERCICIO 7 =====");
        Vehiculo vehiculo = new Motocicleta();
        vehiculo.encender();
        
        System.out.println("\n===== EJERCICIO 8 =====");
        Producto producto = new ProductoDigital("Curso Java", 200, "Online");
        producto.mostrarDescripcion();
        
        System.out.println("\n===== EJERCICIO 9 =====");
        Instrumento ins = new Guitarra();
        ins.tocar();
        
        System.out.println("\n===== EJERCICIO 10 =====");
        Trabajador trab = new TrabajadorPorHora(40, 25);
        System.out.println("Pago: Q" + trab.calcularPago());
        
        /*
        =========================
        EXPLICACIÓN GENERAL
        =========================
        Herencia:
        Se utilizó la palabra clave 'extends' para que una clase hija herede atributos y métodos de una clase padre.

        Sobrescritura:
        Se utilizó '@Override' para redefinir métodos de la clase base y darles comportamiento específico.

        Polimorfismo:
        En todo el Main se usa una referencia del tipo base apuntando a un objeto del subtipo.
        Ejemplo: Animal animal = new Perro();

        Esto permite verificar:
          Herencia correcta
          Sobrescritura funcional
          Polimorfismo en ejecución
        */
 
    }

}
