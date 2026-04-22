package com.java.catalogo.principal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class PrincipalBusca {
	
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o nome de um filme:");
		String filme = sc.nextLine();
		
		// URL da API (filme + chave de acesso)
        String url = "https://www.omdbapi.com/?t=" + filme + "&apikey=d38054d8";
        
        // Cria um objeto URL e abre uma conexão com o servidor
        URLConnection connection = new URL(url).openConnection();
        
        // Cria um leitor para ler os dados que vêm da conexão
        // InputStreamReader converte os dados (bytes) em texto
        // BufferedReader permite ler linha por linha (mais eficiente)
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(connection.getInputStream())
        );
        
        // Variável para armazenar cada linha da resposta
        String linha;
        
        // StringBuilder para montar a resposta completa (melhor performance que String)
        StringBuilder resposta = new StringBuilder();
        
        // Loop que lê cada linha retornada pela API até não haver mais (null)
        while ((linha = reader.readLine()) != null) {
            resposta.append(linha);
        }
        
        reader.close();
        
        // Exibe no console toda a resposta da API (JSON)
        System.out.println(resposta.toString());
        
        sc.close();
    }
}