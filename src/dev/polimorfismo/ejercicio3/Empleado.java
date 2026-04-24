package dev.polimorfismo.ejercicio3;

public class Empleado {
	protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String resumen() {
        return "Empleado: " + nombre;
    }

}
