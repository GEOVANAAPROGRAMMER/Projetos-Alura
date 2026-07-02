package com.java.api.cep;

import java.io.IOException;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) throws IOException, Exception {
		
		Gson gson = new GsonBuilder()
				.setPrettyPrinting()
				.create();
		
		Scanner sc = new Scanner (System.in);

		System.out.println("Informe o numero do seu CEP: ");
		String cep = sc.next();
		System.out.println("Informe o numero da residência: ");
		int numero = sc.nextInt();
		System.out.println("Informe o formato (json ou xml) que deseja receber as informações:");
		String linguagem = sc.next();
		
		ApiCep ApiCep = new ApiCep();
		ApiCep.setCep(cep);
		ApiCep.setLinguagem(linguagem);
		ApiCep.criaConexaoApiCep();
		
		GeradorArquivoJson geradorArquivoJson = new GeradorArquivoJson();
		geradorArquivoJson.geraArquivoJson();
		

		Endereco endereco = gson.fromJson(ApiCep.getEnderecoJson(), Endereco.class);
		endereco.setNumero(numero);
		System.out.println("Endereço encontrado:");
		
		System.out.println(endereco);
		
		sc.close();
	}
	
}
