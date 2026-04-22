package com.java.heranca.animal;

public class Gato extends Animal {
	
	@Override
	public void emitirSom() {
		System.out.println("Miauu, miauuu");;
	}
	
	public void arranharMoveis() {
		System.out.println("Arranhando móveis...");
	}

}
