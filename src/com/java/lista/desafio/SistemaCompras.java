package com.java.lista.desafio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SistemaCompras {
	
	private double limite;
	private double saldo;
	List <Compra> listaDeCompras = new ArrayList<>();
	
	public void iniciarCompra() {
		
		Scanner sc = new Scanner(System.in);
		
		int opcao = 1;
				
		System.out.println("Digite o limite do cartão:");
		limite = sc.nextDouble();
		saldo = limite;
		
		while (opcao != 0) {
			
			Compra compra = new Compra();
			
			System.out.println("Digite o nome do produto:");
		    compra.setDescricao(sc.next());
		    
		    System.out.println("Digite o valor do produto:");
		    compra.setPreco(sc.nextDouble());
		    
		    ComprarRoupa(compra);
		    
		    System.out.println("Para sair digite 0, para continuar digite 1:");
		    opcao = sc.nextInt();
		    
		    
		}
		
		listaDeCompras.sort(Comparator.comparing(Compra :: getPreco));
		System.out.println(listaDeCompras);
		
		sc.close();
		
	}
	
	public void ComprarRoupa(Compra compra) {
		if (compra.getPreco() <= saldo) {
			saldo -= compra.getPreco();
			System.out.println("Compra realizada!");
			listaDeCompras.add(compra);			
		} else {
			System.out.println("Saldo insuficiente!");
			
		}
		System.out.println("Saldo disponível: " + saldo);
	}

}
