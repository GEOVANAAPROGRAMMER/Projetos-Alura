package com.java.array.animal;


public class Teste {
	
	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		
		//cast
		if (cachorro instanceof Cachorro) {
			Animal animal = (Animal) cachorro;
		}
		
		
	}

}
