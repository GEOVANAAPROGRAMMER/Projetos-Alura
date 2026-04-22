package com.java.objetos;

public class Livro {
	
	private String titulo;
	private String autor;

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void exibirDetalhes() {
		System.out.println("Detalhes do Livro:");
		System.out.println("Título: "+ this.titulo);
		System.out.println("Autor: "+ this.autor);
	}

}
