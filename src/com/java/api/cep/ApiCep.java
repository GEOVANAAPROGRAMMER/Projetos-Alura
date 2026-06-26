package com.java.api.cep;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ApiCep  {
	
	Gson gson = new GsonBuilder()
			.setPrettyPrinting()
			.create();
	
	private String cep;
	private String linguagem;
	private String url;
	private String endereco;
	
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
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
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
		
		System.out.println(resposta);
		
		endereco = resposta.toString();

        leitura.close();

	}
	
	public void geraArquivoJson() throws IOException {		
		FileWriter arquivoJson = new FileWriter ("ArquivoDeEndereco.json");
		// tranforma o "endereco" que é um json em um objeto qualquer
		// gson tranforma em texto e formata
		arquivoJson.write(gson.toJson(gson.fromJson(endereco, Object.class)));
		arquivoJson.close();
	}

}










