package dev.polimorfismo.ejercicio8;

public class Producto {
	protected String nombre;
    protected double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarDescripcion() {
        System.out.println(nombre + " - Q" + precio);
    }

}
