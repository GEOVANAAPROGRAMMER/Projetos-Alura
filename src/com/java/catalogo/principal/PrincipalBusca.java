package com.java.catalogo.principal;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java.catalogo.excecao.ErroAoConverterAnoException;
import com.java.catalogo.modelo.Titulo;
import com.java.catalogo.modelo.TituloOmdb;

public class PrincipalBusca {

	public static void main(String[] args) throws Exception {

		String filme = "";
		List <Titulo> listaDeFilmes = new ArrayList<>();	
		
		// define o padrão de nomes dos campos como a primeira letra maiuscula (recebe
		// years -> transforma em Years)
		Gson gson = new GsonBuilder()
				.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
				.setPrettyPrinting()
				.create();
		
		Scanner sc = new Scanner(System.in);
		
		while (!filme.equalsIgnoreCase("sair")) {

			System.out.println("Digite o nome de um filme:");
			filme = sc.nextLine();
			
			if(filme.equalsIgnoreCase("sair")) {
				
				break;
			}

			String url = "https://www.omdbapi.com/?t=" + filme.replaceAll(" ", "+") + "&apikey=d38054d8";
			try {
				URLConnection connection = new URL(url).openConnection();

				BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

				String linha;

				StringBuilder resposta = new StringBuilder();

				while ((linha = reader.readLine()) != null) {
					resposta.append(linha);
				}

				reader.close();
				String json = resposta.toString();
				System.out.println(json);

				TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);

				Titulo meuTitulo = new Titulo(meuTituloOmdb);
				System.out.println("Título convertido:");
				System.out.println(meuTitulo);
				
				listaDeFilmes.add(meuTitulo);
				

			} catch (NumberFormatException e) {
				System.out.println("Aconteceu um erro:");
				System.out.println(e.getMessage());
			} catch (ErroAoConverterAnoException e) {
				System.out.println("Aconteceu um erro:");
				System.out.println(e.getMessage());
			}
			
			
		}
		
//		listaDeFilmes.forEach(meuTitulo -> System.out.println(meuTitulo));
		System.out.println(listaDeFilmes);
		
		FileWriter escrito = new FileWriter("Lista de Filmes.json");
		escrito.write(gson.toJson(listaDeFilmes));
		escrito.close();
		
		System.out.println("Programa finalizado! ");
		sc.close();
	}
}