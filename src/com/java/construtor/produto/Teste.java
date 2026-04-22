package com.java.construtor.produto;

import java.util.ArrayList;

public class Teste {
	
	public static void main(String[] args) {
	
		ArrayList<Produto> listaDeProdutos = new ArrayList<>();
		
		Produto p1 = new Produto("Arroz", 15.99, 4);
		Produto p2 = new Produto("Feijão", 5.99, 8);
		Produto p3 = new Produto("Açucar", 3.99, 6);
		Produto p4 = new Produto("Macarrão", 3.99, 10);
		Produto p5 = new Produto("Molho de Tomate", 2.99, 12);
		Produto p6 = new Produto("Óleo", 6.99, 4);
		Produto p7 = new Produto("Sal", 2.99, 1);
		
		listaDeProdutos.add(p1);
		listaDeProdutos.add(p2);
		listaDeProdutos.add(p3);
		listaDeProdutos.add(p4);
		listaDeProdutos.add(p5);
		listaDeProdutos.add(p6);
		listaDeProdutos.add(p7);
		
		ProdutoPerecivel perecivel = new ProdutoPerecivel("Carne", 44.99, 1, "12/04/2026");
		
		listaDeProdutos.add(perecivel);

//		Mostrar lista com toString		
//		System.out.println(listaDeProdutos);
		
		for (Produto i : listaDeProdutos) {
			System.out.println(i);
		}
		
		System.out.println("\nTamanho do ArrayList: " + listaDeProdutos.size());
		
		System.out.println("\nRecuperando o produto pelo índice: "+ listaDeProdutos.get(7).toString());
		
	}

}
