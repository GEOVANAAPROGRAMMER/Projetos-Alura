package com.java.interfaces.calculavel;

public class ProdutoFisico extends Produto implements Calculavel {
	
	private double frete = 0.20;


	@Override
	public double getCalcularPrecoFinal() {
		setPrecoFinal( getPreco() + (getPreco() + frete));
		return getPrecoFinal();
	}

}
