package com.java.gravandoArquivos.veiculo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Principal {
	
	public static void main(String[] args) {
		
		String meuCarroJson;
		
		Veiculo meuCarro = new Veiculo();
		meuCarro.setModelo("Palio");
		meuCarro.setMarca("Fiat");
		meuCarro.setAnoLancamento(1997);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		meuCarroJson = gson.toJson(meuCarro);
		
		System.out.println("Objeto Veiculo serializado para JSON:");
		System.out.println(meuCarroJson);
	}

}
