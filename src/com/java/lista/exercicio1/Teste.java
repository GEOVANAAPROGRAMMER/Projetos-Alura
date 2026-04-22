package com.java.lista.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Teste {
	
	public static void main(String[] args) {
	
		List <Produtos> listaDeProdutos = new ArrayList<>();
		
		Produtos p1 = new Produtos("Sabonete", 2.99);
		Produtos p2 = new Produtos("Shampoo", 32.99);
		Produtos p3 = new Produtos("Hidratante", 48.99);
		Produtos p4 = new Produtos("Óleo", 26.99);
		Produtos p5 = new Produtos("Batom", 8.99);
		Produtos p6 = new Produtos("Pente", 10.99);
		
		listaDeProdutos.add(p1);
		listaDeProdutos.add(p2);
		listaDeProdutos.add(p3);
		listaDeProdutos.add(p4);
		listaDeProdutos.add(p5);
		listaDeProdutos.add(p6);
		
		listaDeProdutos.forEach(item -> {
			System.out.println(item);
		});
		
	}

}
