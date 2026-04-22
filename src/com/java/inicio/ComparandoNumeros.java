package com.java.inicio;

import java.util.Scanner;

public class ComparandoNumeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int num1 = sc.nextInt();
		
		System.out.println("Digite outro número:");
		int num2 = sc.nextInt();
		
		if(num1 == num2) {
		    System.out.println("Os números são iguais. ");
		} else if (num1 != num2) {
		    System.out.println("Os números são diferentes. ");
		    if (num1 > num2) {
		        System.out.println("O primeiro número é maior que o segundo número.");
		    } else
		        System.out.println("O segundo número é maior que o primeiro número.");
		}
		
		sc.close();
	}
	
}
