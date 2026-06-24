package com.java.gravandoArquivos.titulo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Principal {
	
	public static void main(String[] args) {
		
		String filme;
		
		Titulo meuTitulo = new Titulo();
		meuTitulo.setTitulo("Harry Potter");
		meuTitulo.setAutor("J.K. Rowling");
		meuTitulo.setAnoLancamento(210);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		filme = gson.toJson(meuTitulo);
		System.out.println(filme);
	}

}
