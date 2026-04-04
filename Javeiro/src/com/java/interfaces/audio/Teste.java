package com.java.interfaces.audio;

public class Teste {
	
	public static void main(String[] args) {
		
		Musica minhaMusica = new Musica();
		
		minhaMusica.setTitulo("Perfect");
		minhaMusica.setDuracaoEmMinutos(200);
		minhaMusica.curtir();
		minhaMusica.reproduzir();
		minhaMusica.reproduzir();
		minhaMusica.reproduzir();
		minhaMusica.reproduzir();
		minhaMusica.reproduzir();
		minhaMusica.reproduzir();
		
		System.out.println("Classificação: "+ minhaMusica.getClassificação());
		
	}

}
