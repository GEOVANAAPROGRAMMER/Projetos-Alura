package com.java.inicio;

import java.util.Scanner;

public class FormulasGeometricas {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá! Escolha uma das opções abaixo para realizar o cálculo da área:");
		System.out.println("1 - Calcular área do quadrado");
		System.out.println("2 - Calcular área do círculo");
		
		int escolha = sc.nextInt();
		double lado;
		double raio;
		double area;
		
		switch(escolha) {
		case 1:
			System.out.println("Informe o tamanho do lado do quadrado em cm:");
			lado = sc.nextDouble();
			area = lado * lado;
			System.out.println("Área do quadrado: "+ area);
			break;
		case 2:
			System.out.println("Informe o tamanho do raio do circulo em cm:");
			raio = sc.nextDouble();
			area = (raio * raio) * Math.PI;
			System.out.println("Área do círculo: "+ area);
			break;
		default:
		    System.out.println("Opção inválida.");
		    break;
		}
		
		sc.close();
	}

}
