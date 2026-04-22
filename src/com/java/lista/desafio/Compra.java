package com.java.lista.desafio;

public class Compra {
	
	private double preco;
	private String descricao;
	

	public void setPreco(double nextDouble) {
		this.preco = nextDouble;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getPreco() {
		return preco;
	}

	
	@Override
	public String toString() {
		return "Produto: " + descricao + " (" + preco + ")";
	}


}
