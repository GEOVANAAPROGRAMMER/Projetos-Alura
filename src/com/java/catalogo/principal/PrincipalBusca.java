package com.java.catalogo.principal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java.catalogo.modelo.Titulo;
import com.java.catalogo.modelo.TituloOmdb;

public class PrincipalBusca {
	
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o nome de um filme:");
		String filme = sc.nextLine();
		
        String url = "https://www.omdbapi.com/?t=" + filme + "&apikey=d38054d8";
        
        URLConnection connection = new URL(url).openConnection();
        
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(connection.getInputStream())
        );
        
        String linha;
        
        StringBuilder resposta = new StringBuilder();
        
        while ((linha = reader.readLine()) != null) {
            resposta.append(linha);
        }
        
        reader.close();
        String json = resposta.toString();
        System.out.println(json);
        
        // define o padrão de nomes dos campos como a primeira letra maiuscula (recebe years -> transforma em Years)
        Gson gson = new GsonBuilder()
        		.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
        		.create();
        
        TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
        
        Titulo meuTitulo = new Titulo(meuTituloOmdb);
        
        System.out.println(meuTitulo);
        
        sc.close();
    }
}