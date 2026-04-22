package com.java.interfaces.conversor;

public class Teste {
	
	public static void main(String[] args) {
		
		ConversorMoeda conversorMoeda = new ConversorMoeda();
		conversorMoeda.setValor(1000);
		System.out.println("Valor em Dolar: $" + conversorMoeda.getValor());
		System.out.println("Valor convertido para Real: R$ "+ conversorMoeda.getConverterDolarParaReal());
		
	}

}
