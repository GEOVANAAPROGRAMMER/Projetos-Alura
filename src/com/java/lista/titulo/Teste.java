package com.java.lista.titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teste {
	
	public static void main(String[] args) {
	
		List<Titulo> meusFilmes = new ArrayList<>();
		
		Titulo f1 = new Titulo("Como eu era antes de você");
		Titulo f2 = new Titulo("Para todos os garotos que já amei");
		Titulo f3 = new Titulo("Chush à altura");
		Titulo f4 = new Titulo("Idas e vindas do amor");
		Titulo f5 = new Titulo("O Diabo veste Prada");
		
		meusFilmes.add(f1);
		meusFilmes.add(f2);
		meusFilmes.add(f3);
		meusFilmes.add(f4);
		meusFilmes.add(f5);
		
		Collections.sort(meusFilmes);
		
		meusFilmes.forEach(item ->
				System.out.println(item)
		);
		
	}
}
