package com.java.lista.tiposListas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TiposListas {
	
	public static void main(String[] args) {
	
		List<String> listaArrayList  = new ArrayList<>();
		
		listaArrayList.add("A 1");
		listaArrayList.add("A 2");
		
		List<String> listaLinkedList  = new LinkedList<>();

		listaLinkedList.add("B 1");
		listaLinkedList.add("B 2");
		
		System.out.println(listaArrayList);
		System.out.println(listaLinkedList);
	}

}
