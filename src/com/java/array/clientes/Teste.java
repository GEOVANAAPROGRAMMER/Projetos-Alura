package com.java.array.clientes;

import java.util.ArrayList;

public class Teste {
	
	public static void main(String[] args) {
	
		ArrayList<Clientes> listaDeClientes = new ArrayList<>();
		
		Clientes cliente1 = new Clientes();
		
		cliente1.setNome("Geovana");
		cliente1.setIdade(22);
		
		Clientes cliente2 = new Clientes();
		
		cliente2.setNome("Cristiane");
		cliente2.setIdade(43);
		
		Clientes cliente3 = new Clientes();
		
		cliente3.setNome("Jessica");
		cliente3.setIdade(38);
		
		listaDeClientes.add(cliente1);
		listaDeClientes.add(cliente2);
		listaDeClientes.add(cliente3);
		
		System.out.println("Tamanho da lista: "+ listaDeClientes.size());
		System.out.println("Primeiro cliente: "+ listaDeClientes.get(0).getNome());
		System.out.println("Lista de clientes: "+ listaDeClientes);
		
		System.out.println("");
		
		for (Clientes c : listaDeClientes) {
		    System.out.println(c);
		}
	}

}
