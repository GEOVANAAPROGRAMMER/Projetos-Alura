package com.java.catalogo.modelo;

public class TituloOmdb {
	
	private String title;
	private String year;
	private String runtime;
	
	public TituloOmdb(String title, String year, String runtime) {
		this.title = title;
		this.year = year;
		this.runtime = runtime;
	}
	
	public String getTitle() {
		return title;
	}
	public String getYear() {
		return year;
	}
	public String getRuntime() {
		return runtime;
	}
	
	@Override
	public String toString () {
		return "Titulo: "+ title + " Ano de Lançamento: " + year + " Tempo: " + runtime;
		
	}

}
