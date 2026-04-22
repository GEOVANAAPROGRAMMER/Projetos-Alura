package com.java.interfaces.produtos;

public class Servicos extends ProdutosEServicos implements Vendavel {

	    private int horas;

	    public int getHoras() {
	        return horas;
	    }

	    public void setHoras(int horas) {
	        this.horas = horas;
	    }

	    @Override
	    public double getCalcularPrecoFinal() {

	        setPrecoVenda( getPrecoUnitario() * horas);

	        // Condição específica para Serviço
	        if (getPrecoVenda() > 200) {
	            setDesconto(0.08);
	        }

	        if (horas > 5) {
	        	setDesconto(0.05);
	        }
	        setPrecoFinal(  getPrecoVenda() - ( getPrecoVenda() * getDesconto()));

	        return getPrecoFinal();
	    }

	}