package com.java.heranca.conta;

public class Teste {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		
		cc.depositar(1000);
		cc.cobrarTarifaMensal(10);
		System.out.println(cc.consultarSaldo());
		
	}
	
}
