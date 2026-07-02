package com.java.api.cep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class ApiCep  {
	
	private String cep;
	private String linguagem;
	private String url;
	private String enderecoJson;
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getLinguagem() {
		return linguagem;
	}
	
	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
	
	public String getEnderecoJson() {
		return enderecoJson;
	}
	public void setEnderecoJson(String enderecoJson) {
		this.enderecoJson = enderecoJson;
	}
	
	
	public void criaConexaoApiCep() throws IOException, Exception {
		// cria endereço url
		url = "https://viacep.com.br/ws/" + cep + "/"+ linguagem +"/";
		
		// abre conexão com servidor
		URLConnection conexao = new URL (url).openConnection();
		
		// captura o response na variavel "leitura"
		BufferedReader leitura = new BufferedReader(
				new InputStreamReader(
						conexao.getInputStream()));
		
		// percorre a variavel "leitura" e armazena na variavel resposta
		String linha;
        StringBuilder resposta = new StringBuilder();
        		
		while ((linha = leitura.readLine()) != null) {
            resposta.append(linha);
        }
		
		enderecoJson = 	resposta.toString();

        leitura.close();
	}

}










