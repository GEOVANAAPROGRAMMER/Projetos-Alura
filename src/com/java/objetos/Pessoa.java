package com.java.objetos;

public class Pessoa {
	
	private String nome;
	private int idade;
	
	public Pessoa() {
		System.out.println("Olá mundo!");
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void verificaIdade() {
		if (idade >= 18) {
			System.out.println("Maior de idade!");
		} else {
			System.out.println("Menor de idade!");
		}
	}

}
