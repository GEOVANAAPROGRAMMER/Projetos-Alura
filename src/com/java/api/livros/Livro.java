package com.java.api.livros;

public class Livro {
	
	private String titulo;
	private String autor;
	private Editora editora;
	
	public Livro (String titulo, String autor, Editora editora) {
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	
	public Editora getEditora() {
		return editora;
	}

	public String toString() {
		return "Título: "+ titulo +
			   "\nAutor: "+ autor +
			   "\nEditora: "+ editora.getNome() +
			   "\nCidade: "+ editora.getCidade();
	}
}
