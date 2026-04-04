package com.java.heranca.carro;

public class ModeloCarro extends Carro {
	
	private String marca;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	@Override
	public void exibirInfos() {
		System.out.println("Marca: "+ this.marca);
		super.exibirInfos();
	}

}
