package com.java.contaBancaria;

import java.util.Scanner;

public class SistemaBanco {
	
	private Conta conta;
	
	public SistemaBanco(Conta conta) {
        this.conta = conta;
    }

    public void iniciar() {

        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 4) {

            mostrarMenu();
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Saldo: R$ " + conta.getSaldo());
                    break;

                case 2:
                    System.out.println("Digite o valor:");
                    conta.receberValor(sc.nextDouble());
                    break;

                case 3:
                    System.out.println("Digite o valor:");
                    conta.transferirValor(sc.nextDouble());
                    break;

                case 4:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }
        
        System.out.println("Atendimento finalizado.");

        sc.close();
    }

    private void mostrarMenu() {
        System.out.println("\n1 - Consultar saldo");
        System.out.println("2 - Receber valor");
        System.out.println("3 - Transferir valor");
        System.out.println("4 - Sair");
    }
}

