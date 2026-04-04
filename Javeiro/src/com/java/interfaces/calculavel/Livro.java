package com.java.interfaces.calculavel;

public class Livro extends Produto implements Calculavel {


	@Override
	public double getCalcularPrecoFinal() {
		setPrecoFinal(getPreco() - (getPreco() * 0.10));
		return getPrecoFinal();
	}

}
