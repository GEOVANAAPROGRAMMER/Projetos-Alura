package com.java.array.produto;

import java.util.ArrayList;

public class Teste {
	
	public static void main(String[] args) {
		
		ArrayList<Produto> listaProdutos = new ArrayList<>();
		
		Produto p1 = new Produto("Maçã", 12.99);
		Produto p2 = new Produto("Pêra", 15.99);
		Produto p3 = new Produto("Manga", 8.99);
		Produto p4 = new Produto("Banana", 4.99);
		Produto p5 = new Produto("Mamão", 9.99);
		
		listaProdutos.add(p1);
		listaProdutos.add(p2);
		listaProdutos.add(p3);
		listaProdutos.add(p4);
		listaProdutos.add(p5);
		
		double soma = 0;
		for (Produto item : listaProdutos) {
			soma += item.getPreco();
		}
		
		double media = soma / listaProdutos.size();
		
		System.out.println("Preço médio dos produtos: " + media); 
		
	}

}
