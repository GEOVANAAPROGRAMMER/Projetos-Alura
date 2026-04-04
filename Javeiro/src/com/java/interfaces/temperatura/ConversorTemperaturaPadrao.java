package com.java.interfaces.temperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
	
	private double celsius;
	private double fahrenheit;

	public double getCelsius() {
		return celsius;
	}

	public double getFahrenheit() {
		return fahrenheit;
	}

	@Override
	public double celsiusParaFahrenheit(double celsius) {
		this.celsius = celsius;
		return (celsius * 9/5) + 32 ;
	}

	@Override
	public double fahrenheitParaCelsius(double fahrenheit) {
		this.fahrenheit = fahrenheit;
		return (fahrenheit - 32) * 5/9;
	}
	
	

}
