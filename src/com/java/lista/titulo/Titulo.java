package com.java.lista.titulo;

public class Titulo implements Comparable<Titulo> {
	
	private String nome;
	
	public Titulo(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	@Override
	public String toString() {
		return "Filme: "+ this.nome;
	}

	@Override
	public int compareTo(Titulo outrosTitulos) {
		return this.getNome().compareTo(outrosTitulos.getNome());
	}

}
