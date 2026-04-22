package com.java.array.loop;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
	
		ArrayList<String> listaNome = new ArrayList<>();
		
		listaNome.add("Daniel");
		listaNome.add("Luiz");
		listaNome.add("Tiago");
		listaNome.add("Ronaldo");
		
		for (String item : listaNome) {
			System.out.println(item);
		}
	}

	
}
