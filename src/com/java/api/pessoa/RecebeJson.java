package com.java.api.pessoa;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class RecebeJson {
	
	public static void main(String[] args) {
		
		String json = "{\"Nome\": \"Geovana\", \"Idade\": 22, \"Cidade\": \"São Paulo\", \"Profissão\": \"Dev\"}";
		
		Gson gson = new GsonBuilder().
				setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).
				setLenient()
                .create();
		
		Pessoa p1 = gson.fromJson(json, Pessoa.class); 
		
		System.out.println(p1);
	}

}
