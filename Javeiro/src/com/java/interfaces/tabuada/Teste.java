package com.java.interfaces.tabuada;

public class Teste {
	
	public static void main(String[] args) {
		
		TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
		
		tabuada.setNum(2);
		System.out.println("Número para teste: " + tabuada.getNum());
		tabuada.mostrarTabuada();
	}

}
