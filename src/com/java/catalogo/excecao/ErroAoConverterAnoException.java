package com.java.catalogo.excecao;

public class ErroAoConverterAnoException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mensagem;
	
	public ErroAoConverterAnoException(String mensagem) {
		this.mensagem = mensagem;
	}
	
	@Override
	public String getMessage() {
		return this.mensagem;
	}

}
