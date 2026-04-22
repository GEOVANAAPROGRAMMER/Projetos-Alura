package com.java.lista.exercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SistemaDeCompras {
	
	private double limiteCartao;
	private double saldo;
	private List <Compra> listaDeCompra = new ArrayList<>();
	private int opcao = 1;
	private double soma = 0;
	
	public void inicia () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o limite do cartão:");
		limiteCartao = sc.nextDouble();
		saldo = limiteCartao;
		
		while (opcao != 0 ) {
		
			Compra compra = new Compra();
			
			System.out.println("Digite o nome do produto: ");
			compra.setDescricao(sc.next());
			
			System.out.println("Digite o valor do produto: ");
			compra.setPreco(sc.nextDouble());
			
			realizaCompra(compra);
			somaValores(compra);
			
			System.out.println("Para sair digite 0, para continuar digite 1:");
		    opcao = sc.nextInt();
		}
		
		System.out.println("Lista de compras: ");
		Collections.sort(listaDeCompra);
		System.out.println(listaDeCompra);
		
		System.out.println("Soma: " + soma);
		
		mostraMenorNumero();
		mostraMaiorNumero();
		
		System.out.println("Lista com filtro: ");
		listaComFiltro();
		
		sc.close();
	}
	
	private void realizaCompra(Compra compra) {
		if (saldo >= compra.getPreco()) {
			saldo -= compra.getPreco();
			System.out.println("Compra realizada!");
			
			listaDeCompra.add(compra);
		} else {
			System.out.println("Compra NÃO realizada. Saldo insuficiente!");
		}
		
		System.out.println("Saldo disponível: "+ saldo);
	}
	
	private void somaValores(Compra compra) {
		soma += compra.getPreco();
	}
	
	private void mostraMenorNumero() {
		Compra menor = Collections.min(listaDeCompra, 
				Comparator.comparing(Compra:: getPreco));
		System.out.println("Valor da compra mais barata: "+ menor);
	}
	
	private void mostraMaiorNumero() {
		Compra maior = Collections.max(listaDeCompra, 
				Comparator.comparing(Compra:: getPreco));
		System.out.println("Valor da compra mais cara: "+ maior);
	}
	
	 // Filtro: manter apenas precos > 50 e precos < 10
	 // Não precisa de entrada de parâmetro pq listaDeCompra é um atributo da classe
	private void listaComFiltro() {
		List<Compra> listaComFiltro = listaDeCompra.stream()
	            .filter(c -> c.getPreco() > 50 || c.getPreco() < 10)
	            .collect(Collectors.toList());

	    System.out.println(listaComFiltro);
	}
    

}
