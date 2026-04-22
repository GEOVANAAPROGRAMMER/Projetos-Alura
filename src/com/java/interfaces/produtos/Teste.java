package com.java.interfaces.produtos;

public class Teste {
	
	public static void main(String[] args) {
		
		Produtos camisa = new Produtos();
		camisa.setNome("Camisa Harry Potter");
		camisa.setPreco(100);
		camisa.setQuantidade(4);
		System.out.println("Valor unitário do produto: R$" + camisa.getPrecoUnitario());
		camisa.getCalcularPrecoFinal();
		
		System.out.println("Valor da compra sem desconto: R$" + camisa.getPrecoVenda());
		System.out.println("Valor final da compra: R$ "+ camisa.getCalcularPrecoFinal());
		
		Servicos site = new Servicos();
		
		site.setNome("Site do Harry Potter");
		site.setPreco(100);
		site.setHoras(16);
		System.out.println("\nValor final do site: R$ " + site.getCalcularPrecoFinal());
		
	}

}
