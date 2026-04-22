package com.java.inicio;

import java.util.Scanner;

public class TesteParOuImpar {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		int num = sc.nextInt();
		
		if (num % 2== 0) {
			System.out.println("Número par.");
		}else {
			System.out.println("Número ímpar.");
		}
		
		sc.close();
		
	}
	

}
