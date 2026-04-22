package com.java.interfaces.produtos;

public class Produtos extends ProdutosEServicos implements Vendavel {
	


	@Override
	public double getCalcularPrecoFinal() {
		
		if( getQuantidade() <= 3) {
			setPrecoVenda(
					getPrecoUnitario() * getQuantidade());
			setPrecoFinal( getPrecoVenda() - (getPrecoVenda() * 0.05));
			
		} else if ( getQuantidade() <= 5) {
			setPrecoVenda(
					getPrecoUnitario() * getQuantidade());
			setPrecoFinal( getPrecoVenda() - (getPrecoVenda() * 0.15));
			
		} else {
			setPrecoVenda(
					getPrecoUnitario() * getQuantidade());
			setPrecoFinal( getPrecoVenda() - (getPrecoVenda() * 0.30));
		}
		
		
		return getPrecoFinal();
	}

}
