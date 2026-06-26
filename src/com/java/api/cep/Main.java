package com.java.api.cep;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException, Exception {
		
		Scanner sc = new Scanner (System.in);
		
		String cep;
		String linguagem;
		
		System.out.println("Informe o numero do seu CEP: ");
		cep = sc.next();
		System.out.println("Informe o formato (json ou xml) deseja receber as informações:");
		linguagem = sc.next();
		
		ApiCep conectaApiCep = new ApiCep();
		conectaApiCep.setCep(cep);
		conectaApiCep.setLinguagem(linguagem);
		conectaApiCep.criaConexaoApiCep();
		
		conectaApiCep.geraArquivoJson();
		
		sc.close();
	}
	
}
