package com.java.api.criptomoedas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class ConverteCriptoParaDolar {
	
	public static void main(String[] args) throws Exception, IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome da criptomoeda que deseja converter: ");
		String cripto = sc.nextLine().toLowerCase().replace(" ", "+");
		
		String url = "https://api.coingecko.com/api/v3/simple/price?vs_currencies=brl&ids="+ cripto + "&x_cg_demo_api_key=CG-JmHv6L6nKHNxF8ySxVJ2frJb";
		
		URLConnection conexaoServidor = new URL(url).openConnection();
		
		BufferedReader leitura = new BufferedReader(
				new InputStreamReader(conexaoServidor.getInputStream()));
		
		String linha;
		StringBuilder resposta = new StringBuilder();
		
		while((linha = leitura.readLine()) != null) {
			resposta.append(linha);
		}
		
		System.out.println(resposta);
		
		sc.close();
	}

}
