package com.java;

import java.util.Scanner;

public class NumerosPositivos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = sc.nextInt();		
		
		if (num >= 0) {
		    System.out.println("Número positivo.");
		} else {
		    System.out.println("Número negativo.");
		}
		
		sc.close();
	}
}
