package com.java.lista.exercicio2;

public class Compra implements Comparable <Compra> {
	
	private String descricao;
	private double preco;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return getDescricao() + " ("+ getPreco() + ") ";
	}
	
	@Override
	public int compareTo(Compra outraCompra) {
		
		// Converte os valores primitivos (double) para objetos Double
	    // para utilizar o método compareTo da classe Double.
	    // Esse método compara os preços:

	    // Isso permite ordenar objetos Compra pelo preço (ordem crescente).
		return Double.valueOf(this.preco).compareTo(Double.valueOf(outraCompra.preco));
	}

}
