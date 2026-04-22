package com.java.array.forma;

public class Circulo implements Forma {
	
	private double raio;
	
	public Circulo (double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return 3.14 * (raio * raio);
	}

}
