package com.java.catalogo.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.java.catalogo.modelo.Filme;
import com.java.catalogo.modelo.Serie;
import com.java.catalogo.modelo.Titulo;

public class Teste2 {
	
	public static void main(String[] args) {
		
		Filme HarryPotter = new Filme("Harry Potter e a Pedra Filosofal", 2001);
		HarryPotter.avalia(8);
		Filme jVorazes = new Filme("Jogos Vorazes", 2010);
		jVorazes.avalia(10);
		Filme crepusculo = new Filme("Crepusculo", 2014);
		crepusculo.avalia(7);
		Serie euNunca = new Serie("Eu nunca", 2020);
		euNunca.avalia(9);
		
		ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(HarryPotter);
        lista.add(crepusculo);
        lista.add(jVorazes);
        lista.add(euNunca);
		
		for (Titulo item : lista) {
			System.out.println(item);
			if( item instanceof Filme) {
				Filme filme = (Filme) item;
				System.out.println("Classificação: " + filme.getClassificacao());
			}
						
		}
		
		ArrayList<String> buscaPorArtista = new ArrayList<>();
		buscaPorArtista.add("Jack Chan");
		buscaPorArtista.add("Sandra Bullock");
		buscaPorArtista.add("Adam Sandler");
		
		// Ordenando list simples (String) com Collections
		System.out.println(buscaPorArtista);
		Collections.sort(buscaPorArtista);
		System.out.println(buscaPorArtista);
		
		// Ordenando list complexa (Classe com atributos) com Collections
		Collections.sort(lista);
		System.out.println(lista);
		
		System.out.println("");
		
		lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
		System.out.println(lista);
	}

}
