package com.java.interfaces.audio;

public class Audio {
	
	private String titulo;
	private int duracaoEmMinutos;
	private int totalDeReproducao;
	private int curtida;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}
	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}
	public int getTotalDeReproducao() {
		return totalDeReproducao;
	}
	
	public int getCurtida() {
		return curtida;
	}

	public int getClassificação() {
		return this.classificar();
	}

	
	public void curtir() {
		curtida ++;
	}
	
	public void reproduzir() {
		totalDeReproducao ++;
	}
	
	public int classificar() {
		
		if( totalDeReproducao > 3) {
			return 10;
		} else if ( totalDeReproducao > 2) {
			return 7;
		} else {
			return 5;
		}
	}

}
