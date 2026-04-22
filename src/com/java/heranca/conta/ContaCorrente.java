package com.java.heranca.conta;

public class ContaCorrente extends ContaBancaria {
	
	public void cobrarTarifaMensal(double tarifaMensal) {
		saldo -= tarifaMensal;
	}
	
}
