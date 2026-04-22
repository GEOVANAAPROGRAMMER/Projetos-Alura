package com.java.api.books;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class BuscaLivro {
	
	public static void main(String[] args) throws MalformedURLException, IOException {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o nome do livro: ");
		String livro = sc.nextLine();
		
		// deixa minusculo e tira espaço
		livro = livro.toLowerCase().replace(" ", "+");
		
		// constroe caminho de url e faz requisição com o parametro "livro"
		String url = "https://www.googleapis.com/books/v1/volumes?q=flowers:"+ livro +"&key=AIzaSyAt2HiBzogkev5eGA5UmKFmN6vvlLuLuds";
		
		// pede para o servidor conectar na URL
		URLConnection connection = new URL (url).openConnection();
		
		// lê cada linha que a URL retorna
		BufferedReader leitura = new BufferedReader(
				new InputStreamReader (connection.
						getInputStream()));

		String linha;
		StringBuilder resposta = new StringBuilder();
		
		while((linha = leitura.readLine()) != null) {
			resposta.append(linha);
		}
		
		System.out.println(resposta);
		
		sc.close();
	}

}
