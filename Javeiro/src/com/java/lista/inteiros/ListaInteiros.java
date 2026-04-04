package com.java.lista.inteiros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaInteiros {
	
	public static void main(String[] args) {
	
		List<Integer> listaDeNumeros = new ArrayList<>();
		
		listaDeNumeros.add(7);
		listaDeNumeros.add(5);
		listaDeNumeros.add(3);
		listaDeNumeros.add(9);
		listaDeNumeros.add(7);
		
		Collections.sort(listaDeNumeros);
		
		System.out.println(listaDeNumeros);
	}

}
