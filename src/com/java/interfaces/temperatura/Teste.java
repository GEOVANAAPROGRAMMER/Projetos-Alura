package com.java.interfaces.temperatura;

public class Teste {
	
	public static void main(String[] args) {
		
		ConversorTemperaturaPadrao conversorTemp = new ConversorTemperaturaPadrao();
		
		conversorTemp.celsiusParaFahrenheit(30.5);
		conversorTemp.fahrenheitParaCelsius(86.9);
		
		System.out.println("Celsius: "+ conversorTemp.getCelsius());
		System.out.println("Fahrenheit: "+ conversorTemp.getFahrenheit());
		
	}

}
