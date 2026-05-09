package com.java.api.pessoa;

public class Pessoa {

	private String nome;
	private int idade;
	private String cidade;
	
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public String getCidade() {
		return cidade;
	}

	@Override
	public String toString() {
		return "Nome: "+ nome + "\nIdade: "+ idade +"\nCidade: "+ cidade;
	}
}
