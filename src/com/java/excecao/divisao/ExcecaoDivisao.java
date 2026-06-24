package com.java.excecao.divisao;

import java.util.Scanner;

public class ExcecaoDivisao {
	
	public static void main(String[] args) {
		int dividendo;
		int divisor;
		int result;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do dividendo:");
		dividendo = sc.nextInt();
		System.out.println("Digite o valor do divisor:");
		divisor = sc.nextInt();
		
		try {
			result = dividendo / divisor;
			System.out.println("Resultado: "+ result);
		}catch(ArithmeticException e) {
			System.out.println("Houve um erro! Não é possível dividir por 0:");
			System.out.println(e.getMessage());
		}finally {
			sc.close();
		}
	}

}
