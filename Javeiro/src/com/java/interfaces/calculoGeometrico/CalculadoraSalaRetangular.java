package com.java.interfaces.calculoGeometrico;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
	
	private double altura;
	private double largura;

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	@Override
	public double getCalcularArea() {
		return altura * largura;
	}

	@Override
	public double getCalcularPerimetro() {
		return 2 * (altura + largura);
	}

}
