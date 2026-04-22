package com.java.catalogo.calculadora;

import com.java.catalogo.modelo.Titulo;

public class CalculadoraDeTempo {
	
	private int tempoTotal;

	public int getTempoTotal() {
		return tempoTotal;
	}
	
	public void incluiNoCalculo(Titulo t) {
		this.tempoTotal = t.getDuracaoEmMinutos();
	}

}
