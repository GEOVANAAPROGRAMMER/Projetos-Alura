package com.java.api.github;

public class ErroConsultaGitHubException extends RuntimeException {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ErroConsultaGitHubException(String mensagem) {
        super(mensagem);
    }
}