package com.java.objetos;

import java.util.Scanner;

public class MenuAluno {
	
	private String nome;
	private double nota = 0;
	private int totalDeNotas = 0;
	private double media;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public double calculaMedia() {
		Scanner sc = new Scanner(System.in);
		
		while(nota != -1) {
			
			System.out.println("Digite a notas do aluno:"
					+ "Ao finalizar, digite -1.");
			nota = sc.nextDouble();
			nota += nota;
			totalDeNotas++;
		}
		media = nota/totalDeNotas;
		sc.close();
		
		System.out.println("Média final do aluno:");
		return media;
	}

}
