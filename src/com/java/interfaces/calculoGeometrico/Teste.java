package com.java.interfaces.calculoGeometrico;

public class Teste {
	
	public static void main(String[] args) {
		
		CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular();
		calculadora.setAltura(5);
		calculadora.setLargura(3);
		System.out.println("Cálculo da área do retângulo: " + calculadora.getCalcularArea()); 
		
		calculadora.setAltura(4);
		calculadora.setLargura(8);
		System.out.println("Cálculo do perímetro do retângulo: " + calculadora.getCalcularPerimetro());
		
	}

}
