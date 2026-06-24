package com.java.gravandoArquivos.arquivo;

import java.io.FileWriter;
import java.io.IOException;

public class GravacaoDeArquivo {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter arquivo = new FileWriter("arquivo.txt");
		arquivo.write("Conteúdo a ser gravado no arquivo.");
		arquivo.close();
		
		System.out.println("Programa finalizado com sucesso!");
	}
	
	// gravando no arquivo
//	FileWriter escrito = new FileWriter("Lista de Filmes.txt");
//	escrito.write(meuTitulo.toString());
//	escrito.close();
//	System.out.println(System.getProperty("user.dir"));

}
