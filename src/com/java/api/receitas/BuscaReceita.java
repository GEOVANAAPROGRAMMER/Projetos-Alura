package com.java.api.receitas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class BuscaReceita {
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o nome da receita: ");
		String receita = sc.nextLine().toLowerCase().replace(" ", "+");
		
		String url = "https://www.themealdb.com/api/json/v1/1/search.php?s="+ receita;
		
		URLConnection conexaoServidor = new URL(url).openConnection();
		
		BufferedReader leitura = new BufferedReader (
				new InputStreamReader (conexaoServidor.getInputStream()));
		
		String linha;
		StringBuilder resposta = new StringBuilder();
		
		while(( linha = leitura.readLine()) != null ) {
			resposta.append(linha);
		}
		
		System.out.println(resposta);
		
		sc.close();
		
	}

}
