
package com.java.jogo;

import java.util.Scanner;

public class TesteAdivinhacao {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
        char jogarNovamente = 'S';

        while (jogarNovamente == 'S' || jogarNovamente == 's') {

        	IniciarJogo IniciarJogo = new IniciarJogo();
        	IniciarJogo.iniciarJogo(sc);;

            System.out.println("Deseja jogar novamente? (S/N)");
            jogarNovamente = sc.next().charAt(0);
        }

        System.out.println("Fim de jogo.");
		sc.close();

	}
		
		
}
