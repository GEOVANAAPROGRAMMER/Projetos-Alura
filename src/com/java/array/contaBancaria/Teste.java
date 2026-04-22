package com.java.array.contaBancaria;

import java.util.ArrayList;

public class Teste {
	
	public static void main(String[] args) {
		
		ArrayList<ContaBancaria> contas = new ArrayList<>();
		
		ContaBancaria c1 = new ContaBancaria(123, 40.98);
		ContaBancaria c2 = new ContaBancaria(456, 1950.98);
		ContaBancaria c3 = new ContaBancaria(789, 2684.98);
		ContaBancaria c4 = new ContaBancaria(102, 4572.47);
		ContaBancaria c5 = new ContaBancaria(365, 30.95);
		
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		contas.add(c4);
		contas.add(c5);
		
		ContaBancaria maior = contas.get(0);
		for (ContaBancaria item : contas) {
			if( item.getSaldo() > maior.getSaldo()) {
				maior = item;
			}
		}
		
		System.out.println("Conta com o maior saldo - Número: " + maior.getNumDaConta() +
                ", Saldo: " + maior.getSaldo());
		
	}

}
