package com.java.lista.tiposListas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListaPolimorfica {
	
	public static void main(String[] args) {
		
		List <String> listaPolimorfica;
		
		listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);
    }

}
