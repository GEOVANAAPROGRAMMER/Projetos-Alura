package com.java.heranca.carro;

public class Teste {
	
	public static void main(String[] args) {
		
		ModeloCarro meuCarro = new ModeloCarro();
		
		meuCarro.definirModelo("Palio");
		meuCarro.definirPrecos(10000, 9800, 9500);
		meuCarro.setMarca("Fiat");
		
		System.out.println("Informações sobre o modelo de carro:");
		meuCarro.exibirInfos();
		
		System.out.println("Menor preço: " + meuCarro.calcularMenorPreco());
		System.out.println("Maior preço: " + meuCarro.calcularMaiorPreco());
		
	}

}