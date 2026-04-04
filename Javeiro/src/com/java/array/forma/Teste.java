package com.java.array.forma;

import java.util.ArrayList;

public class Teste {
	
	public static void main(String[] args) {
	
		ArrayList<Forma> listaCalculosArea = new ArrayList<>();
		Circulo circulo1 = new Circulo(5);
		Circulo circulo2 = new Circulo(8);
		Quadrado quadrado1 = new Quadrado(5);
		Quadrado quadrado2 = new Quadrado(8);
		
		
		listaCalculosArea.add(circulo1);
		listaCalculosArea.add(circulo2);
		listaCalculosArea.add(quadrado1);
		listaCalculosArea.add(quadrado2);
		
		for (Forma item : listaCalculosArea) {
			if (item instanceof Circulo) {
				Circulo circulo = (Circulo) item;
				System.out.println("Área do circulo: "+ circulo.calcularArea());
			} else if (item instanceof Quadrado) {
				Quadrado quadrado = (Quadrado) item;
				System.out.println("Área do quadrado: "+ quadrado.calcularArea());
			}
		}
	}
}
