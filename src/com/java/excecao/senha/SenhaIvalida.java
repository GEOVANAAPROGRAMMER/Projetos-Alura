package com.java.excecao.senha;

import java.util.Scanner;

public class SenhaIvalida {
	
	public static void main(String[] args) {
		String senha;
		
		System.out.println("Digite uma senha:");
		Scanner sc = new Scanner(System.in);
		senha = sc.nextLine();
		
		try {
			validarSenha(senha);
			System.out.println("Senha criada com sucesso!");
		} catch (SenhaInvalidaException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
			
}

	public static void validarSenha(String senha) {
		if(senha.length() < 8) {
			throw new SenhaInvalidaException("A senha deve ter pelo menos 8 caracteres.");
		}
	}
}