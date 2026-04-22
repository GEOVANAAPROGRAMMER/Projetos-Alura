package com.java.interfaces.calculavel;

public class Teste {
	
	public static void main(String[] args) {
		Livro livro = new Livro();
		
		livro.setPreco(29.99);
		System.out.println("Valor do livro SEM desconto: R$ "+ livro.getPreco());
		System.out.println("Valor do livro COM desconto de 10%: R$ "+ livro.getCalcularPrecoFinal());
		
		ProdutoFisico prod = new ProdutoFisico();
		prod.setPreco(99.99);
		System.out.println("\nValor do produto SEM frete: R$ "+ prod.getPreco());
		System.out.println("Valor do produto COM frete de 20%: R$ "+ prod.getCalcularPrecoFinal());
		
	}

}
