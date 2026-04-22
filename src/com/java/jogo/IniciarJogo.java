package com.java.jogo;

import java.util.Random;
import java.util.Scanner;

public class IniciarJogo {
	
	private Random rd = new Random();
	
	// Construtor padrão
	public IniciarJogo (){	
	}
	
	// Declarando atributos
	private int nivel;
	private int maxNumero;
	private int tentativas;
	private int numeroSecreto;
	
	// metodo - selecionar 
	public void iniciarJogo(Scanner sc){
		
		System.out.println("Escolha o nível:");
        System.out.println("1 - Fácil");
        System.out.println("2 - Médio");
        System.out.println("3 - Difícil");

        nivel = sc.nextInt();

        maxNumero = 0;
        tentativas = 0;

        switch (nivel) {
            case 1:
                maxNumero = 50;
                tentativas = 10;
                break;
            case 2:
                maxNumero = 100;
                tentativas = 7;
                break;
            case 3:
                maxNumero = 200;
                tentativas = 5;
                break;
            default:
                System.out.println("Nível inválido.");
                return;
        }

        numeroSecreto = rd.nextInt(maxNumero + 1);

        while (tentativas > 0) {

            System.out.println("Adivinhe o número entre 0 e " + maxNumero);
            int tentativaUsuario = sc.nextInt();
            tentativas--;

            if (tentativaUsuario == numeroSecreto) {
                System.out.println("Você acertou!");
                return;
            } else if (tentativaUsuario < numeroSecreto) {
                System.out.println("O número é maior.");
            } else {
                System.out.println("O número é menor.");
            }

            System.out.println("Restam " + tentativas + " tentativa(s).");
        }

        System.out.println("Você perdeu! O número era " + numeroSecreto);
		
	}

}
