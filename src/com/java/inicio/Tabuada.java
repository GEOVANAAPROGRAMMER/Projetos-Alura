package com.java.inicio;

import java.util.Scanner;

public class Tabuada {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		int num = sc.nextInt();
		int mult;
		
		for (int i = 1; i <= 10; i++) {
			mult = i * num;
			System.out.println(num +" x "+ i +" = "+  mult);
		}
		
		sc.close();
	}

}
