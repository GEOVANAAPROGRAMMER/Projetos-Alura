package com.java.api.livros;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ApiLivros {

	public static void main(String[] args) {


		String json = "{\"Titulo\": \"A Passagem\", \"Autor\":\"Justin Cronin\", \"Editora\":{\"Nome\":\"Arqueiro\",\"Cidade\":\"Nova York\"}}";
		
		Gson gson = new GsonBuilder().
				setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
		
		Livro l1 = gson.fromJson(json, Livro.class); 
		
		System.out.println(l1);

	}

}
