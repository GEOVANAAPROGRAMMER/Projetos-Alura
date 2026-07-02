package com.java.api.cep;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GeradorArquivoJson {
	
	Gson gson = new GsonBuilder()
			.setPrettyPrinting()
			.create();
	
	ApiCep apicep = new ApiCep();
	
	public void geraArquivoJson() throws IOException {		
	FileWriter arquivoJson = new FileWriter ("ArquivoDeEndereco.json");
	// tranforma o "endereco" que é um json em um objeto qualquer
	// gson tranforma em texto e formata
	arquivoJson.write(gson.toJson(apicep.getEnderecoJson()));
	arquivoJson.close();
}

}
