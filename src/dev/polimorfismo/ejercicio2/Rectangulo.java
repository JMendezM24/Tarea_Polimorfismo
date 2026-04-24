package dev.polimorfismo.ejercicio2;

public class Rectangulo extends Figura {
	 private double base, altura;

	    public Rectangulo(double base, double altura) {
	        this.base = base;
	        this.altura = altura;
	    }

	    @Override
	    public double area() {
	        return base * altura;
	    }

}
