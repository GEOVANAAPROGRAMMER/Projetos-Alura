package com.java.objetos;

import java.time.Year;

public class Carro {

	private String modelo;
	private int ano;
	private String cor;
	
	public Carro (String modelo, int ano, String cor) {
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
	}
	
	
	public int idadeCarro() {
		Year anoCarro = Year.of(ano);
		Year dataAtual = Year.now();
		
		return dataAtual.getValue() - anoCarro.getValue();
	}
	
	public void exibirFichaTecnica() {
		System.out.println("Ficha técnica");
		System.out.println("Modelo: "+ modelo);
		System.out.println("Ano: "+ ano);
		System.out.println("Cor: "+ cor);
		System.out.println("O carro possui "+ idadeCarro() + " ano(s).");
	}
}
