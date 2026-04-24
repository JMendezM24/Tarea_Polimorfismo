package dev.polimorfismo.ejercicio8;

public class ProductoDigital extends Producto {
	private String formato;

    public ProductoDigital(String nombre, double precio, String formato) {
        super(nombre, precio);
        this.formato = formato;
    }

    @Override
    public void mostrarDescripcion() {
        System.out.println(nombre + " - Q" + precio + " | Formato: " + formato);
    }

}
