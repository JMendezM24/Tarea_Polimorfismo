package dev.polimorfismo.ejercicio4;

public class Cuenta {
	 protected double saldo;
	
	 public Cuenta(double saldo) {
	        this.saldo = saldo;
	    }
	 
	  public double getSaldo() {
		return saldo;
	}
	 
	  public void depositar(double monto) {
	        saldo += monto;
	    }

}
